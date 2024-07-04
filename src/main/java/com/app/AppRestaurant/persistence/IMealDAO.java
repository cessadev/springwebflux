package com.app.AppRestaurant.persistence;

import com.app.AppRestaurant.entities.MealEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IMealDAO {
    Mono<MealEntity> save(MealEntity meal);
    Mono<MealEntity> findById(Long id);
    Flux<MealEntity> findAll();
    Mono<Void> delete(MealEntity meal);
}