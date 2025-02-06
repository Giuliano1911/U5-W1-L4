package com.restaurant.U5_W1_L4.tavoli;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {
	private int numeroTavolo;
	private int numeroMaxCoperti;
	private StatoTavolo statoTavolo;
}
