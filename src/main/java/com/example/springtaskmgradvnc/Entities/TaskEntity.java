package com.example.springtaskmgradvnc.Entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity(name="tasks")
public class TaskEntity extends BaseEntity {

    @Column(name = "title", nullable = false, length = 150)
    String title;
    @Column(name = "description", nullable = true, length = 1000)
    String description;
    @Column(name = "completed", nullable = false, columnDefinition = "boolean default false")
    Boolean completed;
    @Column(name = "due_Date",nullable = true  )
    Date dueDate;

    @OneToMany(mappedBy = "task")
    List<NoteEntity> notes; 
}

