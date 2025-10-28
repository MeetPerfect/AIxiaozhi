package com.ihteima.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

/**
 * ClassName: XiaozhiAgent
 * Package: com.ihteima.assistant
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 18:45
 * @Version 1.0
 */
@AiService(wiringMode = EXPLICIT,
        chatModel = "qwenChatModel",
        chatMemoryProvider ="chatMemoryProviderXiaozhi")
public interface XiaozhiAgent {

    @SystemMessage(fromResource = "xiaozhi-prompt-template.txt")
    String chat(@MemoryId Long memoryId, @UserMessage String userMessage);
}
