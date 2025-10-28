package com.ihteima.config;

import com.ihteima.store.MongoChatMemoryStore;
import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: SeparateChatAssistantConfig
 * Package: com.ihteima.config
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 13:02
 * @Version 1.0
 */
@Configuration
public class SeparateChatAssistantConfig {
    
    @Autowired
    private MongoChatMemoryStore mongoChatMemoryStore;
    
    @Bean
    public ChatMemoryProvider chatMemoryProvider() {
        return memoryId -> MessageWindowChatMemory.builder()
                .id(memoryId)
//                .chatMemoryStore(new InMemoryChatMemoryStore())
                .maxMessages(10)
                .chatMemoryStore(mongoChatMemoryStore)
                .build();
    }
}
