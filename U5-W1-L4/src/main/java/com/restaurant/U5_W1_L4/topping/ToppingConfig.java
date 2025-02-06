package com.restaurant.U5_W1_L4.topping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {
	@Bean
	public Topping mozzarella() {
		Topping t = new Topping();
		t.setNomeTopping("mozzarella");
		t.setCalorie(100);
		t.setPrezzo(1.5);
		return t;
	}

	@Bean
	public Topping salame() {
		Topping t = new Topping();
		t.setNomeTopping("salame");
		t.setCalorie(150);
		t.setPrezzo(0.90);
		return t;
	}

	@Bean
	public Topping funghi() {
		Topping t = new Topping();
		t.setNomeTopping("funghi");
		t.setCalorie(50);
		t.setPrezzo(1.90);
		return t;
	}

	@Bean
	public Topping salsiccia() {
		Topping t = new Topping();
		t.setNomeTopping("salsiccia");
		t.setCalorie(300);
		t.setPrezzo(2.5);
		return t;
	}

	@Bean
	public Topping prosciutto() {
		Topping t = new Topping();
		t.setNomeTopping("prosciutto");
		t.setCalorie(160);
		t.setPrezzo(2);
		return t;
	}
}
