package edu.escuelaing.ieti.cbmk.callcentertecnologico.dto;

import java.util.List;

/**
 * @author Brayan Alexis Jiménez Moya
 */
public class TecnicoDTO {

    private String id;
    private String name;
    private Integer score;
    private String email;
    private List<String> skilList;

    public TecnicoDTO() {
    }

    public TecnicoDTO(String name, int score, String email, List<String> skilList) {
        this.name = name;
        this.score = score;
        this.email = email;
        this.skilList = skilList;
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

    public List<String> getSkilList() {
        return skilList;
    }

    public void setSkilList(List<String> skilList) {
        this.skilList = skilList;
    }

}
