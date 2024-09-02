package br.com.edilsonmaria.medicalconsult.user.resource;

import br.com.edilsonmaria.medicalconsult.user.domain.User;
import br.com.edilsonmaria.medicalconsult.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> cadastraUser(@RequestBody User user){
        User novoUser = userService.cadastrarUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUser);
    }
}
