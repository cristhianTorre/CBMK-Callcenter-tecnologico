package edu.escuelaing.ieti.cbmk.callcentertecnologico.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

/**
 * @author Brayan Alexis Jiménez Moya
 */
@Document(collection = "tecnicos")
public class Tecnico {
    @Id
    private String id;
    private String name;
    private Integer score;
    private String email;
    private String skill;
    private String activate;
    public Tecnico() {
    }

    public Tecnico(String name, int score, String email, String skill, String activate) {
        this.name = name;
        this.score = score;
        this.email = email;
        this.skill = skill;
        this.activate = activate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkilList() {
        return skill;
    }

    public void setSkilList(List<String> skilList) {
        this.skill = skill;
    }

    public String getActivate() {return activate;}

    public void setActivate(String activate) {this.activate = activate;}



    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", studentNumber=" + score +
                ", email='" + email + '\'' +
                ", courseList=" + skill +
                '}';
    }
}
