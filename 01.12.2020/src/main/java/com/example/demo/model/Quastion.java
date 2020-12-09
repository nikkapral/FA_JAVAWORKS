package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "quastions")
public class Quastion extends AuditModel {
    @Id
    @GeneratedValue(generator = "quastion_generator")
    @SequenceGenerator(
            name = "quastion_generator",
            sequenceName = "Quastion_sequence",
            initialValue = 1000
    )
    private long id;

    @Column(columnDefinition = "text")
    private String title;

    @Column(columnDefinition = "text")
    private String description;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle(){
        return title:
    }

    @Override
    public String toString() {
        return "Quastion{" +
                "id = " + id +
                ",title='" + title + '\'' +
                ", description = '" + description + '\'' +
                "}";
    }
}
