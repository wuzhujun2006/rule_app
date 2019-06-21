package com.sc.factoryImpl;

import com.sc.factory.InstrumentFactory;
import com.sc.instrument.LmeInstrumentDetails;
import com.sc.instrument.InstrumentDetails;
import com.sc.product.LmeProduct;

/**
 * Created by wuzj47 on 2019/6/20.
 */
public class LmeInstrumentFactory implements InstrumentFactory {


    @Override
    public String getInstrumentName() {
        return "PB_03_2018";
    }

    @Override
    public LmeProduct publishProductByInstrument(InstrumentDetails instrument, Boolean tradable) {
        String name = instrument.getInstrumentName();
        LmeInstrumentDetails id = (LmeInstrumentDetails)instrument.getInsrumentDetails();
        if(getInstrumentName().equals(name)) {
            return new LmeProduct(id.getLastTradingDate(), id.getDeliveryDate(), id.getMarket().replace("LME_",""), id.getLabel(), tradable);
        } else {
            return null;
        }
    }
}
