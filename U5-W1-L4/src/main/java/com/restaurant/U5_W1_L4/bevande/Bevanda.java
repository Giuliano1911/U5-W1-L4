package com.restaurant.U5_W1_L4.bevande;


import com.restaurant.U5_W1_L4.menu.ElementoMenu;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "bevande")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bevanda implements ElementoMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeBevanda;
    private double prezzo;
    private int calorie;

    @Override
    public String getNome() {
        return nomeBevanda;
    }

    @Override
    public int getCalorie() {
        return calorie;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

}

