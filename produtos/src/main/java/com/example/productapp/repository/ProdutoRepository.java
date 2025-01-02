package com.example.productapp.repository;

import com.example.productapp.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Método para buscar todos os produtos ordenados pelo valor (menor para o maior)
    List<Produto> findAllByOrderByValorAsc();
}
