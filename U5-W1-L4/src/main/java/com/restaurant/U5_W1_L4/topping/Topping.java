package com.restaurant.U5_W1_L4.topping;

import com.restaurant.U5_W1_L4.menu.ElementoMenu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "toppings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topping extends ElementoMenu {

	private String nomeTopping;
	private int calorie;
	private double prezzo;

}
