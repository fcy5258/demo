package com.quxue.takeaway.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commodity{
    private Integer id;
    private String name;
    private BigDecimal price;//价格


}
