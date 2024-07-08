package com.rinalyn.Bur_Gheran.Service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rinalyn.Bur_Gheran.Model.UserAuth;
import com.rinalyn.Bur_Gheran.Repository.UserAuthRepository;

@Service
public class CustomUserAuthDetailService implements UserDetailsService{
    private final UserAuthRepository userAuthRepository;

    public CustomUserAuthDetailService(UserAuthRepository userAuthRepository){
        this.userAuthRepository = userAuthRepository;
    }


   @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException{
        UserAuth users = userAuthRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
            .orElseThrow(() ->
                new UsernameNotFoundException("User not found with username or email" + usernameOrEmail));

            Set<GrantedAuthority> authorities = users

                .getRoles()
                .stream()
                .map((role) -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toSet());

            return new org.springframework.security.core.userdetails.User(
                users.getEmail(), 
                users.getPassword(), 
                authorities
                );
         }
    }

