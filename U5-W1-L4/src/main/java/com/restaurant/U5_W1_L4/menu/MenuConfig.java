package com.restaurant.U5_W1_L4.menu;

import com.restaurant.U5_W1_L4.bevande.Bevanda;
import com.restaurant.U5_W1_L4.pizze.Pizza;
import com.restaurant.U5_W1_L4.topping.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class MenuConfig {
    private final Bevanda aranciata;
    private final Bevanda coca_cola;
    private final Pizza margherita;
    private final Pizza marinara;
    private final Pizza funghiSalsiccia;
    private final Pizza capricciosa;
    private final Topping mozzarella;
    private final Topping salame;
    private final Topping funghi;
    private final Topping salsiccia;
    private final Topping prosciutto;

    @Bean
    public Menu creaMenu() {
        Menu m = new Menu();
        m.setNomeMenu("Menu Pranzo");
        m.setElementiMenu(List.of(aranciata, coca_cola, margherita, marinara, funghiSalsiccia, capricciosa,
                mozzarella, salame, funghi, salsiccia, prosciutto));
        return m;
    }
}
