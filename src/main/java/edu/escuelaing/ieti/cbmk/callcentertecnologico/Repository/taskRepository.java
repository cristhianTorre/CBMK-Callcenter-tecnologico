package edu.escuelaing.ieti.cbmk.callcentertecnologico.Repository;
import edu.escuelaing.ieti.cbmk.callcentertecnologico.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface taskRepository extends MongoRepository<TaskModel, String> {

}
