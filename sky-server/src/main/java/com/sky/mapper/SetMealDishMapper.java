package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetMealDishMapper {

    /**
     * 在套餐内的id
     * @Param ids
     * @return
     */
    List<Long> getSetMealIdsByDishIds(List<Long> dishIds);

}
