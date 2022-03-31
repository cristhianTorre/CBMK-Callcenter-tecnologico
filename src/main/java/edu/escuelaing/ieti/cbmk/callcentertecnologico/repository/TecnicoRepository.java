package edu.escuelaing.ieti.cbmk.callcentertecnologico.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import edu.escuelaing.ieti.cbmk.callcentertecnologico.model.Tecnico;
import java.util.List;

/**
 * @author Brayan Alexis Jiménez Moya
 */

// No need implementation, just one interface, and you have CRUD, thanks Spring Data!
public interface TecnicoRepository extends MongoRepository<Tecnico, String> {

    Tecnico findByTecnicoNumber(int tecnicoId);

    Tecnico findByEmail(String email);

    List<Tecnico> findAllByOrderByGpaDesc();

}