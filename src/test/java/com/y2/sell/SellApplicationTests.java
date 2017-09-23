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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Pageable;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellApplicationTests {

	@Autowired
	private SellerInfoRepository sellerInfoRepository;
	@Autowired
	private FoodTypeRepository foodTypeRepository;
	@Autowired
	private FoodRepository foodRepository;
	@Test
	public void contextLoads() {
		 SellerInfo sellerInfo = new SellerInfo();
		 sellerInfo.setName("粥品香坊（回龙观）");
		 sellerInfo.setDescription("蜂鸟专送");
		 sellerInfo.setDeliveryTime(30);
		 sellerInfo.setScore(5);
		 sellerInfo.setServiceScore(5);
		 sellerInfo.setFoodScore(5);
		 sellerInfo.setRankRate(20);
		 sellerInfo.setMinPrice(20);
		 sellerInfo.setDeliveryPrice(5);
		 sellerInfo.setRatingCount(5);
		 sellerInfo.setSellCount(9);
		 sellerInfo.setBulletin("粥品香坊其烹饪粥料的秘方源于中国千年古法，在融和现代制作工艺，由世界烹饪大师屈浩先生领衔研发。坚守纯天然、0添加的良心品质深得消费者青睐，发展至今成为粥类的引领品牌。是2008年奥运会和2013年园博会指定餐饮服务商。");
		 sellerInfo.setAvatar("http://static.galileo.xiaojukeji.com/static/tms/seller_avatar_256px.jpg");
		sellerInfoRepository.save(sellerInfo);
	}


    /**
     * 添加商品类型
     */
	@Test
	public void insertFoodType(){
		FoodType foodType = new FoodType();
		foodType.setName("热销榜");
		foodTypeRepository.save(foodType);
	}

    /**
     * 添加食品
     */
	@Test
	public void addFood(){
		Food food = new Food();
		food.setName("皮蛋瘦肉粥");
		food.setTypeId(1);
		food.setPrice(10);
		food.setOldPrice(20);
		food.setDescription("咸粥");
		food.setSellCount(10);
		food.setRating(10);
		food.setInfo("一碗皮蛋瘦肉粥，总是我到粥店时的不二之选。香浓软滑，饱腹暖心，皮蛋的Q弹与瘦肉的滑嫩伴着粥香溢于满口");
		food.setIcon("http://fuss10.elemecdn.com/c/cd/c12745ed8a5171e13b427dbc39401jpeg.jpeg?imageView2/1/w/114/h/114");
		food.setImage("http://fuss10.elemecdn.com/c/cd/c12745ed8a5171e13b427dbc39401jpeg.jpeg?imageView2/1/w/750/h/750");
        foodRepository.save(food);

		Food food1 = new Food();
		food1.setName("扁豆焖面");
        food1.setTypeId(1);
        food1.setPrice(10);
        food1.setOldPrice(20);
        food1.setDescription("好吃");
        food1.setSellCount(10);
        food1.setRating(10);
        food1.setInfo("一碗扁豆焖面，总是我到粥店时的不二之选。");
        food1.setIcon("http://fuss10.elemecdn.com/c/6b/29e3d29b0db63d36f7c500bca31d8jpeg.jpeg?imageView2/1/w/114/h/114");
        food1.setImage("http://fuss10.elemecdn.com/c/6b/29e3d29b0db63d36f7c500bca31d8jpeg.jpeg?imageView2/1/w/750/h/750");
        foodRepository.save(food1);
	}

	@Autowired
	private SellerInfoMapper mapper;
	@Test
	public void mybatis(){
		SellerInfo sellerInfo = mapper.getSellerInfo();
		System.out.println(sellerInfo);

	}

	@Test
	public void getPage(){
		PageRequest request = new PageRequest(1, 2);
		Page<Food> foodList = foodRepository.findAll(request);
		foodList.forEach(a -> System.out.println(a.getName()));
	}

}
