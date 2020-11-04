package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill<job> extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    @NotBlank
    @Size(max=500, message="Description too long!")
    private String description;

    public Skill(String description){
        this.description=description;
    }

    public Skill(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}