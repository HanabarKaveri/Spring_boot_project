package com.example.minor1.services;

import com.example.minor1.entities.Register;
import com.example.minor1.entities.Login;
import com.example.minor1.repository.LoginRepository;
import com.example.minor1.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private RegisterRepository registerRepository;

    public List<Login> getAllLogin() {
        return loginRepository.findAll();
    }

    public Login addLogin(Login login) {
        return loginRepository.save(login);
    }

    public boolean validateLogin(String emailid, String password) {
        return registerRepository.findById(emailid)
                .map(register -> register.getPassword().equals(password))
                .orElse(false);
    }

    public boolean loginUser(String emailid, String password) {
        if (validateLogin(emailid, password)) {
            Login login = new Login(emailid, password);
            addLogin(login);
            return true;
        }
        return false;
    }
}
