package com.restaurant.U5_W1_L4.pizze;


import com.restaurant.U5_W1_L4.menu.ElementoMenu;
import com.restaurant.U5_W1_L4.topping.Topping;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity(name="pizze")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza implements ElementoMenu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomePizza;
	private int calorie;
	private double prezzo;
	@OneToMany(mappedBy = "nomeTopping")
	List<Topping> toppings = new ArrayList<>();

	@Override
	public String getNome() {
		return nomePizza;
	}
}
