package med.voll.api.domain.consulta.validacoes;

import java.time.DayOfWeek;

import jakarta.validation.ValidationException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.medico.MedicoRepository;

public class ValidadorMedicoAtivo {

    private MedicoRepository repository;
    
     public void validar(DadosAgendamentoConsulta dados){
        // escolha do medico opcional
        if(dados.idMedico() == null){
            return;
        }

        var medicoEstaAtivo = repository.findAtivoById(dados.idMedico());
        if(!medicoEstaAtivo){
            throw new ValidationException("Consulta não pode ser agendada com médico excluído");
        }
    }
}
