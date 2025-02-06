package com.restaurant.U5_W1_L4.bevande;


import com.restaurant.U5_W1_L4.menu.ElementoMenu;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "bevande")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bevanda extends ElementoMenu {

    private String nomeBevanda;
    private double prezzo;
    private int calorie;
}

