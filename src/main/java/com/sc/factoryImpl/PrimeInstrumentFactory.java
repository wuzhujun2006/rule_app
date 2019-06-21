package com.sc.factoryImpl;

import com.sc.factory.InstrumentFactory;
import com.sc.instrument.LmeInstrumentDetails;
import com.sc.instrument.PrimeInstrumentDetails;
import com.sc.instrument.InstrumentDetails;
import com.sc.product.LmeProduct;
import com.sc.product.PrimeProduct;

/**
 * Created by wuzj47 on 2019/6/20.
 */
public class PrimeInstrumentFactory implements InstrumentFactory {

    private LmeInstrumentFactory lmeInstrumentFactory;

    private LmeInstrumentDetails lmeInstrument;

    private Boolean tradable;

    public PrimeInstrumentFactory(LmeInstrumentFactory lmeInstrumentFactory, LmeInstrumentDetails lmeInstrument, Boolean tradable) {
        this.lmeInstrumentFactory = lmeInstrumentFactory;
        this.lmeInstrument = lmeInstrument;
        this.tradable = tradable;
    }

    @Override
    public String getInstrumentName() {
        return "PRIME_PB_03_2018";
    }

    @Override
    public PrimeProduct publishProductByInstrument(InstrumentDetails instrument, Boolean tradable) {
        String name = instrument.getInstrumentName();
        PrimeInstrumentDetails bid = (PrimeInstrumentDetails)instrument.getInsrumentDetails();
        LmeProduct product = (LmeProduct)lmeInstrumentFactory.publishProductByInstrument(lmeInstrument, tradable);

        if(getInstrumentName().equals(name) && bid.getExchangeCode().contains(lmeInstrumentFactory.getInstrumentName())) {
            return new PrimeProduct(product.getLastTradingDate(), product.getDeliveryDate(), product.getMarket(), product.getLabel(), bid.getTradable());
        } else {
            return null;
        }
    }
}
