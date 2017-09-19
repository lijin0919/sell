package com.y2.sell.controller;

import com.y2.sell.service.GoodsService;
import com.y2.sell.vo.FoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @GetMapping("/goods")
    public FoodsVo getGoodsInfo(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return goodsService.getGoodsInfo();
    }
}
