package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.entity.DishFlavor;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    /**
     * 新增分类
     * @param flavors
     * @return
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据dishId获取口味数据
     * @param dishId
     * @return
     */
    List<DishFlavor> getByDishId(Long dishId);

    /**
     * 根据dishId删除口味数据
     * @param id
     * @return
     */
    @Delete("delete from dish_flavor where dish_id = #{id}")
    void deleteById(long id);

}
