package me.zeroest.pinpoint.example.agent2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "agent-one", url = "${pinpoint.agent.one}")
public interface AgentOneClient {

    @GetMapping(path = "/agent-one/key-value")
    String getOneKeyValue(
            @RequestParam String key,
            @RequestParam String value
    );

}
