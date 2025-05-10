package com.example.demo.entity;

import java.math.BigDecimal;
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
@Table(name = "product_variants")
public class ProductVariant {
	@Id
	@GeneratedValue(generator = "UUID")
	private UUID productVariantId;

	private String size;
	private String color;
	private BigDecimal additionalPrice;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
}