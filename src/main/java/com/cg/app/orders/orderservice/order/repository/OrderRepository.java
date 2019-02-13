package com.cg.app.orders.orderservice.order.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.app.orders.orderservice.order.MyOrder;


@Repository
public interface OrderRepository extends JpaRepository<MyOrder, Integer> {

}
