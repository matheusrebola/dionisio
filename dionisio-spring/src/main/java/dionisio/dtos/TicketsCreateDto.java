package dionisio.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import dionisio.entities.Events;
import dionisio.entities.TicketType;

public record TicketsCreateDto(
		TicketType ticketType,
		BigDecimal price,
		Integer quantity,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Events event) {

}
