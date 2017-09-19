package com.y2.sell.service;

import com.y2.sell.dao.FoodRepository;
import com.y2.sell.dao.FoodTypeRepository;
import com.y2.sell.enity.Food;
import com.y2.sell.enity.FoodType;
import com.y2.sell.vo.FoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsService {

    @Autowired
    private FoodTypeRepository foodTypeRepository;
    @Autowired
    private FoodRepository foodRepository;

    public FoodsVo getGoodsInfo(){
//找到所有类型FoodType
        List<FoodType> foodTypeList = foodTypeRepository.findAll();
//        List<Food> foodList = foodRepository.findAllByTypeId()
        foodTypeList.forEach(a -> a.setFoods(foodRepository.findAllByTypeId(a.getType())));
        FoodsVo foodsVo = new FoodsVo();
        foodsVo.setErrno(0);
        foodsVo.setData(foodTypeList);
        return foodsVo;
    }

    public Page<Food> getGoodsList(Pageable pageable){
       return foodRepository.findAll(pageable);
    }
}
