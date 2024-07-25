package dionisio.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dionisio.entities.Events;

@Repository
public interface EventsRepository extends JpaRepository<Events, UUID> {

}
