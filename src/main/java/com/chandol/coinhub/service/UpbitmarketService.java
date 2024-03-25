package com.chandol.coinhub.service;

import com.chandol.coinhub.feign.UpbitFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UpbitmarketService implements MarketService {

    private final UpbitFeignClient upbitFeignClient;
    @Override
    public double getCoinCurrentPrice(String coin) {
        return upbitFeignClient.getCoinPrice("KRW-" + coin.toUpperCase())
                .get(0)
                .getTrade_price();
    }

    @Override
    public List<String> getCoins() {
        // API 로 가져오기
        List<String> result = new ArrayList<>();
        upbitFeignClient.getMarketCode().forEach(k -> {
            if (k.getMarket().startsWith("KRW")) {
                result.add(k.getMarket().substring(4).toUpperCase());
            }
        });
        return result;
    }
}
