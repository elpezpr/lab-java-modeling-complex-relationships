package com.labs.lab_java_modeling_complex_relationships.repository;

import com.labs.lab_java_modeling_complex_relationships.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
