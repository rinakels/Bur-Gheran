package com.rinalyn.Bur_Gheran.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rinalyn.Bur_Gheran.Model.UserModel;

@RestController

public class UserController {

    //Fetch One Data
    //http:localhost:8080/user
    @GetMapping("/user")
    public UserModel getUser(){
        return new UserModel(1, "jeven 11","jeven.11@email.com","jeven11");

    }
    
    //Fetch Multiple Data
    //http://localhost:8080/users
    @GetMapping("/users")
    public List<UserModel> getUsers(){
        List<UserModel> users = new ArrayList<>();
        users.add(new UserModel(1, "Mario", "mario@gmail.com", "Mario"));
        users.add(new UserModel(2, "Luigi", "luigi@gmail.com", "luigi"));
        users.add(new UserModel(3, "Yoshi", "yoshi@gmail.com", "yoshi"));
        users.add(new UserModel(4, "tania", "tania@gmail.com", "tania"));
        return users;


    }

    //http:localhost:8080/user/edward
    @GetMapping("/user/{name}")
    public UserModel getUserFromName(@PathVariable("name")String name){
        return new UserModel(1, "Edward", "edward@gmail.com", "edward");
    }

    
}
 