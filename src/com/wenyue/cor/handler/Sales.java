package com.wenyue.cor.handler;

/**
 * ���ۣ�������׼5%���ڵ��ۿ�
 * Created by wswenyue on 2015/8/15.
 */
public class Sales extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount<=0.05){
            System.out.format("%s��׼���ۿ�:%.2f%n",this.getClass().getName(),discount);
        }else {
            successor.processDiscount(discount);
        }
    }
}
