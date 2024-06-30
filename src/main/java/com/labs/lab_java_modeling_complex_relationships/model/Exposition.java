package com.labs.lab_java_modeling_complex_relationships.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Exposition extends Event {
    public Exposition() {
    }
}
