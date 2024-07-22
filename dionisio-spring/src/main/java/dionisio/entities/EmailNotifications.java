package dionisio.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record EmailNotifications(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String emailSubject,
		String emailBody,
		LocalDateTime sentAt,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user,
		Events event)
{

}
