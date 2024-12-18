package com.groudi.demo.paciente;

import com.groudi.demo.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPacientes(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
