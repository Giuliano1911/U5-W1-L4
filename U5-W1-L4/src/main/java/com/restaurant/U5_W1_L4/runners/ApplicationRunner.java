package com.restaurant.U5_W1_L4.runners;

import com.restaurant.U5_W1_L4.menu.Menu;
import com.restaurant.U5_W1_L4.ordini.Ordine;
import com.restaurant.U5_W1_L4.ordini.StatoOrdine;
import com.restaurant.U5_W1_L4.tavoli.StatoTavolo;
import com.restaurant.U5_W1_L4.tavoli.Tavolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class ApplicationRunner implements CommandLineRunner {
	@Autowired
	private Menu menuPranzo;

	@Value("${costo.coperto}")
	private double costoCoperto;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(menuPranzo);

		Tavolo tavolo = new Tavolo();
		tavolo.setNumeroMaxCoperti(4);
		tavolo.setStatoTavolo(StatoTavolo.LIBERO);

		Ordine ordine = new Ordine();
		ordine.setTavolo(tavolo);
		ordine.setStatoOrdine(StatoOrdine.IN_CORSO);
		ordine.setNumeroCoperti(2);
		ordine.setCostoCoperto(costoCoperto);
		ordine.setElementiOrdine(List.of(
			menuPranzo.getElementiMenu().get(0),
			menuPranzo.getElementiMenu().get(1),
			menuPranzo.getElementiMenu().get(2)));

		ordine.stampaOrdine();
	}
}
