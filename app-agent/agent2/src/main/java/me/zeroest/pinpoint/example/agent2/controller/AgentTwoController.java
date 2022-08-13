package me.zeroest.pinpoint.example.agent2.controller;

import lombok.RequiredArgsConstructor;
import me.zeroest.pinpoint.example.agent2.client.AgentOneClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/agent-two")
public class AgentTwoController {

    private final AgentOneClient agentOneClient;

    @GetMapping(path = "/key-value")
    public String getKeyValue(
            @RequestParam String key,
            @RequestParam String value
    ) {
        return String.format("2-%s : 2-%s", key, value);
    }

    @GetMapping(path = "/one/key-value")
    public String getTwoKeyValue(
            @RequestParam String key,
            @RequestParam String value
    ) {
        return agentOneClient.getOneKeyValue(key, value);
    }

}
