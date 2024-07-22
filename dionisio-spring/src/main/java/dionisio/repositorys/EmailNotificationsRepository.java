package dionisio.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dionisio.entities.EmailNotifications;

@Repository
public interface EmailNotificationsRepository extends JpaRepository<EmailNotifications, UUID> {

}
