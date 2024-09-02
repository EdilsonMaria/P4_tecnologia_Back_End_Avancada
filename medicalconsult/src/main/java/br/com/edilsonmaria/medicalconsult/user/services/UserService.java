package br.com.edilsonmaria.medicalconsult.user.services;

import br.com.edilsonmaria.medicalconsult.user.domain.User;
import br.com.edilsonmaria.medicalconsult.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User cadastrarUser(User user) {
        return userRepository.save(user);
    }
}
