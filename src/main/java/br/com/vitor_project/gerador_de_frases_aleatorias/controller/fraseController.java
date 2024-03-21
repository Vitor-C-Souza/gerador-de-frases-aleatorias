package br.com.vitor_project.gerador_de_frases_aleatorias.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.vitor_project.gerador_de_frases_aleatorias.dto.fraseDTO;
import br.com.vitor_project.gerador_de_frases_aleatorias.service.fraseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class fraseController {

    @Autowired
    private fraseService service;

    @GetMapping("/series/frases")    
    public fraseDTO obterFrase(){        
        return service.obterFraseAleatoria();
    }
}
