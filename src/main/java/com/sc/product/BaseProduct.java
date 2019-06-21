package com.sc.product;

/**
 * Created by wuzj47 on 2019/6/20.
 */
public class BaseProduct {
    public String lastTradingDate;

    public String deliveryDate;

    public String market;

    public String label;

    public Boolean tradable;

    public BaseProduct(String lastTradingDate, String deliveryDate, String market, String label, Boolean tradable) {
        this.lastTradingDate = lastTradingDate;
        this.deliveryDate = deliveryDate;
        this.market = market;
        this.label = label;
        this.tradable = tradable;
    }

    public String getLastTradingDate() {
        return lastTradingDate;
    }

    public void setLastTradingDate(String lastTradingDate) {
        this.lastTradingDate = lastTradingDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getTradable() {
        return tradable;
    }

    public void setTradable(Boolean tradable) {
        this.tradable = tradable;
    }
}
