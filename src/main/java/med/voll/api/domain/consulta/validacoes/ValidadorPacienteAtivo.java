package med.voll.api.domain.consulta.validacoes;

import jakarta.validation.ValidationException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.medico.MedicoRepository;
import med.voll.api.domain.paciente.PacienteRepository;

public class ValidadorPacienteAtivo {
    
     private PacienteRepository repository;
    
     public void validar(DadosAgendamentoConsulta dados){
     
        var pacienteEstaAtivo = repository.findAtivoById(dados.idMedico());
        if(!pacienteEstaAtivo){
            throw new ValidationException("Consulta não pode ser agendada com paciente excluído");
        }
    }
}
