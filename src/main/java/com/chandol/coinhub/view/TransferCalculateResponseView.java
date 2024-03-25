package com.chandol.coinhub.view;

import com.chandol.coinhub.dto.TransferCalculateDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter
@AllArgsConstructor
public class TransferCalculateResponseView {
    private String coin;
    private double amount;
    private Map<Double, Double> buyOrderBook;
    private Map<Double, Double> sellOrderBook;

    // DTO -> View
    public static TransferCalculateResponseView of(TransferCalculateDto dto) {
        return new TransferCalculateResponseView(
                dto.getCoin(),
                dto.getAmount(),
                dto.getBuyOrderBook(),
                dto.getSellOrderBook()
        );
    }
}
