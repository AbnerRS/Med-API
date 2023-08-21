package med.voll.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}