package com.labs.lab_java_modeling_complex_relationships.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.ArrayList;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Conference extends Event{
    @OneToMany
    private List<Speaker> speakers = new ArrayList<>();

    public Conference() {
    }

    public Conference(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "speakers=" + speakers +
                '}';
    }
}
