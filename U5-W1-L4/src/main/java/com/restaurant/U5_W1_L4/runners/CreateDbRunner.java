package com.restaurant.U5_W1_L4.runners;

import com.restaurant.U5_W1_L4.bevande.Bevanda;
import com.restaurant.U5_W1_L4.bevande.BevandaRepository;
import com.restaurant.U5_W1_L4.menu.Menu;
import com.restaurant.U5_W1_L4.pizze.Pizza;
import com.restaurant.U5_W1_L4.pizze.PizzaRepository;
import com.restaurant.U5_W1_L4.tavoli.StatoTavolo;
import com.restaurant.U5_W1_L4.tavoli.Tavolo;
import com.restaurant.U5_W1_L4.tavoli.TavoloRepository;
import com.restaurant.U5_W1_L4.topping.Topping;
import com.restaurant.U5_W1_L4.topping.ToppingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CreateDbRunner implements CommandLineRunner {

    private final BevandaRepository bevandaRepository;
    private final ToppingRepository toppingRepository;
    private final PizzaRepository pizzaRepository;
    private final TavoloRepository tavoloRepository;

    private final Pizza capricciosa;
    private final Topping mozzarella;
    private final Bevanda aranciata;

    private final Menu menuPranzo;

    @Value("${costo.coperto}")
    private double costoCoperto;

    @Override
    public void run(String... args) throws Exception {

        bevandaRepository.save(aranciata);

        toppingRepository.save(mozzarella);

        pizzaRepository.save(capricciosa);

        System.out.println(bevandaRepository.findById(1L));

        Tavolo tavolo = new Tavolo();
        tavolo.setStatoTavolo(StatoTavolo.LIBERO);
        tavolo.setNumeroMaxCoperti(2);
        tavoloRepository.save(tavolo);

    }
}
