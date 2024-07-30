package dionisio.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import dionisio.entities.Events;
import dionisio.entities.Users;
import jakarta.validation.constraints.NotNull;

public record CheckinsDto(
		@NotNull UUID id,
		LocalDateTime checkinDate,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user,
		Events event) {

}
