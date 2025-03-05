package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class ShippingServices {

    public Double shipment(Order order) {
        if(order.getBasic() < 100){

            return 20.0;
        } else if(order.getBasic() < 200 && order.getBasic() > 100){

            return 12.0;
        }

        return 0.0;
    }
}

