package com.y2.sell;

import com.y2.sell.dao.SellerInfoRepository;
import com.y2.sell.enity.SellerInfo;
import com.y2.sell.service.SellerInfoService;
import com.y2.sell.vo.SellerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class SellerContorller {

    @Autowired
    private SellerInfoRepository sellerInfoRepository;

    @Autowired
    private SellerInfoService sellerInfoService;
    @GetMapping("/seller")
    public SellerVo getSellerInfo(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
//        SellerInfo sellerInfo = sellerInfoRepository.findOne(1);
//        SellerVo sellerVo = new SellerVo();
//        sellerVo.setErrno(0);
//        sellerVo.setData(sellerInfo);


        return sellerInfoService.getSellerInfo();
    }
}
