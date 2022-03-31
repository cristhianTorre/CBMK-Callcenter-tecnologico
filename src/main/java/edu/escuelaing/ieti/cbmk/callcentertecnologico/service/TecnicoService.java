package edu.escuelaing.ieti.cbmk.callcentertecnologico.service;


import edu.escuelaing.ieti.cbmk.callcentertecnologico.model.Tecnico;
import java.util.List;

/**
 * @author Brayan Alexis Jiménez Moya
 */
public interface TecnicoService {

    List<Tecnico> findAll();

    Tecnico findByTecnicoNumber(int tecnicoId);

    Tecnico findByEmail(String email);

    List<Tecnico> findAllByOrderByGpaDesc();

    Tecnico saveOrUpdateTecnico(Tecnico tecnico);

    void deleteTecnicoById(String id);

}