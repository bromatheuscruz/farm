package com.roomator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JPA Specific Extension of {@link org.springframework.data.repository.Repository}
 * JpaRepository has method that allow CRUD operations etc.
 * CRUD - Create, Read, Update and Delete
 */
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {}
