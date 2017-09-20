package com.y2.sell.dao.mapper;

import com.y2.sell.enity.SellerInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface SellerInfoMapper {
    @Select("SELECT * FROM seller_info where id = 1")
    SellerInfo getSellerInfo();
}
