package com.example.springtaskmgradvnc.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


import java.util.Date;

@Entity(name = "task")
public class TaskEntity extends BaseEntity{
    @Column(name = "title", nullable = false, length = 150)
    String title;
    @Column(name = "description", nullable = true, length = 500)
    String description;
    @Column(name = "completed", nullable = false, columnDefinition = "boolean default")
    Boolean completed;
    @Column(name = "dueDate", nullable = true)
    Date dueDate;
}
