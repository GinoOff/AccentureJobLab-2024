package it.accenture.library.to;

import it.accenture.library.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserTO {
    @NonNull
    private String nome;
    private String congome;

    public UserTO(User user) {
        this.nome = user.getNome();
        this.congome = user.getCognome();
    }

    public UserTO(){}
}
