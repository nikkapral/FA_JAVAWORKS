package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer extends AuditModel {
    @Id
    @GeneratedValue(generator = "answer_generator")
    @SequenceGenerator(
            name = "answer_generator",
            sequenceName = "Answer_sequence",
            initialValue = 1000
    )

    private Long id;

    public Long getId() {
            return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(columnDefinition = "text")
    private String text;

    public String getText(){
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "quastion_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Quastion quastion;

    public Quastion getQuastion(){
        return quastion;
    }

    public void setQuastion(Quastion quastion){
        this.quastion = quastion;
    }









}












