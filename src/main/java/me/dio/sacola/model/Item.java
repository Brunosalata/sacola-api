package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor            //essa anotação substitui a criação do construtor contendo todos os argumentos
@Builder                       //cria a sacola Builder, padrão do design patterns (ajuda na criação do objeto)
@Data
//Substitui a criação dos métodos getters e setters (do lombok), além dos métodos Equals e HashCode para fazer comparações
@Entity                        //Faz com que essa classe (Restaurante) se torne uma tabela no banco de dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})  //Ignora erros indicados no código, por estarmos usando hibernateLazy (preguiçoso)
@NoArgsConstructor             //essa anotação substitui a criação do construtor vazio
public class Item {

    @Id         //indica que esse elemento é a primary key
    @GeneratedValue(strategy = GenerationType.AUTO)     //indica a forma como os id serão gerados (em sequencia, automaticamente)
    private Long id;
    @OneToOne
    private Produto produto;
    private int quantidade;
    @ManyToOne
    @JsonIgnore
    private Sacola sacola;
}
