package io.github.mikaelgit.msclientes.infra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.mikaelgit.msclientes.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    Optional<Cliente> findByCpf(String cpf);
}