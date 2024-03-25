package com.chandol.coinhub.controller;

import com.chandol.coinhub.service.CommonMarketService;
import com.chandol.coinhub.service.MarketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class MarketController {

    private final CommonMarketService commonMarketService;
    private final Map<String, MarketService> marketServices;

    @GetMapping("/price") // 코인의 최근 가격 : 어떤 마켓, 어떤 코인인지
    public double getPrice(@RequestParam(value="market") String market, @RequestParam(value="coin") String coin) {
        return commonMarketService.getPrice(market, coin);
    }
    @GetMapping("/coins")
    public List<String> getCoins(@RequestParam(name = "market") String market) {
        return CommonMarketService.getMarketService(marketServices, market).getCoins();
    }

    @GetMapping("/common-coins")
    public List<String> getCommonCoins(@RequestParam(name = "market1") String market1, @RequestParam(name = "market2") String market2) {
        return commonMarketService.getCommonCoin(market1, market2);
    }
}
