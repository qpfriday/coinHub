package com.chandol.coinhub.service;

import org.springframework.stereotype.Service;

@Service
public class UpbitmarketService implements MarketService {
    @Override
    public double getCoinCurrentPrice(String coin) {
        return 123.2;
    }
}
