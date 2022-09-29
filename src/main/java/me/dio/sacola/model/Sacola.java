package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.sacola.enumeration.FormaPagamento;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor            //essa anotação substitui a criação do construtor contendo todos os argumentos
@Builder                       //cria a sacola Builder, padrão do design patterns (ajuda na criação do objeto)
@Data                          //Substitui a criação dos métodos getters e setters (do lombok), além dos métodos Equals e HashCode para fazer comparações
@Entity                        //Faz com que essa classe (Restaurante) se torne uma tabela no banco de dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})  //Ignora erros indicados no código, por estarmos usando hibernateLazy (preguiçoso)
@NoArgsConstructor             //essa anotação substitui a criação do construtor vazio

public class Sacola {

    @Id         //indica que esse elemento é a primary key
    @GeneratedValue(strategy = GenerationType.AUTO)     //indica a forma como os id serão gerados (em sequencia, automaticamente)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> itens;
    private Double valorTotal;

    @Enumerated
    private FormaPagamento formaPagamento;
    private boolean fechada;


}
