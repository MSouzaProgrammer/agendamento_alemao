package dev.msouza.agenda_automotiva.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter 
@Setter
@Table (name = "vehicles")
public class Vehicle {
  
  @Id 
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne
  private Client client;
  private String licensePlate;
  private String model;

  public Vehicle() {}
  public Vehicle(Long id, Client client, String licensePlate, String model) {
    this.id = id;
    this.client = client;
    this.licensePlate = licensePlate;
    this.model = model;
  }
}
