package com.elite.commoditymanagement.dao;

import com.elite.commoditymanagement.model.Catagorgy;
import com.elite.commoditymanagement.model.CatagorgyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatagorgyMapper {
    int countByExample(CatagorgyExample example);

    int deleteByExample(CatagorgyExample example);

    int deleteByPrimaryKey(Integer catagorgyId);

    int insert(Catagorgy record);

    int insertSelective(Catagorgy record);

    List<Catagorgy> selectByExample(CatagorgyExample example);

    Catagorgy selectByPrimaryKey(Integer catagorgyId);

    int updateByExampleSelective(@Param("record") Catagorgy record, @Param("example") CatagorgyExample example);

    int updateByExample(@Param("record") Catagorgy record, @Param("example") CatagorgyExample example);

    int updateByPrimaryKeySelective(Catagorgy record);

    int updateByPrimaryKey(Catagorgy record);
    
    List<?> selectByPid(Integer pid);
}