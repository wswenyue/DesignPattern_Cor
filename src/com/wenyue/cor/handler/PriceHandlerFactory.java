package com.wenyue.cor.handler;

/**
 * 工场方法的实质：不在于传入的参数，而在于它的返回的结果
 * 她从行为上返回了一个抽象的对象而不是一个具体的对象
 *至于参数的有无、以及个数，这决定于业务的需求
 *
 * Created by wswenyue on 2015/8/15.
 */
public class PriceHandlerFactory {


    /**
     * 创建PriceHandler的工场方法
     * @return PriceHandler抽象类（业务接口）
     */
    public static PriceHandler createPriceHandler() {

        PriceHandler sales = new Sales();
        PriceHandler lead = new Lead();
        PriceHandler man = new Manager();
        PriceHandler dir = new Director();
        PriceHandler vp = new VicePresident();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(lead);//sales的直接后继是manage
        lead.setSuccessor(man);
        man.setSuccessor(dir);//manage的后继是director
        dir.setSuccessor(vp);//...
        vp.setSuccessor(ceo);//...ceo是责任链的终点

        return sales;//责任链的起点是sales
    }
}
