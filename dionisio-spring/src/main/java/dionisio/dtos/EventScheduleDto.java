package dionisio.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import dionisio.entities.Users;
import jakarta.validation.constraints.NotNull;

public record EventScheduleDto(
		@NotNull UUID id,
		String name,
		String description,
		LocalDateTime startDate,
		LocalDateTime endDate,
		String location,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user) {

}
