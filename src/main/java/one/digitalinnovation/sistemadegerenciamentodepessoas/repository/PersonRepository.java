package one.digitalinnovation.sistemadegerenciamentodepessoas.repository;

import one.digitalinnovation.sistemadegerenciamentodepessoas.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
