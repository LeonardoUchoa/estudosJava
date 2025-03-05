package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    ShippingServices shippingServices;

    public Double total(Order order) {
        Double discount = order.getBasic() * order.getDiscount()/100;
        return (order.getBasic() - discount) + shippingServices.shipment(order);
    }
}
