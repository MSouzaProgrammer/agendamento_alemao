package dev.msouza.agenda_automotiva.entities;

import dev.msouza.agenda_automotiva.enuns.Schedules;
import dev.msouza.agenda_automotiva.enuns.TypeOfWash;
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
@Table(name = "agendas")
public class Agenda {

  @Id 
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne
  private Client client;

  @ManyToOne
  private Vehicle vehicle;
  private Schedules schedules;
  private TypeOfWash typeOfWash;

  public Agenda() {}
  public Agenda(Long id, Client client, Vehicle vehicle, Schedules schedules, TypeOfWash typeOfWash) {
    this.id = id;
    this.client = client;
    this.vehicle = vehicle;
    this.schedules = schedules;
    this.typeOfWash = typeOfWash;
  }
}
