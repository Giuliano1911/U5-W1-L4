package com.restaurant.U5_W1_L4.menu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
	private String nomeMenu;
	List<ElementoMenu> elementiMenu = new ArrayList<>();
}
