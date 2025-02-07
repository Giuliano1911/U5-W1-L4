package com.restaurant.U5_W1_L4.bevande;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BevandaRepository extends JpaRepository<Bevanda, Long> {

    Bevanda findById(long id);

    Bevanda findByNomeBevanda(String nomeBevanda);

    List<Bevanda> findByCalorieLessThan(int calorie);
}
