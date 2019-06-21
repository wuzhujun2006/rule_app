package com.sc.instrument;

import java.sql.Timestamp;

/**
 * Created by wuzj47 on 2019/6/20.
 */
public class BaseInstrumentDetails {

    private String lastTradingDate;

    private String deliveryDate;

    private String market;

    private String label;

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

    public String getLastTradingDate() {
        return lastTradingDate;
    }

    public void setLastTradingDate(String lastTradingDate) {
        this.lastTradingDate = lastTradingDate;
    }

    public BaseInstrumentDetails(String lastTradingDate, String deliveryDate, String market, String label) {
        this.lastTradingDate = lastTradingDate;
        this.deliveryDate = deliveryDate;
        this.market = market;
        this.label = label;
    }


}
