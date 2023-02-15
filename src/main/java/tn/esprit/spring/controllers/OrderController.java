package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Interface.IOrderService;
import tn.esprit.spring.entities.Order;
import tn.esprit.spring.services.OrderService;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    IOrderService orderService;

    @PostMapping("/")
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder( @PathVariable("id") int id){
        orderService.deleteOrder(id);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Order getOrder(@PathVariable("id") int id){
        return orderService.getOrder(id);
    }
}
