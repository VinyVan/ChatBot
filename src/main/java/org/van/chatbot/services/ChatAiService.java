package org.van.chatbot.services;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;
import java.util.Map;

@BrowserCallable
@AnonymousAllowed
public class ChatAiService {

    private ChatClient chatClient;
    public  ChatAiService(ChatClient.Builder buider){
        this.chatClient=buider.build();
    }

    public  String chatBot(String question){
        return chatClient.prompt().user(question).call().content();
    }



}
