package edu.escuelaing.ieti.cbmk.callcentertecnologico.service.impl;

import edu.escuelaing.ieti.cbmk.callcentertecnologico.model.Tecnico;
import edu.escuelaing.ieti.cbmk.callcentertecnologico.repository.TecnicoRepository;
import edu.escuelaing.ieti.cbmk.callcentertecnologico.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Brayan Alexis Jiménez Moya
 */
@Service
public class TecnicoServiceImpl implements TecnicoService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Override
    public List<Tecnico> findAll() {
        return tecnicoRepository.findAll();
    }

    @Override
    public Tecnico findByTecnicoNumber(int tecnicoId) {
        return null;
    }


    @Override
    public Tecnico findByEmail(String email) {
        return tecnicoRepository.findByEmail(email);
    }

    @Override
    public List<Tecnico> findAllByOrderByGpaDesc() {
        return tecnicoRepository.findAllByOrderByGpaDesc();
    }

    @Override
    public Tecnico saveOrUpdateTecnico(Tecnico tecnico) {
        return tecnicoRepository.save(tecnico);
    }

    @Override
    public void deleteTecnicoById(String id) {
        tecnicoRepository.deleteById(id);
    }
}