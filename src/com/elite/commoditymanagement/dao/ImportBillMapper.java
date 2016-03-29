package com.elite.commoditymanagement.dao;

import com.elite.commoditymanagement.model.ImportBill;
import com.elite.commoditymanagement.model.ImportBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImportBillMapper {
    int countByExample(ImportBillExample example);

    int deleteByExample(ImportBillExample example);

    int deleteByPrimaryKey(String importId);

    int insert(ImportBill record);

    int insertSelective(ImportBill record);

    List<ImportBill> selectByExample(ImportBillExample example);

    ImportBill selectByPrimaryKey(String importId);

    int updateByExampleSelective(@Param("record") ImportBill record, @Param("example") ImportBillExample example);

    int updateByExample(@Param("record") ImportBill record, @Param("example") ImportBillExample example);

    int updateByPrimaryKeySelective(ImportBill record);

    int updateByPrimaryKey(ImportBill record);
    
    Integer selectAmountByItemId(String itemId);
}