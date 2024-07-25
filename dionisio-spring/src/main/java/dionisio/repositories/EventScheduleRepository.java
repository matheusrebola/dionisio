package dionisio.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dionisio.entities.EventSchedule;

@Repository
public interface EventScheduleRepository extends JpaRepository<EventSchedule, UUID> {

}
