package com.example.springtaskmgradvnc.Entities;

import jakarta.persistence.Id;

public abstract class BaseEntity {
    @Id
    private Integer id;
}
