package me.zeroest.pinpoint.example.agent2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "agent-two", url = "${pinpoint.agent.two}")
public interface AgentTwoClient {

    @GetMapping(path = "/agent-two/key-value")
    String getTwoKeyValue(
            @RequestParam String key,
            @RequestParam String value
    );

}
