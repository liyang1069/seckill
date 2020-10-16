package com.sk.seckill.domain.product;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * describe:
 *
 * @author lijian575
 * @date 2020/10/15
 */
@Getter
@Setter
public class Sku implements Serializable {

    private Long id;
    private Long productionId;
    private String color;
    private Long weight;
    private BigDecimal price;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
