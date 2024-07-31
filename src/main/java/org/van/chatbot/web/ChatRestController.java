package org.van.chatbot.web;

import org.springframework.ai.chat.messages.Media;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.van.chatbot.services.ChatAiService;

import java.awt.*;

@RestController
@RequestMapping("/chat")
public class ChatRestController {
    private ChatAiService chatAiService;

    public ChatRestController(ChatAiService chatAiService){
        this.chatAiService=chatAiService;

    }
    @GetMapping(value = "/ask",produces = MediaType.TEXT_PLAIN_VALUE)
    public String ask(String question){
        return  chatAiService.chatBot(question);
    }

}
