package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Category;
import com.sky.entity.Dish;
import com.sky.enumeration.OperationType;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface DishMapper {

    /**
     * 新增菜品
     * @param
     * @return
     */
    @AutoFill(OperationType.INSERT)
    void insert(Dish dish);

    /**
     * 新增分类
     * @param
     * @return
     */
    @Select("select * from dish")
    List<Dish> queryAllDish();

    /**
     * 菜品分页查询
     * @Param dishPageQueryDTO
     * @return
     */
    Page<DishVO> pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 根据id查询菜品
     * @Param id
     * @return
     */
    @Select("select * from dish where id = #{id} ;")
    Dish getDishById(Long id);

    /**
     * 根据分类id查询菜品
     * @Param id
     * @return
     */
    @Select("select * from dish where category_id = #{categoryId}")
    List<Dish> getDishByCategoryId(Long categoryId);

    /**
     * 修改菜品
     * @Param dish
     * @return
     */
    @AutoFill(value = OperationType.UPDATE)
    void update(Dish dish);

    /**
     * 根据id删除菜品
     * @Param Long
     * @return
     */
    @Delete("delete from dish where id = #{id}")
    void deleteById(Long id);

}
