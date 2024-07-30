package dionisio.dtos;

import java.time.LocalDateTime;

public record MarketingIntegrationsCreateDto(
		String providerName,
		String apiKey,
		String apiSecret,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Boolean ativo) {

}
