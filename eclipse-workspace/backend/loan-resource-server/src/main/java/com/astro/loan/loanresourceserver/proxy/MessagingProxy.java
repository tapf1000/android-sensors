package com.astro.loan.loanresourceserver.proxy;

import com.astro.loan.loanresourceserver.dto.Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;


@FeignClient(name = "instant-loan-api-gateway",url = "localhost:8084/loan-messaging")
public interface MessagingProxy {

    @PostMapping(value = "/send/message",consumes = {"application/json"})
    String sendMessage(@RequestPart Message message);
}
