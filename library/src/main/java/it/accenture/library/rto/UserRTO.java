package it.accenture.library.rto;

import it.accenture.library.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserRTO {
    private String nome;
    private String cognome;

    public UserRTO(User user){
        this.nome = user.getNome();
        this.cognome = user.getCognome();
    }

    public UserRTO(){}


}
