package com.techbank.TechBank.repository;

import com.techbank.TechBank.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Busca por id
    Optional<Usuario> findById(Long id);

    // Busca por email
    Optional<Usuario> findByEmail(String email);

    // Busca por idade maior que
    List<Usuario> findByIdadeGreaterThan(int idade);

    // Verifica se existe por email
    boolean existsByEmail(String email);

    // Verifica se existe por id.
    boolean existsById(Long id);

    // Conta usuários por idade
    long countByCidade(int idade);

    // Busca ordenado por nome
    List<Usuario> findAllByOrderByNomeAsc();
}
