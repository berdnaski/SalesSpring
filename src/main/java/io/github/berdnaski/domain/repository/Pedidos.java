package io.github.berdnaski.domain.repository;

import io.github.berdnaski.domain.entity.Cliente;
import io.github.berdnaski.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByCliente(Cliente cliente);
}
