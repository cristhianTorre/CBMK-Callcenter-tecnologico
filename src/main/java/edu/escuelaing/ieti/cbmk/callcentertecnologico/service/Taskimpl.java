package edu.escuelaing.ieti.cbmk.callcentertecnologico.service;


import org.springframework.beans.factory.annotation.Autowired;

import edu.escuelaing.ieti.cbmk.callcentertecnologico.Repository.taskRepository;
import edu.escuelaing.ieti.cbmk.callcentertecnologico.model.TaskModel;

public class Taskimpl implements Task {
	
	@Autowired
    private taskRepository taskRepository;
	private TecnicoService TecnicoService;

	@Override
	public TaskModel createTask(TaskModel task) {
		String eleccionTecnico = escogerTecnico(task);
		task.setTecnicoId(eleccionTecnico);
		return taskRepository.save(task);
	}

	private String escogerTecnico(TaskModel task) {
		List<Tecnico> tecnicos = TecnicoService.findAll();
		for (Tecnico tecnico : tecnicos) {
			if (tecnico.getSkill() = task.getSkill() && tecnico.getActivate().equals("A")) {
				return tecnico.getId();
			}
			
		}
	}

}
