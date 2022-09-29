package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import me.dio.sacola.enumeration.FormaPagamento;

import javax.persistence.*;
import java.util.List;

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private double valorUnitario;
    @Builder.Default
    private Double valorTotal;
    @ManyToOne
    @JsonIgnore
    private Restaurante restaurante;



}
