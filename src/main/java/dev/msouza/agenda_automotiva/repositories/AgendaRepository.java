package dev.msouza.agenda_automotiva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.msouza.agenda_automotiva.entities.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{

}
