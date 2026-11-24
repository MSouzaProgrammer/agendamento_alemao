package dev.msouza.agenda_automotiva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.msouza.agenda_automotiva.entities.Client;

public interface ClientRespository extends JpaRepository<Client, Long>{

}
