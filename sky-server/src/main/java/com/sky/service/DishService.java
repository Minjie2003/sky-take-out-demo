package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {
    /*
     * 新增菜品和对应的口味
     * @param dishDTO
     * @return
     *
     * */
    void saveWithFlavor(DishDTO dishDTO);

    /**
     * 菜品分页查询
     * @Param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 根据id查询菜品和对应的口味
     * @Param id
     * @return
     */
    DishVO getDishById(Long id);

    /**
     * 删除菜品
     * @Param
     * @return
     */
    void deleteBatch(List<Long> ids);

    /**
     * 根据分类id查询菜品
     * @Param id
     * @return
     */
    List<Dish> getDishByCategoryId(Long categoryId);

    /**
     * 修改菜品
     * @Param dishDTO
     * @return
     */
    void updateWithFlavor(DishDTO dishDTO);

    /**
     * 菜品起售停售
     * @Param status id
     * @return
     */
    void startOrStop(Integer status,Long id);
}
