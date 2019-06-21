package com.sc.instrument;

/**
 * Created by wuzj47 on 2019/6/20.
 */
public class PrimeInstrumentDetails extends BaseInstrumentDetails implements InstrumentDetails {

    private String instrumentName;

    private String exchangeCode;

    private Boolean tradable;

    public String getExchangeCode() {
        return exchangeCode;
    }

    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    public Boolean getTradable() {
        return tradable;
    }

    public void setTradable(Boolean tradable) {
        this.tradable = tradable;
    }

    public PrimeInstrumentDetails(String lastTradingDate, String deliveryDate, String market, String label,
                                  String exchangeCode, Boolean tradable, String instrumentName) {
        super(lastTradingDate, deliveryDate, market, label);
        this.instrumentName = instrumentName;
        this.exchangeCode = exchangeCode;
        this.tradable = tradable;
    }

    @Override
    public String getInstrumentName() {
        return instrumentName;
    }

    @Override
    public BaseInstrumentDetails getInsrumentDetails() {
        return this;
    }

}
