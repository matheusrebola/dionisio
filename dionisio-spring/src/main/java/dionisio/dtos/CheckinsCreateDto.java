package dionisio.dtos;

import java.time.LocalDateTime;

import dionisio.entities.Events;
import dionisio.entities.Users;

public record CheckinsCreateDto(
		LocalDateTime checkinDate,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user,
		Events event) {

}
