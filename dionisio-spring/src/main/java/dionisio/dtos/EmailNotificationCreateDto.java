package dionisio.dtos;

import java.time.LocalDateTime;

import dionisio.entities.Events;
import dionisio.entities.Users;

public record EmailNotificationCreateDto(
		String emailSubject,
		String emailBody,
		LocalDateTime sentAt,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user,
		Events event) {

}
