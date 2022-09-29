package me.dio.sacola.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor            //essa anotação substitui a criação do construtor contendo todos os argumentos
@Builder                       //cria a sacola Builder, padrão do design patterns (ajuda na criação do objeto)
@Data                          //Substitui a criação dos métodos getters e setters (do lombok), além dos métodos Equals e HashCode para fazer comparações
@Embeddable                    //Indica que a classe Endereço não será uma tabela no BD, mas será uma coluna de outra tabela, na qual Endereço deverá ter a anotação @Embedded
@NoArgsConstructor             //essa anotação substitui a criação do construtor vazio
public class Endereco {

    private String cep;
    private String complemento;
}
