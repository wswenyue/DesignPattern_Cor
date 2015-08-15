package com.wenyue.cor;

import com.wenyue.cor.handler.PriceHandler;

/**
 * �ͻ��������ۿ�
 * <p>
 * �ͻ�������ҵ��ʵ���߷������
 * �ͻ��������ھ����PriceHandler��ʵ���ߣ���ȥ����ϸ��
 * ���ں�˭��׼���ۿۣ�ֻ�ں����Ľ����
 * <p>
 * Created by wswenyue on 2015/8/15.
 */
public class Customer {
    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    /**
     * �ͻ������ۿ�
     *
     * @param discount �ۿ�
     */
    public void requestDiscount(float discount) {
        priceHandler.processDiscount(discount);
    }

}
