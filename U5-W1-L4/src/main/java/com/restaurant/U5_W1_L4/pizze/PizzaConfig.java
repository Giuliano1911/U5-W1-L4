package com.restaurant.U5_W1_L4.pizze;

import com.restaurant.U5_W1_L4.topping.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class PizzaConfig {

	private final Topping salame;
	private final Topping mozzarella;
	private final Topping funghi;
	private final Topping salsiccia;
	private final Topping prosciutto;


	@Bean
	public Pizza margherita() {
		List<Topping> toppings = List.of(mozzarella);
		Pizza p = new Pizza();
		p.setNomePizza("Margherita");
		p.setCalorie(500);
		p.setPrezzo(6);
		p.setToppings(toppings);
		return p;
	}

	@Bean
	public Pizza marinara() {
		List<Topping> toppings = List.of(mozzarella,salame);
		Pizza p = new Pizza();
		p.setNomePizza("Marinara");
		p.setCalorie(600);
		p.setPrezzo(5);
		p.setToppings(toppings);
		return p;
	}

	@Bean
	public Pizza funghiSalsiccia() {
		List<Topping> toppings = List.of(mozzarella,funghi,salsiccia);
		Pizza p = new Pizza();
		p.setNomePizza("Funghi e salsiccia");
		p.setCalorie(700);
		p.setPrezzo(9);
		p.setToppings(toppings);
		return p;
	}

	@Bean
	public Pizza capricciosa() {
		List<Topping> toppings = List.of(mozzarella,prosciutto,funghi);
		Pizza p = new Pizza();
		p.setNomePizza("Capricciosa");
		p.setCalorie(800);
		p.setPrezzo(10);
		p.setToppings(toppings);
		return p;
	}
}
