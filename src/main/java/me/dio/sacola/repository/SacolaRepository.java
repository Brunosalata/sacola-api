package me.dio.sacola.repository;


import me.dio.sacola.model.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repositories são Interfaces, não classes, que vão permitir a conexão com o banco de dados
@Repository      //Anotação que diz que essa interface se comunica com o BD
public interface SacolaRepository extends JpaRepository<Sacola, Long> {
                    //extends da interface JpaRepository, pegando o objeto Sacola, com primary key do tipo Long

}
