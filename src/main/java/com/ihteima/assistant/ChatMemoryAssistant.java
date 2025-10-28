package com.ihteima.assistant;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

/**
 * ClassName: Assistant
 * Package: com.ihteima.assistant
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/25 22:55
 * @Version 1.0
 */
@AiService(wiringMode = EXPLICIT,
        chatModel = "qwenChatModel",
        chatMemory = "chatMemory")
public interface ChatMemoryAssistant {
    
    @UserMessage("你是我的好朋友，请用上海话回答问题，并且添加一些表情符号。 {{it}}")
    String chat(String userMessage);
}
