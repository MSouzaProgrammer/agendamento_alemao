package dev.msouza.agenda_automotiva.entities;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import dev.msouza.agenda_automotiva.enuns.Role;
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
public class User implements UserDetails {

  @Id 
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String userName;
  private String password;
  private String name;
  private Role role;
  @OneToMany(mappedBy = "user")
  private List<Client>clients;
  public User() {}
  
  public User(Long id, String userName, String password, String name, Role role, List<Client> clients) {
    this.id = id;
    this.userName = userName;
    this.password = password;
    this.name = name;
    this.role = role;
    this.clients = clients;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return List.of(new SimpleGrantedAuthority(role.name()));
  }

  @Override
  public String getUsername() {
    return userName;
  }
}
