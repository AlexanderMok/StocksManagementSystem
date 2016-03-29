package com.elite.commoditymanagement.dao;

import com.elite.commoditymanagement.model.Item;
import com.elite.commoditymanagement.model.Supplyer;
import com.elite.commoditymanagement.model.SupplyerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplyerMapper {
    int countByExample(SupplyerExample example);

    int deleteByExample(SupplyerExample example);

    int deleteByPrimaryKey(String suppId);

    int insert(Supplyer record);

    int insertSelective(Supplyer record);

    List<Supplyer> selectByExample(SupplyerExample example);
    
    List<Supplyer> selectAllSupplier();

    Supplyer selectByPrimaryKey(String suppId);

    int updateByExampleSelective(@Param("record") Supplyer record, @Param("example") SupplyerExample example);

    int updateByExample(@Param("record") Supplyer record, @Param("example") SupplyerExample example);

    int updateByPrimaryKeySelective(Supplyer record);

    int updateByPrimaryKey(Supplyer record);
    
    List<Item> querySupplyItem();

	
}