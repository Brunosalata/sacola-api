package me.dio.sacola.repository;

import me.dio.sacola.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repositories são Interfaces, não classes, que vão permitir a conexão com o banco de dados
@Repository      //Anotação que diz que essa interface se comunica com o BD
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
                    //extends da interface JpaRepository, pegando o objeto Produto, com primary key do tipo Long
}
