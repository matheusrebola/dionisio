package dionisio.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import dionisio.entities.Role;
import jakarta.validation.constraints.NotNull;

public record UsersDto(
		@NotNull UUID id,
		String name,
		String email,
		String password,
		Role role,
		LocalDateTime createdAt,
		LocalDateTime updatedAt) {

}
