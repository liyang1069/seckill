package com.sk.seckill.domain.product;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * describe:
 *
 * @author lijian575
 * @date 2020/10/15
 */
@Getter
@Setter
public class Production implements Serializable {

    private Long id;
    private String productionName;
    private String productionDesc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
