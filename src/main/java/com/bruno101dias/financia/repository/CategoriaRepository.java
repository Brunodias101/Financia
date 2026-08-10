package com.bruno101dias.financia.repository;

import com.bruno101dias.financia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
