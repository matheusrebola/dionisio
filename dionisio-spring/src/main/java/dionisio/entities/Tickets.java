package dionisio.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Tickets(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		TicketType ticketType,
		BigDecimal price,
		Integer quantity,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Events event) 
{

}
