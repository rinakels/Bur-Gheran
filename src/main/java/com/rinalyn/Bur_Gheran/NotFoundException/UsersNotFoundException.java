package com.rinalyn.Bur_Gheran.NotFoundException;

public class UsersNotFoundException extends RuntimeException {
    public UsersNotFoundException(Long id){
        super("Could not Found users with " + id);

    }

}
