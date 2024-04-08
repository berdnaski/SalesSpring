package io.github.berdnaski.domain.repository;

import io.github.berdnaski.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}