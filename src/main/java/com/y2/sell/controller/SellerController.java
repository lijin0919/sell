package com.y2.sell.controller;

import com.y2.sell.enity.SellerInfo;
import com.y2.sell.service.SellerInfoService;
import com.y2.sell.vo.SellerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {

    @Autowired
    private SellerInfoService sellerInfoService;

    @GetMapping("/sell")
    public SellerVo getSellerInfo(){
        return sellerInfoService.getSellerInfo();
    }
}
