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
    private String name = "皮蛋瘦肉粥";
    private int price = 10;
    private int oldPrice = 10;
    private String description = "咸粥";
    private int sellCount = 10;
    private int rating = 10;
    private String info = "一碗皮蛋瘦肉粥，总是我到粥店时的不二之选。香浓软滑，饱腹暖心，皮蛋的Q弹与瘦肉的滑嫩伴着粥香溢于满口";
    @Transient
    private List<Rating> ratings = new ArrayList<>();
    private String icon = "http://fuss10.elemecdn.com/c/cd/c12745ed8a5171e13b427dbc39401jpeg.jpeg?imageView2/1/w/114/h/114";
    private String image = "http://fuss10.elemecdn.com/c/cd/c12745ed8a5171e13b427dbc39401jpeg.jpeg?imageView2/1/w/750/h/750";
}
