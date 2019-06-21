package com.sc.instrument;

/**
 * Created by wuzj47 on 2019/6/20.
 */
public class LmeInstrumentDetails extends BaseInstrumentDetails implements InstrumentDetails {

    private String instructmentName;

    public LmeInstrumentDetails(String lastTradingDate, String deliveryDate, String market, String label, String instructName) {
        super(lastTradingDate, deliveryDate, market, label);
        this.instructmentName = instructName;
    }

    @Override
    public String getInstrumentName() {
        return instructmentName;
    }

    @Override
    public BaseInstrumentDetails getInsrumentDetails() {
        return this;
    }
}
