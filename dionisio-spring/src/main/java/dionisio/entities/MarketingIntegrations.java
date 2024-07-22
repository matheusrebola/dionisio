package dionisio.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record MarketingIntegrations(
		@Id UUID id,
		String providerName,
		String apiKey,
		String apiSecret,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		boolean ativo) {

}
