package com.leyou.common.vo;

import com.leyou.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @author Young
 * @date 2019/3/27 19:47
 * @description：异常返回结果
 */
@Data
public class ExceptionResult {
    //响应码
    private int status;
    //消息
    private String message;
    //时间戳
    private Long timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.message = em.getMsg();
        this.timestamp = System.currentTimeMillis();
    }
}
