package com.ihteima.assistant;

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
@AiService(wiringMode = EXPLICIT, chatModel = "qwenChatModel")
public interface Assistant {

    String chat(String userMessage);
}
