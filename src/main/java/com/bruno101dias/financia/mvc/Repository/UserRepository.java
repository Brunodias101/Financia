package com.bruno101dias.financia.mvc.Repository;


import com.bruno101dias.financia.mvc.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {
}
