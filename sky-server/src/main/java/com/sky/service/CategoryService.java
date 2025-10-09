package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Category;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

import java.util.List;

public interface CategoryService {

    /*
     * 新增分类
     * @param category
     * @return
     *
     * */
    void save(CategoryDTO categoryDTO);

    /**
     * 分类分页查询
     * @param categoryPageQueryDTO
     * @return
     */
    PageResult pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    /**
     * 根据类型查询分类
     * @param type
     * @return
     */
    List<Category> getCategoryByType(Integer type);

    /**
     * 启用禁用分类
     *
     * @param status
     * @param id
     * @return
     */
    void startOrStop(Integer status, long id);

    /**
     * 修改分类
     *
     * @param categoryDTO
     * @return
     */
    void edit(CategoryDTO categoryDTO);

    /**
     * 删除分类
     *
     * @param id
     * @return
     */
    void delete(Integer id);
}
