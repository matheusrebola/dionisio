package dionisio.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record EventSchedule(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String sessionName,
		String sessionDescription,
		LocalDateTime startTime,
		LocalDateTime endTime,
		String speaker,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Events event)
{

}
