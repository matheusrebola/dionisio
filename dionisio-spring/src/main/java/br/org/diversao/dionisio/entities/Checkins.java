package br.org.diversao.dionisio.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Checkins(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime checkinDate,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user,
		Events event) {

}
