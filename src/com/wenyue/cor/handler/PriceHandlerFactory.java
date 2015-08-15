package com.wenyue.cor.handler;

/**
 * ����������ʵ�ʣ������ڴ���Ĳ��������������ķ��صĽ��
 * ������Ϊ�Ϸ�����һ������Ķ��������һ������Ķ���
 *���ڲ��������ޡ��Լ��������������ҵ�������
 *
 * Created by wswenyue on 2015/8/15.
 */
public class PriceHandlerFactory {


    /**
     * ����PriceHandler�Ĺ�������
     * @return PriceHandler�����ࣨҵ��ӿڣ�
     */
    public static PriceHandler createPriceHandler() {

        PriceHandler sales = new Sales();
        PriceHandler lead = new Lead();
        PriceHandler man = new Manager();
        PriceHandler dir = new Director();
        PriceHandler vp = new VicePresident();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(lead);//sales��ֱ�Ӻ����manage
        lead.setSuccessor(man);
        man.setSuccessor(dir);//manage�ĺ����director
        dir.setSuccessor(vp);//...
        vp.setSuccessor(ceo);//...ceo�����������յ�

        return sales;//�������������sales
    }
}
