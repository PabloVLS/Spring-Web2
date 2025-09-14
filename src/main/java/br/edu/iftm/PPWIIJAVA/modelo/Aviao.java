package br.edu.iftm.PPWIIJAVA.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Aviao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome; 
    private String modelo; 
    private String fabricante; 
    private String tipoMissao; 
    private double alcanceKm;
    private double velocidadeMax;
    private int tripulacao;

}
