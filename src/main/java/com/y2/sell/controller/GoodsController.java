package com.y2.sell.controller;

import com.y2.sell.service.GoodsService;
import com.y2.sell.vo.FoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController//只返回JSON信息
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     *获取所有商品信息
     * @param response
     * @return
     */
    @GetMapping("/goods")
    public FoodsVo getGoodsInfo(HttpServletResponse response){
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return goodsService.getGoodsInfo();
    }
}
