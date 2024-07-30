package dionisio.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import dionisio.entities.PaymentStatus;
import dionisio.entities.Tickets;
import dionisio.entities.Users;

public record TicketSalesCreateDto(
		LocalDateTime purchaseDate,
		Integer quantity,
		BigDecimal totalPrice,
		PaymentStatus paymenteStatus,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user,
		Tickets ticket) {

}
