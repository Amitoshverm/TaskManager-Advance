package com.example.springtaskmgradvnc.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity (name = "notes")
public class NoteEntity extends BaseEntity{
    @Column(name = "body", nullable = false, length = 200)
    String body;

    @ManyToOne( )
    TaskEntity task;

}
