package com.wenyue.cor.handler;

/**
 * 销售，可以批准5%以内的折扣
 * Created by wswenyue on 2015/8/15.
 */
public class Sales extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount<=0.05){
            System.out.format("%s批准了折扣:%.2f%n",this.getClass().getName(),discount);
        }else {
            successor.processDiscount(discount);
        }
    }
}
