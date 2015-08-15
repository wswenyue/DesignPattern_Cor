package com.wenyue.cor;

import com.wenyue.cor.handler.PriceHandler;

/**
 * 客户、请求折扣
 * <p>
 * 客户与具体的业务实现者分离解耦
 * 客户不依赖于具体的PriceHandler的实现者，不去考虑细节
 * 不在乎谁批准了折扣，只在乎最后的结果，
 * <p>
 * Created by wswenyue on 2015/8/15.
 */
public class Customer {
    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    /**
     * 客户请求折扣
     *
     * @param discount 折扣
     */
    public void requestDiscount(float discount) {
        priceHandler.processDiscount(discount);
    }

}
