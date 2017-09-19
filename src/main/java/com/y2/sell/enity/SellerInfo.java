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
    private String description = "蜂鸟专送";
    private int deliveryTime = 33;
    private double score = 30;
    private double serviceScore = 30;
    private double foodScore = 30;
    private double rankRate = 20;
    private int minPrice = 10;
    private int deliveryPrice = 25;
    private int ratingCount = 5;
    private int sellCount = 9;
    private String bulletin = "粥品香坊其烹饪粥料的秘方源于中国千年古法，在融和现代制作工艺，由世界烹饪大师屈浩先生领衔研发。坚守纯天然、0添加的良心品质深得消费者青睐，发展至今成为粥类的引领品牌。是2008年奥运会和2013年园博会指定餐饮服务商。";
    private String avatar = "http://static.galileo.xiaojukeji.com/static/tms/seller_avatar_256px.jpg";
    @Transient
    private List<String> pics = new ArrayList<>();
    @Transient
    private List<String> infos = new ArrayList<>();
}
