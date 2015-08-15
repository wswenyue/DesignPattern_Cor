package com.wenyue.cor.test;

import com.wenyue.cor.Customer;
import com.wenyue.cor.handler.PriceHandlerFactory;

import java.util.Random;

/**
 * Created by wswenyue on 2015/8/15.
 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
        //使用随机数来生成折扣
        Random random = new Random();

        for (int i = 0; i <= 100; i++) {
            System.out.print(i + ":");
            customer.requestDiscount(random.nextFloat());
        }


    }
}
