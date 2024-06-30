package com.labs.lab_java_modeling_complex_relationships.repository;

import com.labs.lab_java_modeling_complex_relationships.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
