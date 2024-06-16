package uce.edu.ec.PersistenciaJPA.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Career {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "duration")
    private int duration;

    @OneToMany(mappedBy = "career")
    List<Classes> classlist;



    public Career() {
    }

    public Career(long id, String name, String description, List<Classes> classlist, int duration) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.classlist = classlist;
        this.duration = duration;
    }

    public List<Classes> getClasslist() {
        return classlist;
    }

    public void setClasslist(List<Classes> classlist) {
        this.classlist = classlist;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Career{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + ", duration=" + duration + '}';
    }
}
