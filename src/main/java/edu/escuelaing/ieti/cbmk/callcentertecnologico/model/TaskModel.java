package edu.escuelaing.ieti.cbmk.callcentertecnologico.model;

import java.sql.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
	public class TaskModel {
	    @Id
	    private String id;
	    private String iduser;
	    private String tecnicoId;
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
		
		public String getTecnicoId() {
			return tecnicoId;
		}
		public void setTecnicoId(String tecnicoId) {
			this.tecnicoId = tecnicoId;
		}
		public String getSkill() {
			return skill;
		}
		public void setSkill(String skill) {
			this.skill = skill;
		}
		public String getIduser() {
			return iduser;
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

	   
	    

	    
	    
	    

}
