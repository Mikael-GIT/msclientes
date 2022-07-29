package io.github.mikaelgit.msclientes.services;

import java.util.Optional;

import io.github.mikaelgit.msclientes.domain.Cliente;

public interface ClienteService {
    
    public Cliente save(Cliente cliente);

    public Optional<Cliente> findById(Long id);

    public Optional<Cliente> findByCpf(String id);
}