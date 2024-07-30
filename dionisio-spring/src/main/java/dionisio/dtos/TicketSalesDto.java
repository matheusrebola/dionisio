package dionisio.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import dionisio.entities.PaymentStatus;
import dionisio.entities.Tickets;
import dionisio.entities.Users;
import jakarta.validation.constraints.NotNull;

public record TicketSalesDto(
		@NotNull UUID id,
		LocalDateTime purchaseDate,
		Integer quantity,
		BigDecimal totalPrice,
		PaymentStatus paymenteStatus,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user,
		Tickets ticket) {

}
