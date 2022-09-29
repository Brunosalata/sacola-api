package me.dio.sacola.repository;

import me.dio.sacola.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repositories são Interfaces, não classes, que vão permitir a conexão com o banco de dados
@Repository      //Anotação que diz que essa interface se comunica com o BD
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
                        //extends da interface JpaRepository, pegando o objeto Cliente, com primary key do tipo Long
}
