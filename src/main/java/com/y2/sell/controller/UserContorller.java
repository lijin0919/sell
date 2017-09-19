package com.y2.sell.controller;

import com.y2.sell.enity.Food;
import com.y2.sell.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserContorller {

    @Autowired
    private GoodsService goodsService;



    @GetMapping("/list")
    public String getGoodsList(@RequestParam(value = "page", defaultValue = "1") Integer page,
                               @RequestParam(value = "size", defaultValue = "1") Integer size,
                               Model model){

        if (page<1){
            page = 1;
        }



        PageRequest request = new PageRequest(page - 1, size);

        Page<Food> list = goodsService.getGoodsList(request);

        int totalPage = list.getTotalPages();

        model.addAttribute("list",list);
        model.addAttribute("page",page);
        if (page < totalPage){
            model.addAttribute("totalPage",totalPage);
        }

        return "goods";
    }
}
