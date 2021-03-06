package br.com.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.com.escola.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {

}
