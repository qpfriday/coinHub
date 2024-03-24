package com.chandol.coinhub.service;

import org.springframework.stereotype.Service;

@Service
public class BithubMarketService implements MarketService {
    @Override
    public double getCoinCurrentPrice(String coin) {
        return 123.1;
    }
}
