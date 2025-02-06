package com.restaurant.U5_W1_L4.ordini;

import com.restaurant.U5_W1_L4.menu.ElementoMenu;
import com.restaurant.U5_W1_L4.tavoli.Tavolo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ordine {

	private long id;
	private Tavolo tavolo;
	private StatoOrdine statoOrdine;
	private int numeroCoperti;
	private LocalDateTime oraAcquisizione = LocalDateTime.now();
	private List<ElementoMenu> elementiOrdine = new ArrayList<>();


	private double costoCoperto = 0.0;

	public double calcolaCostoCoperto(){
		double totaleCoperto = numeroCoperti * costoCoperto;
		double sommaPrezzi = elementiOrdine.stream().mapToDouble(ElementoMenu::getPrezzo).sum();
		return totaleCoperto + sommaPrezzi;
	}

	public void stampaOrdine(){
		System.out.println("Numero ordine: " + id);
		System.out.println("Tavolo: " + tavolo);
		System.out.println("Stato ordine: " + statoOrdine);
		System.out.println("Numero coperti: " + numeroCoperti);
		System.out.println("Ora acquisizione: " + oraAcquisizione);
		System.out.println("Elementi dell'ordine: ");
		for(ElementoMenu e : elementiOrdine){
			System.out.println(e);
		}
		System.out.println("Costo coperto: " + costoCoperto);
		System.out.println("Costo totale: " + calcolaCostoCoperto());

	}
}







