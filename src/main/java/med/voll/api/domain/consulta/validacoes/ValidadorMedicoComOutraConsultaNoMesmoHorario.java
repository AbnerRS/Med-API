package med.voll.api.domain.consulta.validacoes;

import jakarta.validation.ValidationException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

public class ValidadorMedicoComOutraConsultaNoMesmoHorario {

    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var medicoPossuiOutraConsultaNoMesmoHorario = repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
        if(medicoPossuiOutraConsultaNoMesmoHorario){
            throw new ValidationException("Médico Já possui outra consulta agendada nesse mesmo horário");
        }
    }
    
}
