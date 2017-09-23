package com.y2.sell.enity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品类型
 */
@Entity
@Data
public class FoodType {

    private String name;
    @Id//主键
    @GeneratedValue//自增
    private Integer type = 1;
    @Transient
    private List<Food> foods = new ArrayList<>();
}
