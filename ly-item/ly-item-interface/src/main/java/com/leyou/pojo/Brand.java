package com.leyou.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Young
 * @date 2019/4/2 19:09
 * @description：品牌对象
 */
@Data
@Table(name = "tb_brand")
public class Brand {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;//品牌名称
    private String image;//品牌图片
    private Character letter;//品牌的首字母
}
