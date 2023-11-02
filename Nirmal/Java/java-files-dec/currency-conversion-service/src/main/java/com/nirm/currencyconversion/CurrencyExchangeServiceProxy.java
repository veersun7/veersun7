package com.nirm.currencyconversion;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="currency-exchange-service",url="localhost:8100")
public interface CurrencyExchangeServiceProxy {

}
