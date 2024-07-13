package com.spring.spring_ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIController {

	/* @Autowired ChatClient chatClient; */
	
	private final ChatClient chatClient;

    public AIController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }
	
	@GetMapping("/promptOpenAI")
	public String prompt(@RequestParam String message) {
		System.out.println("Trying to reach OpenAI");
		return chatClient.call(message);
	}
}
