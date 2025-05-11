package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name = "carts") //klhfv
public class Cart {
	@Id
	@GeneratedValue(generator = "UUID")
    private Long id;

    @OneToOne @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "cart") private List<CartItem> items;
}