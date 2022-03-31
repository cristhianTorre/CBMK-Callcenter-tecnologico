package edu.escuelaing.ieti.cbmk.callcentertecnologico.service;


import org.springframework.beans.factory.annotation.Autowired;

import edu.escuelaing.ieti.cbmk.callcentertecnologico.Repository.taskRepository;
import edu.escuelaing.ieti.cbmk.callcentertecnologico.model.TaskModel;

public class Taskimpl implements Task {
	
	@Autowired
    private taskRepository taskRepository;

	@Override
	public TaskModel createTask(TaskModel task) {
		return taskRepository.save(task);
	}

}
