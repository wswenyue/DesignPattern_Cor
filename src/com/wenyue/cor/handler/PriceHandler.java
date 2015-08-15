package com.wenyue.cor.handler;

/**
 * 价格处理人，负责处理客户折扣申请
 * Created by wswenyue on 2015/8/15.
 */
public abstract class PriceHandler {
    protected PriceHandler successor;//后继

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理折扣申请
     * @param discount 折扣
     */
    public abstract void processDiscount(float discount);

}
