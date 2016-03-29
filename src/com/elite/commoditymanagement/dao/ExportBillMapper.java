package com.elite.commoditymanagement.dao;

import com.elite.commoditymanagement.model.ExportBill;
import com.elite.commoditymanagement.model.ExportBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExportBillMapper {
    int countByExample(ExportBillExample example);

    int deleteByExample(ExportBillExample example);

    int deleteByPrimaryKey(String exportId);

    int insert(ExportBill record);

    int insertSelective(ExportBill record);

    List<ExportBill> selectByExample(ExportBillExample example);

    ExportBill selectByPrimaryKey(String exportId);

    int updateByExampleSelective(@Param("record") ExportBill record, @Param("example") ExportBillExample example);

    int updateByExample(@Param("record") ExportBill record, @Param("example") ExportBillExample example);

    int updateByPrimaryKeySelective(ExportBill record);

    int updateByPrimaryKey(ExportBill record);
    
    Integer selectAmountByItemId(String itemId);
}