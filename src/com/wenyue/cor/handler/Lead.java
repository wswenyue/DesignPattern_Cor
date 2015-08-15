package com.wenyue.cor.handler;

/**
 * ����С�鳤��������׼15%���ڵ��ۿ�
 *
 * Created by wswenyue on 2015/8/15.
 */
public class Lead extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.15) {
            System.out.format("%s��׼���ۿ�:%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
