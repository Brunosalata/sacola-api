package me.dio.sacola.repository;

import me.dio.sacola.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repositories são Interfaces, não classes, que vão permitir a conexão com o banco de dados
@Repository      //Anotação que diz que essa interface se comunica com o BD
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
                    //extends da interface JpaRepository, pegando o objeto Restaurante, com primary key do tipo Long
}
