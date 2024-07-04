package com.rinalyn.Bur_Gheran.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rinalyn.Bur_Gheran.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);

}
