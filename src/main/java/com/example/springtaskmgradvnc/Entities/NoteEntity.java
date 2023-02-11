package com.example.springtaskmgradvnc.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "notes")
public class NoteEntity {
    @Column(name = "body", )
    String body;
}
