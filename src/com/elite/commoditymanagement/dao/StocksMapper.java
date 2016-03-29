package com.elite.commoditymanagement.dao;

import com.elite.commoditymanagement.model.Stocks;
import com.elite.commoditymanagement.model.StocksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StocksMapper {
    int countByExample(StocksExample example);

    int deleteByExample(StocksExample example);

    int deleteByPrimaryKey(String itemId);

    int insert(Stocks record);

    int insertSelective(Stocks record);

    List<Stocks> selectByExample(StocksExample example);

    Stocks selectByPrimaryKey(String itemId);

    int updateByExampleSelective(@Param("record") Stocks record, @Param("example") StocksExample example);

    int updateByExample(@Param("record") Stocks record, @Param("example") StocksExample example);

    int updateByPrimaryKeySelective(Stocks record);

    int updateByPrimaryKey(Stocks record);
}