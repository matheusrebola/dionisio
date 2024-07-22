package dionisio.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record PaymentIntegrations(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String providerName,
		String apiKey,
		String apiSecret,
		LocalDateTime createdAt,
		LocalDateTime updatedAt) 
{

}
