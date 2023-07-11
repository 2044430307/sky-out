package com.sky.dto;

import com.sky.entity.Dish;
import lombok.Data;

import java.util.List;


@Data
public class DishPageDto {
    private Integer total;
    List<Dish> records;
}
