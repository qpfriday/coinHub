package com.chandol.coinhub.controller;

import com.chandol.coinhub.service.TransferCalculateService;
import com.chandol.coinhub.view.TransferCalculateResponseView;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequiredArgsConstructor
public class TransferCalculateController {

    private final TransferCalculateService transferCalculateService;

    @GetMapping("/transfer-calculate")
    public TransferCalculateResponseView getPrice(
            @RequestParam(name = "fromMarket") String fromMarket,
            @RequestParam(name = "toMarket") String toMarket,
            @RequestParam(name = "amount") double amount
    ) {
        return new TransferCalculateResponseView("BTC", 123.45,
        Map.of(123D, 456D),
        Map.of(123D, 456D));
//        return TransferCalculateResponseView.of(transferCalculateService.calculate(fromMarket, toMarket, amount));
    }
}
