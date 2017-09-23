package com.y2.sell.service;

import com.y2.sell.dao.SellerInfoRepository;
import com.y2.sell.enity.SellerInfo;
import com.y2.sell.vo.SellerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerInfoService {

    @Autowired
    private SellerInfoRepository sellerInfoRepository;

    public SellerVo getSellerInfo(){
        SellerInfo sellerInfo = sellerInfoRepository.findOne(1);
        sellerInfo.getInfos().add("该商家支持发票,请下单写好发票抬头");
        sellerInfo.getInfos().add("品类:其他菜系,包子粥店");
        sellerInfo.getInfos().add("北京市昌平区回龙观西大街龙观置业大厦底商B座102单元1340");
        sellerInfo.getInfos().add("营业时间:10:00-20:30");
        sellerInfo.getPics().add("http://fuss10.elemecdn.com/8/71/c5cf5715740998d5040dda6e66abfjpeg.jpeg?imageView2/1/w/180/h/180");
        sellerInfo.getPics().add("http://fuss10.elemecdn.com/b/6c/75bd250e5ba69868f3b1178afbda3jpeg.jpeg?imageView2/1/w/180/h/180");
        sellerInfo.getPics().add("http://fuss10.elemecdn.com/f/96/3d608c5811bc2d902fc9ab9a5baa7jpeg.jpeg?imageView2/1/w/180/h/180");
        sellerInfo.getPics().add("http://fuss10.elemecdn.com/6/ad/779f8620ff49f701cd4c58f6448b6jpeg.jpeg?imageView2/1/w/180/h/180");

        SellerVo sellerVo = new SellerVo();
        sellerVo.setErrno(0);
        sellerVo.setData(sellerInfo);
        return sellerVo;
    }
}
