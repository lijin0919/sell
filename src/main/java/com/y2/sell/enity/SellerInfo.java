package com.y2.sell.enity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class SellerInfo {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private int deliveryTime;
    private double score;
    private double serviceScore;
    private double foodScore;
    private double rankRate;
    private int minPrice;
    private int deliveryPrice;
    private int ratingCount;
    private int sellCount;
    private String bulletin;
    private String avatar;
    @Transient
    private List<String> pics = new ArrayList<>();
    @Transient
    private List<String> infos = new ArrayList<>();
}
