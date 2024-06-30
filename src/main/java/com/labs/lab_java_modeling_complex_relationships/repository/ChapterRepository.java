package com.labs.lab_java_modeling_complex_relationships.repository;

import com.labs.lab_java_modeling_complex_relationships.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}
