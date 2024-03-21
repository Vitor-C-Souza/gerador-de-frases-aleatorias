package br.com.vitor_project.gerador_de_frases_aleatorias.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "frases")
public class frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public frase() {}    
    public frase(String titulo, String frase, String personagem, String poster) {
        this.titulo = titulo;
        this.frase = frase;        
        this.personagem = personagem;
        this.poster = poster;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getFrase() {
        return frase;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
    public String getPersonagem() {
        return personagem;
    }
    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }
    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
    
    @Override
    public String toString() {
        return "frase [titulo=" + titulo + ", frase=" + frase + ", personagem=" + personagem + ", poster=" + poster
                + "]";
    }
}
