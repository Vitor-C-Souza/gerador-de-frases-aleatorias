package br.com.vitor_project.gerador_de_frases_aleatorias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.vitor_project.gerador_de_frases_aleatorias.model.frase;

public interface fraseRepository extends JpaRepository<frase, Long> {
    
    @Query("SELECT f FROM frase f order by function('RANDOM') LIMIT 1")
    frase fraseAleatoria();
}
