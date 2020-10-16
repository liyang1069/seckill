package com.sk.seckill.domain.stock;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * describe:
 *
 * @author lijian575
 * @date 2020/10/15
 */
@Getter
@Setter
public class SkuStock implements Serializable {

    private Long id;
    private Long skuId;
    private Long stockNum;
    private Date validateEndDate;
    private Date validateBeginDate;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
