package com.chandol.coinhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@Service
public class CommonMarketService {

    MarketService marketService = null;

    // 각 market Service 의 이름을 키로 가져와서 매개변수로 사용하기 위해
    @Autowired
    Map<String, MarketService> marketServices;

    public double getPrice(String market, String coin) {
        for (String key : marketServices.keySet()) {
            if (key.substring(0, market.length()).equals(market.toLowerCase())) {
                marketService = marketServices.get(key);
                break;
            }
        }
        return marketService.getCoinCurrentPrice(coin);
    }
}
