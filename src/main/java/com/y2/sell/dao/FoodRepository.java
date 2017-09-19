package com.y2.sell.dao;

import com.y2.sell.enity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food,Integer>{

//    List<Food> findAllByTypeId(Integer typeId);
    List<Food> findAllByTypeId(Integer typeId);
}
