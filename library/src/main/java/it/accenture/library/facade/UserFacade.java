package it.accenture.library.facade;

import it.accenture.library.rto.UserRTO;
import it.accenture.library.service.UserService;
import it.accenture.library.to.UserTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFacade {
    @Autowired
    private UserService userService;

    public List<UserRTO> findAllUsers(){
        return userService.findAllUsers();
    }

    public UserRTO findAllUserById(long id){
        return userService.findAllUserById(id);
    }

    public Long addUser(UserTO userTO){
        return userService.addUser(userTO);
    }
}
