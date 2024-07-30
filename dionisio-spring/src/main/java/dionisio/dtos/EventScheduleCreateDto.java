package dionisio.dtos;

import java.time.LocalDateTime;

import dionisio.entities.Users;

public record EventScheduleCreateDto(
		String name,
		String description,
		LocalDateTime startDate,
		LocalDateTime endDate,
		String location,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user) {

}
