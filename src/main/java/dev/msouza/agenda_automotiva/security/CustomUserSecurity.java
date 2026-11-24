package dev.msouza.agenda_automotiva.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import dev.msouza.agenda_automotiva.repositories.UserRepository;

public class CustomUserSecurity implements UserDetailsService{

  private final UserRepository userRepository;

  public CustomUserSecurity(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    return userRepository.findByUserName(userName).orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado!"));
  }
  
}
