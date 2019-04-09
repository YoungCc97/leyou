package com.leyou.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Young
 * @date 2019/4/8 20:36
 * @description：
 */
@Table(name = "tb_specification")
@Data
public class Specification {
    @Id
    private Long categoryId;
    private String specifications;
}
