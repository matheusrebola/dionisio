package dionisio.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import dionisio.entities.Events;
import dionisio.entities.TicketType;
import jakarta.validation.constraints.NotNull;

public record TicketsDto(
	 	@NotNull UUID id,
		TicketType ticketType,
		BigDecimal price,
		Integer quantity,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Events event) {

}
