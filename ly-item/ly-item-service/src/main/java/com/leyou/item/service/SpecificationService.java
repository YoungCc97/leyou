package com.leyou.item.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.mapper.SpecificationMapper;
import com.leyou.pojo.Specification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * @author Young
 * @date 2019/4/8 20:39
 * @description：
 */
@Service
public class SpecificationService {

    @Autowired
    private SpecificationMapper specificationMapper;

    public Specification queryById(Long id) {
        Specification specification = this.specificationMapper.selectByPrimaryKey(id);
        //判断查询结果
        if(specification == null){
            throw new LyException(ExceptionEnum.SPECIFICATION_NOT_FOUND);
        }
        return specification;
    }
}
