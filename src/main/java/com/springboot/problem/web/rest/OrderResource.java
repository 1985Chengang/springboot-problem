package com.springboot.problem.web.rest;

import com.springboot.problem.domain.AppOrder;
import com.springboot.problem.web.util.ResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OrderResource {

    @GetMapping("/app-orders")
    public List<AppOrder> getAllAppOrders()
    {
        AppOrder a1= new AppOrder(1L,"1","1");
        AppOrder a2= new AppOrder(2L,"2","2");
        List<AppOrder> appOrders =new ArrayList<>();
        appOrders.add(a1);
        appOrders.add(a2);
        return appOrders;
    }

    @GetMapping("/app-orders/{id}")
    public ResponseEntity<AppOrder> getOrder(@PathVariable Long id){
        AppOrder appOrder =new AppOrder(3L,"3","3");
        Optional<AppOrder> optional = Optional.ofNullable(appOrder);
        return ResponseUtil.wrapOrNotFound(optional);
    }


}
