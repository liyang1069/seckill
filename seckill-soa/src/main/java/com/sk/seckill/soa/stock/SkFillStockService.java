package com.sk.seckill.soa.stock;

import com.sk.seckill.inner.domain.request.SkFillStockRequest;
import com.sk.seckill.inner.domain.response.SkFillStockResponse;

/**
 * describe:
 *
 * @author lijian575
 * @date 2020/10/15
 */
public interface SkFillStockService {

    /**
     * fill stock
     */
    SkFillStockResponse fillStock4Sku(SkFillStockRequest skFillStockRequest);

}
