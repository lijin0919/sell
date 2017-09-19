package com.y2.sell.vo;

import com.y2.sell.enity.FoodType;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class FoodsVo implements Serializable{
    private int errno;
    private List<FoodType> data = new ArrayList<>();
}
