package com.y2.sell.service;

import com.y2.sell.dao.FoodRepository;
import com.y2.sell.dao.FoodTypeRepository;
import com.y2.sell.enity.Food;
import com.y2.sell.enity.FoodType;
import com.y2.sell.vo.FoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class GoodsService {

    @Autowired
    private FoodTypeRepository foodTypeRepository;
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private RedisTemplate redisTemplate;

//    @Cacheable(value = "goods")
    public FoodsVo getGoodsInfo(){

//        String key = "goods";
//        //将FoodsVo这个对象缓存进redis
//        ValueOperations<String, FoodsVo> operations = redisTemplate.opsForValue();
//        // 缓存存在
//        boolean hasKey = redisTemplate.hasKey(key);//获取key
//        if (hasKey) {
//
//            FoodsVo foodsVo = operations.get(key);//将对象保存到redis
//
//            System.out.println("通过缓存"+foodsVo.toString());
//            return foodsVo;
//        }
//找到所有类型FoodType
        List<FoodType> foodTypeList = foodTypeRepository.findAll();
//        List<Food> foodList = foodRepository.findAllByTypeId()
        foodTypeList.forEach(a -> a.setFoods(foodRepository.findAllByTypeId(a.getType())));
        FoodsVo foodsVo = new FoodsVo();
        foodsVo.setErrno(0);
        foodsVo.setData(foodTypeList);
        // 插入缓存
//        operations.set(key, foodsVo);
        System.out.println("插入缓存");
        return foodsVo;
    }

    public Page<Food> getGoodsList(Pageable pageable){
       return foodRepository.findAll(pageable);
    }

    public Page<Food> getList(Pageable pageable){
        return foodRepository.findAll(pageable);
    }
}
