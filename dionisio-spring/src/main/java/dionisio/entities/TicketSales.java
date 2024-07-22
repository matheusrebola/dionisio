package br.org.diversao.dionisio.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record TicketSales(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime purchaseDate,
		Integer quantity,
		BigDecimal totalPrice,
		PaymentStatus paymenteStatus,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user,
		Tickets ticket) {

}
