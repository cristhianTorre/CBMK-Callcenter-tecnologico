package edu.escuelaing.ieti.cbmk.callcentertecnologico.service;

import java.util.List;
import java.util.Optional;

import edu.escuelaing.ieti.cbmk.callcentertecnologico.model.TaskModel;

public interface Task {

	public TaskModel createTask(TaskModel task) ;

	public List<TaskModel> AllTask();

	public  Optional<TaskModel> TaskbyId(String id);

}
