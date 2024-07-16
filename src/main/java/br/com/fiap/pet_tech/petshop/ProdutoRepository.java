package br.com.fiap.pet_tech.petshop;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
}
