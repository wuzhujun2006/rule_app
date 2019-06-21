package com.sc;

import com.alibaba.fastjson.JSONObject;
import com.sc.factory.InstrumentFactory;
import com.sc.factoryImpl.LmeInstrumentFactory;
import com.sc.factoryImpl.PrimeInstrumentFactory;
import com.sc.instrument.InstrumentDetails;
import com.sc.instrument.LmeInstrumentDetails;
import com.sc.instrument.PrimeInstrumentDetails;
import com.sc.product.Product;


/**
 * Created by wuzj47 on 2019/6/20.
 */
public class TestRuleApp {

    public static void main(String[] args) {
        InstrumentFactory inf = new LmeInstrumentFactory();
        InstrumentDetails ind = new LmeInstrumentDetails("15-03-2018", "17-03-2018", "LME_PB", "Lead 13 March 2018", "PB_03_2018");
        Product baseProduct = inf.publishProductByInstrument(ind, true);
        System.out.println(">>>>程序生成LME规则对应的交易信息:" + JSONObject.toJSONString(baseProduct));

        InstrumentFactory inf2 = new PrimeInstrumentFactory((LmeInstrumentFactory)inf, (LmeInstrumentDetails)ind, false);
        InstrumentDetails ind2 = new PrimeInstrumentDetails("14-03-2018", "18-03-2018", "LME_PB", "Lead 13 March 2018", "PB_03_2018", false, "PRIME_PB_03_2018");
        Product baseProduct2 = inf2.publishProductByInstrument(ind2, false);
        System.out.println(">>>>程序生成PRIME规则对应的交易信息:" + JSONObject.toJSONString(baseProduct2));

    }
}
