package me.zeroest.pinpoint.example.agent2.controller;

import lombok.RequiredArgsConstructor;
import me.zeroest.pinpoint.example.agent2.client.AgentTwoClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/agent-one")
public class AgentOneController {

    private final AgentTwoClient agentTwoClient;

    @GetMapping(path = "/key-value")
    public String getKeyValue(
            @RequestParam String key,
            @RequestParam String value
    ) {
        return String.format("1-%s : 1-%s", key, value);
    }

    @GetMapping(path = "/two/key-value")
    public String getTwoKeyValue(
            @RequestParam String key,
            @RequestParam String value
    ) {
        return agentTwoClient.getTwoKeyValue(key, value);
    }

}
