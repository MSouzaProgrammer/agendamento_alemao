package dev.msouza.agenda_automotiva.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "clients")
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String number;
  @OneToMany(mappedBy = "client")
  private List<Vehicle> vehicles;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  public Client() {
  }

  public Client(Long id, String name, String number, List<Vehicle> vehicles, User user) {
    this.id = id;
    this.name = name;
    this.number = number;
    this.vehicles = vehicles;
    this.user = user;
  }

}
