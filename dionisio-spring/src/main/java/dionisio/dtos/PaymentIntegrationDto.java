package dionisio.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record PaymentIntegrationDto(
		@NotNull UUID id,
		String providerName,
		String apiKey,
		String apiSecret,
		LocalDateTime createdAt,
		LocalDateTime updatedAt) {

}
