package med.voll.api.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroUsuario(

        @NotBlank(message = "{email.obrigatorio}")
        @Email(message = "{email.invalido}")
        String login,

        @NotNull
        String senha
) {
}
