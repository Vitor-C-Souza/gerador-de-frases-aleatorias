package br.com.vitor_project.gerador_de_frases_aleatorias.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vitor_project.gerador_de_frases_aleatorias.dto.fraseDTO;
import br.com.vitor_project.gerador_de_frases_aleatorias.model.frase;
import br.com.vitor_project.gerador_de_frases_aleatorias.repository.fraseRepository;

@Service
public class fraseService {
    
    @Autowired
    fraseRepository repositorio;

    public fraseDTO obterFraseAleatoria(){
        frase Frase = repositorio.fraseAleatoria();         

        return new fraseDTO(Frase.getId(), Frase.getTitulo(), Frase.getFrase(), Frase.getPersonagem(), Frase.getPoster());
    }    
}
