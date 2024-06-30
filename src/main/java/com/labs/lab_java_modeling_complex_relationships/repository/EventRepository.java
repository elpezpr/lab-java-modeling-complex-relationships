package com.labs.lab_java_modeling_complex_relationships.repository;

import com.labs.lab_java_modeling_complex_relationships.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
