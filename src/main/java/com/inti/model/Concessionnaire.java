package com.inti.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data @NoArgsConstructor @RequiredArgsConstructor
public class Concessionnaire {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@NonNull
	private String nom;
}
