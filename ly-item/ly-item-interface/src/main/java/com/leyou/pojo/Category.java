package com.leyou.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Young
 * @date 2019/4/1 15:16
 * @description：商品分类实体类
 */
@Table(name="tb_category")
@Data
public class Category {
    @Id
    @KeySql(useGeneratedKeys=true)
    private Long id;//类目id
    private String name;//类目名称
    private Long parentId;//父类目id
    private Boolean isParent;//是否为父节点
    private Integer sort;//排序指数，越小越靠前
}
