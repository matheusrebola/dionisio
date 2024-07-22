package dionisio.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dionisio.entities.Tickets;

@Repository
public interface TicketsRepository extends JpaRepository<Tickets, UUID>{

}
