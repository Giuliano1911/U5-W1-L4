package com.restaurant.U5_W1_L4.tavoli;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tavoli")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private int numeroMaxCoperti;
	private StatoTavolo statoTavolo;

}
