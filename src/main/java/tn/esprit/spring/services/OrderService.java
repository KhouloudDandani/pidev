package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Interface.IOrderService;
import tn.esprit.spring.entities.Order;
import tn.esprit.spring.repositories.IOrderLineRepository;
import tn.esprit.spring.repositories.IOrderRepository;

@Service
public class OrderService implements IOrderService {
    @Autowired
    IOrderRepository orderRepository;

    @Autowired
    IOrderLineRepository orderLineRepository;

    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);
        order.getOrderLines().forEach(orderLine -> {
            orderLine.setOrder(order);
            orderLineRepository.save(orderLine);
        });
    }

    @Override
    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Order getOrder(int id) {
        return orderRepository.findById(id).get();
    }

}

