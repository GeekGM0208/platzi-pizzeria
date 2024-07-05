package com.platzi.pizza.persistence.repository;

import com.platzi.pizza.persistence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository extends ListCrudRepository <OrderEntity, Integer> {

    List<OrderEntity> findAllByDateAfter(LocalDateTime date);
    List<OrderEntity> findAllByMethodIn(List<String> methods);
}
