package dev.msouza.agenda_automotiva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.msouza.agenda_automotiva.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}
