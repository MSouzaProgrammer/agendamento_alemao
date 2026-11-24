package dev.msouza.agenda_automotiva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.msouza.agenda_automotiva.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
