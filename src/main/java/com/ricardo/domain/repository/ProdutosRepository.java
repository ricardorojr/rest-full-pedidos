package com.ricardo.domain.repository;

import com.ricardo.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produto,Integer> {
}
