package med.voll.api.domain.consulta.validacoes;

import java.time.DayOfWeek;

import jakarta.validation.ValidationException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

public class ValidadorHorarioFuncionamentoClinica {
    
    public void validar(DadosAgendamentoConsulta dados){
        var dataConsulta = dados.data();
        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaDaClinica = dataConsulta.getHour() < 7;
        var depoisDoEncerramentoDaClinica = dataConsulta.getHour() > 18;

        if(domingo || antesDaAberturaDaClinica || depoisDoEncerramentoDaClinica){
            throw new ValidationException("Consulta fora do Horário de funcionamento da clínicia");
        }
    }
}
