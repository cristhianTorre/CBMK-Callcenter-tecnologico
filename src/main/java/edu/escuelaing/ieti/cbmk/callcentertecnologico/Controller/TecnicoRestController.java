package edu.escuelaing.ieti.cbmk.callcentertecnologico.Controller;


import edu.escuelaing.ieti.cbmk.callcentertecnologico.dto.TecnicoDTO;
import edu.escuelaing.ieti.cbmk.callcentertecnologico.model.Tecnico;
import edu.escuelaing.ieti.cbmk.callcentertecnologico.util.ObjectMapperUtils;
import edu.escuelaing.ieti.cbmk.callcentertecnologico.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author Brayan Alexis Jiménez Moya
 */
@RestController
@RequestMapping("/students")
public class TecnicoRestController {

    @Autowired
    private TecnicoService tecnicoService;

    @GetMapping(value = "/")
    public List<TecnicoDTO> getAllStudents() {
        return ObjectMapperUtils.mapAll(tecnicoService.findAll(), TecnicoDTO.class);
    }

    @GetMapping(value = "/byStudentNumber/{studentNumber}")
    public TecnicoDTO getStudentByStudentNumber(@PathVariable("studentNumber") int tecnicoId) {
        return ObjectMapperUtils.map(tecnicoService.findByTecnicoNumber(tecnicoId), TecnicoDTO.class);
    }

    @GetMapping(value = "/byEmail/{email}")
    public TecnicoDTO getStudentByEmail(@PathVariable("email") String email) {
        return ObjectMapperUtils.map(tecnicoService.findByEmail(email), TecnicoDTO.class);
    }

    @GetMapping(value = "/orderByGpa")
    public List<TecnicoDTO> findAllByOrderByGpaDesc() {
        return ObjectMapperUtils.mapAll(tecnicoService.findAllByOrderByGpaDesc(), TecnicoDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody TecnicoDTO tecnicoDTO) {
        tecnicoService.saveOrUpdateTecnico(ObjectMapperUtils.map(tecnicoDTO, Tecnico.class));
        return new ResponseEntity("Student added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{studentNumber}")
    public ResponseEntity<?> deleteStudentByStudentNumber(@PathVariable int tecnicoId) {
        tecnicoService.deleteTecnicoById(tecnicoService.findByTecnicoNumber(tecnicoId).getId());
        return new ResponseEntity("Student deleted successfully", HttpStatus.OK);
    }

}