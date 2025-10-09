package com.sky.mapper;

import com.sky.entity.Dish;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishMapper {

    /**
     * 新增分类
     * @param
     * @return
     */
    @Select("select * from dish")
    List<Dish> queryAllDish();
}
