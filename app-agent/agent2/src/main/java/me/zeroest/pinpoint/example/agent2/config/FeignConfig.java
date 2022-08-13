package me.zeroest.pinpoint.example.agent2.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients(basePackages = "me.zeroest.pinpoint.example.agent2")
@Configuration
public class FeignConfig {
}
