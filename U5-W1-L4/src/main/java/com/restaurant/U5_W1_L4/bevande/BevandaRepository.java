package com.restaurant.U5_W1_L4.bevande;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BevandaRepository extends JpaRepository<Bevanda,Long> {

    Bevanda findById(long id);
}
