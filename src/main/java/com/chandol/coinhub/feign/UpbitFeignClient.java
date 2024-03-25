package com.chandol.coinhub.feign;

import com.chandol.coinhub.model.UpbitCoinPrice;
import com.chandol.coinhub.model.UpbitMarketCode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "upbit", url = "https://api.upbit.com/v1")
public interface UpbitFeignClient {
    @GetMapping("/ticker")
    List<UpbitCoinPrice> getCoinPrice(@RequestParam("markets") String coin);
    @GetMapping("/market/all")
    List<UpbitMarketCode> getMarketCode();
}
