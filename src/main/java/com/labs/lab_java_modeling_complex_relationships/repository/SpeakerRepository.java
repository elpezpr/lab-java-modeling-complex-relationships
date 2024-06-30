package com.labs.lab_java_modeling_complex_relationships.repository;

import com.labs.lab_java_modeling_complex_relationships.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
