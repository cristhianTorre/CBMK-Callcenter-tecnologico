package edu.escuelaing.ieti.cbmk.callcentertecnologico.controller.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.escuelaing.ieti.cbmk.callcentertecnologico.dto.TaskDTO;
import edu.escuelaing.ieti.cbmk.callcentertecnologico.model.TaskModel;
import edu.escuelaing.ieti.cbmk.callcentertecnologico.service.Task;
import edu.escuelaing.ieti.cbmk.callcentertecnologico.util.ObjectMapperUtils;


@Controller

public class CreateTaskController {
	
	@Autowired
	private Task taskservice;
	
	
	@RequestMapping(value = "/task/create", method = RequestMethod.POST)
    public ResponseEntity<?> createTask( @RequestBody TaskDTO taskdto){
        try {
            return new ResponseEntity<>(taskservice.createTask(ObjectMapperUtils.map(taskdto, TaskModel.class)), HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(false, HttpStatus.OK);
        }


    }
	

}
