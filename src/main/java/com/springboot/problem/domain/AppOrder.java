package com.springboot.problem.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AppOrder implements Serializable {
    public AppOrder(Long id, String orderCode, String status) {
        this.id = id;
        this.orderCode = orderCode;
        this.status = status;
    }

    private Long id;

    private String orderCode;

    private String status;


}
