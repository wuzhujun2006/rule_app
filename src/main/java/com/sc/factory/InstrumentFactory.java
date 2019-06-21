package com.sc.factory;

import com.sc.product.Product;
import com.sc.instrument.InstrumentDetails;

/**
 * Created by wuzj47 on 2019/6/20.
 */
public interface InstrumentFactory {

    public String getInstrumentName();

    public Product publishProductByInstrument(InstrumentDetails instrument, Boolean tradable);

}
