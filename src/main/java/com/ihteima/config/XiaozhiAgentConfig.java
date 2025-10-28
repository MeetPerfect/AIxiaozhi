package com.ihteima.config;

import com.ihteima.store.MongoChatMemoryStore;
import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: XiaozhiAgentConfig
 * Package: com.ihteima.config
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 18:49
 * @Version 1.0
 */
@Configuration
public class XiaozhiAgentConfig {
    
    @Autowired
    private MongoChatMemoryStore mongoChatMemoryStore;
    
    @Bean
    public ChatMemoryProvider chatMemoryProviderXiaozhi() {
        return memoryId -> MessageWindowChatMemory.builder()
                .id(memoryId)
//                .chatMemoryStore(new InMemoryChatMemoryStore())
                .maxMessages(20)
                .chatMemoryStore(mongoChatMemoryStore)
                .build();
    }
}
