package edu.escuelaing.ieti.cbmk.callcentertecnologico.dto;

import java.sql.Date;

public class TaskDTO {
	private String tecnicoId;
	private String id;
	private String iduser;
	private String email;
    private String comentario;
    private Date fechaCreacion;
    private String skill;
    
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getIduser() {
		return iduser;
	}
	
	
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public void setIduser(String iduser) {
		this.iduser = iduser;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getTecnicoId() {
		return tecnicoId;
	}
	public void setTecnicoId(String tecnicoId) {
		this.tecnicoId = tecnicoId;
	}
	
	
    



	
}
