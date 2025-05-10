package com.example.demo.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "addresses")
public class Address {
	@Id
	@GeneratedValue(generator = "UUID")
	private UUID id;

	private String street;
	private String city;
	private String state;
	private String postalCode;
	private String country;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
