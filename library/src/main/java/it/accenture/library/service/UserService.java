package it.accenture.library.service;

import it.accenture.library.entity.User;
import it.accenture.library.repository.UserRepository;
import it.accenture.library.rto.UserRTO;
import it.accenture.library.to.UserTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserRTO> findAllUsers(){
        List<User> users = userRepository.findAllUsers();

        List<UserRTO> usersRTO = new ArrayList<>();

        for(User user : users){
            UserRTO userRTO = new UserRTO();
            userRTO.setNome(user.getNome());
            userRTO.setCognome(user.getCognome());
            usersRTO.add(userRTO);

        }
        return usersRTO;
    }
    public UserRTO findAllUserById(long id){
        User user = userRepository.findBookById(id);
        return new UserRTO(user);
    }

    public Object saveUser(UserTO user){
        User userToSave = new User(user);
        Long id = userRepository.save(userToSave).getId();
        return id;
    }

    public Long addUser(UserTO userTo){
        User user = new User(userTo);
        userRepository.save(user);
        return  user.getId();
    }
}
