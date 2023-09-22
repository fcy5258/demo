package com.quxue.takeaway.entity;

//订单类

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
   private Long id ;
    private String goodsName;// 订单商品名称
    private Integer number;// 商品数量
    private Integer price; //订单总价格
    private String userName;  //订单用户
    private String  time; //下单时间


}
