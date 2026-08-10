package com.bruno101dias.financia.service;

import com.bruno101dias.financia.exception.CategoriaNotFoundException;
import com.bruno101dias.financia.model.Categoria;
import com.bruno101dias.financia.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> listarTodos() {
        return categoriaRepository.findAll();
    }

    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id).orElseThrow(() -> new CategoriaNotFoundException(id));
    }
    public Categoria atualizar(Long id, Categoria categoria) {
        Categoria categoriaExistente = buscarPorId(id);

        categoriaExistente.setNome(categoria.getNome());

        return categoriaRepository.save(categoriaExistente);
    }

    public void excluir(Long id) {
        Categoria categoria = buscarPorId(id);

        categoriaRepository.delete(categoria);
    }

}
