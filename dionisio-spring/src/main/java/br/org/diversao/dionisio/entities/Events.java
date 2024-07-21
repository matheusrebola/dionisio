package br.org.diversao.dionisio.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Events(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String name,
		String description,
		LocalDateTime startDate,
		LocalDateTime endDate,
		String location,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user) 
{

}
