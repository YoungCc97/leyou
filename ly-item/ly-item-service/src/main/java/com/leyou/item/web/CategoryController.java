package com.leyou.item.web;

import com.leyou.item.service.BrandService;
import com.leyou.item.service.CategoryService;
import com.leyou.pojo.Brand;
import com.leyou.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Young
 * @date 2019/4/1 15:26
 * @description：
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     *   @author Young
     *   @date 2019/4/1 15:29
     *   @description：根据父节点ID查询商品分类
    */   
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoryListByPid(@RequestParam("pid")Long pid){
        return ResponseEntity.ok(categoryService.queryCategoryListByPid(pid));
    }
}
