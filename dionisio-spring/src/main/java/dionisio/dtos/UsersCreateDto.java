package dionisio.dtos;

import java.time.LocalDateTime;

import dionisio.entities.Role;

public record UsersCreateDto(
		String name,
		String email,
		String password,
		Role role,
		LocalDateTime createdAt,
		LocalDateTime updatedAt) {

}
