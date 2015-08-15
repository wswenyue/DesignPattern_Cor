package com.wenyue.cor.handler;

/**
 * �۸����ˣ�������ͻ��ۿ�����
 * Created by wswenyue on 2015/8/15.
 */
public abstract class PriceHandler {
    protected PriceHandler successor;//���

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * �����ۿ�����
     * @param discount �ۿ�
     */
    public abstract void processDiscount(float discount);

}
