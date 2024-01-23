package group.zootopia.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import group.zootopia.backend.models.Animal;

@Repository

public interface AnimalRepository extends JpaRepository<Animal, Long> {
  
}