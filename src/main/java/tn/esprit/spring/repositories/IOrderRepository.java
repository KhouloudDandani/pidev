package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Order;
@Repository
public interface IOrderRepository extends JpaRepository<Order, Integer> {

}

