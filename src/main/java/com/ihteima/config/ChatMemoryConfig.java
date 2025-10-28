package com.ihteima.config;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: ChatMemoryConfig
 * Package: com.ihteima.config
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 12:56
 * @Version 1.0
 */
@Configuration
public class ChatMemoryConfig {
    
    @Bean
    public ChatMemory chatMemory() {

        return MessageWindowChatMemory.withMaxMessages(10);
    }
}
