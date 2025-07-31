package project.moonki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.moonki.entity.MUser;

import java.util.Optional;

public interface MuserRepository extends JpaRepository<MUser, Long> {
    Optional <MUser> findByUserId(String userId);
    boolean existsByUserId(String userId);
}
