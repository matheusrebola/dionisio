package dionisio.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import dionisio.entities.Events;
import dionisio.entities.Users;
import jakarta.validation.constraints.NotNull;

public record EmailNotificationDto(
		@NotNull UUID id,
		String emailSubject,
		String emailBody,
		LocalDateTime sentAt,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user,
		Events event) {

}
