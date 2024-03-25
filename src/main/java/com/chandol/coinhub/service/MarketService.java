package com.chandol.coinhub.service;

import org.springframework.stereotype.Service;

import java.util.List;

public interface MarketService {
    public double getCoinCurrentPrice(String coin);

    List<String> getCoins();
}
