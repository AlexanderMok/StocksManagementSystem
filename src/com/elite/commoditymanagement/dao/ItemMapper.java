package com.elite.commoditymanagement.dao;

import com.elite.commoditymanagement.model.Item;
import com.elite.commoditymanagement.model.ItemExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ItemMapper {
    int countByExample(ItemExample example);

    int deleteByExample(ItemExample example);

    int deleteByPrimaryKey(String itemId);

    int insert(Item record);

    int insertSelective(Item record);

    List<Item> selectByExample(ItemExample example);
    
    Item selectByPrimaryKey(String itemId);

    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
    
    void removeForeignKey();
    void addForeignKey();
}