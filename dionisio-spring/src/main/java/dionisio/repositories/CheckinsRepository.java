package dionisio.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dionisio.entities.Checkins;

@Repository
public interface CheckinsRepository extends JpaRepository<Checkins, UUID> {

}
