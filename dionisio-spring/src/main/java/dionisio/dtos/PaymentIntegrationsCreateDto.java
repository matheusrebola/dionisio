package dionisio.dtos;

import java.time.LocalDateTime;

public record PaymentIntegrationsCreateDto(
		String providerName,
		String apiKey,
		String apiSecret,
		LocalDateTime createdAt,
		LocalDateTime updatedAt) {

}
