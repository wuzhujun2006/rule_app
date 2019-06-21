package com.sc.product;


/**
 * Created by wuzj47 on 2019/6/20.
 */
public class PrimeProduct extends BaseProduct implements Product {
    public PrimeProduct(String lastTradingDate, String deliveryDate, String market, String label, Boolean tradable) {
        super(lastTradingDate, deliveryDate, market, label, tradable);
    }

    @Override
    public String describe() {
        return "PrimeProduct";
    }
}
