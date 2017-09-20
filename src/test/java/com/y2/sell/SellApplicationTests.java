package com.y2.sell;

import com.y2.sell.dao.FoodRepository;
import com.y2.sell.dao.FoodTypeRepository;
import com.y2.sell.dao.SellerInfoRepository;
import com.y2.sell.dao.mapper.SellerInfoMapper;
import com.y2.sell.enity.Food;
import com.y2.sell.enity.FoodType;
import com.y2.sell.enity.SellerInfo;
import com.y2.sell.vo.FoodsVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellApplicationTests {

	@Autowired
	private SellerInfoRepository sellerInfoRepository;

	@Test
	public void contextLoads() {
		 SellerInfo sellerInfo = new SellerInfo();
		 sellerInfo.setName("粥品香坊（回龙观）");
//		 sellerInfo.getPics().add("http://fuss10.elemecdn.com/8/71/c5cf5715740998d5040dda6e66abfjpeg.jpeg?imageView2/1/w/180/h/180");
//		sellerInfo.getPics().add("http://fuss10.elemecdn.com/8/71/c5cf5715740998d5040dda6e66abfjpeg.jpeg?imageView2/1/w/180/h/180");
//		sellerInfo.getPics().add("http://fuss10.elemecdn.com/8/71/c5cf5715740998d5040dda6e66abfjpeg.jpeg?imageView2/1/w/180/h/180");
//		sellerInfo.getPics().add("http://fuss10.elemecdn.com/8/71/c5cf5715740998d5040dda6e66abfjpeg.jpeg?imageView2/1/w/180/h/180");
//		sellerInfo.getInfos().add("该商家支持发票");
//		sellerInfo.getInfos().add("该商家支持发票");
//		sellerInfo.getInfos().add("该商家支持发票");
//		sellerInfo.getInfos().add("该商家支持发票");

		sellerInfoRepository.save(sellerInfo);
	}

	@Autowired
	private FoodTypeRepository foodTypeRepository;
	@Autowired
	private FoodRepository foodRepository;
	@Test
	public void insertFoodType(){
//		FoodType foodType = new FoodType();
//		foodType.setName("热销榜");
//
//		FoodType mFoodType = foodTypeRepository.save(foodType);
		List<Food> list = foodRepository.findAll();
		list.forEach(a -> System.out.println(a.getName()));
//		Food food = new Food();
//		food.setTypeId(4);
//		foodRepository.save(food);


	}

	public void addType(){
		FoodType foodType = new FoodType();
		foodType.setName("我最爱");
		foodTypeRepository.save(foodType);
	}

	@Autowired
	private SellerInfoMapper mapper;
	@Test
	public void mybatis(){
		SellerInfo sellerInfo = mapper.getSellerInfo();
		System.out.println(sellerInfo);

	}

}
