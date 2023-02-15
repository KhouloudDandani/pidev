package tn.esprit.spring.Interface;

import tn.esprit.spring.entities.Order;

public interface IOrderService {
    void addOrder(Order order);
    void deleteOrder(int id);
    Order getOrder(int id);
}
