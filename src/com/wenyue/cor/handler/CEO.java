package com.wenyue.cor.handler;

/**
 * CEO��������׼55%���ڵ��ۿ�
 * �ۿ۳���55%���;ܾ�����
 *
 * Created by wswenyue on 2015/8/15.
 */
public class CEO extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount<=0.55){
            System.out.format("%s��׼���ۿ�:%.2f%n", this.getClass().getName(), discount);
        }else {
            System.out.format("%s�ܾ����ۿ�:%.2f%n", this.getClass().getName(), discount);
        }
    }
}
