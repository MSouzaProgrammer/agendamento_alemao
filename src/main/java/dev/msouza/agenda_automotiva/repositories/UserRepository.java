package dev.msouza.agenda_automotiva.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.msouza.agenda_automotiva.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
  Optional<User> findByUserName(String userName);
}
