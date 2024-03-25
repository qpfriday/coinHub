package com.chandol.coinhub.service;

import com.chandol.coinhub.dto.CoinBuyDto;
import com.chandol.coinhub.dto.CoinSellDto;
import com.chandol.coinhub.dto.TransferCalculateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TransferCalculateService {

    private final CommonMarketService commonMarketService;
    private final Map<String, MarketService> marketServices;

    public TransferCalculateDto calculate(String fromMarket, String toMarket, double amount) {
//        // 1. 두 마켓에 공통으로 존재하는 코인을 계산 (from, to : common coin)
//        List<String> commonCoins = commonMarketService.getCommonCoin(fromMarket, toMarket);
//
//        MarketService fromMarketService = CommonMarketService.getMarketService(marketServices, fromMarket);
//        MarketService toMarketService = CommonMarketService.getMarketService(marketServices, toMarket);
//
//        // 2. 모든 코인들에 대해 각 마켓에 얼마에 팔고 수수료는 얼마인지 계산
//        // from 얼마에 살 수 있는지
//        CoinBuyDto fromMarketBuyDto = fromMarketService.calculateBuy(commonCoins, amount);
//        // from 이체 수수료
//        Map<String, Double> fromMarketTransferFee = fromMarketService.calculateFee(commonCoins, amount);
//
//        // to 얼마에 팔 수 잇는지
//        CoinSellDto toMarketSellDto = toMarketService.calculateSell(commonCoins, amount);
//
//        // 가장 높은 값을 받을 수 있는 코인 선택
//        String transferCoin = toMarketSellDto.getAmounts().keySet().get(0); // TODO: 가장 많은 현금 코인 선택
//
//        return new TransferCalculateDto(transferCoin,
//                toMarketSellDto.getAmounts().get(transferCoin),
//                fromMarketBuyDto.getOrderBooks().get(transferCoin),
//                toMarketSellDto.getOrderBooks().get(transferCoin)
//        );
        return null;
    }
}
