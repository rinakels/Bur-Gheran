package com.rinalyn.Bur_Gheran.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rinalyn.Bur_Gheran.Model.UserModel;

@RestController

public class UserController {

    //http:localhost:8080/user
    @GetMapping("/user")
    public UserModel getUser(){
        return new UserModel(1, "jeven 11","jeven.11@email.com","jeven11");

    }
    
}
