package com.y2.sell.enity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Food {

    @Id
    @GeneratedValue
    private Integer id;
    @JsonIgnore
    private Integer typeId;
    private String name;
    private int price;
    private int oldPrice;
    private String description;
    private int sellCount;
    private int rating;
    private String info;
    @Transient
    private List<Rating> ratings = new ArrayList<>();
    private String icon;
    private String image;
}
