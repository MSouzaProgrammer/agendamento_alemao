package dev.msouza.agenda_automotiva.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

  @Id 
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String userName;
  private String password;
  private String name;
  @OneToMany(mappedBy = "user")
  private List<Client>clients;
  public User() {}
  public User(Long id, String userName, String password, String name, List<Client> clients) {
    this.id = id;
    this.userName = userName;
    this.password = password;
    this.name = name;
    this.clients = clients;
  }
}
