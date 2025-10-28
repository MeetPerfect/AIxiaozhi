package com.ihteima.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

/**
 * ClassName: SeparateChatAssistant
 * Package: com.ihteima.assistant
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 13:01
 * @Version 1.0
 */

@AiService(wiringMode = EXPLICIT,
        chatModel = "qwenChatModel",
        chatMemory = "chatMemory",
        chatMemoryProvider = "chatMemoryProvider",
        tools = "calculatorTools")
public interface SeparateChatAssistant {

    //    @SystemMessage("你是我的好朋友，请用东北话回答问题。今天是{{current_date}}")
    @SystemMessage(fromResource = "my-prompt-template.txt")
    String chat(@MemoryId int memoryId, @UserMessage String userMessage);

    @UserMessage("你是我的好朋友，请用粤语回答。{{message}}")
    String chat2(@MemoryId int memoryId, @V("message") String userMessage);

    @SystemMessage(fromResource = "my-prompt-template.txt")
    String chat3(@MemoryId int memoryId,
                 @UserMessage String userMessage,
                 @V("username") String username,
                 @V("age") int age);
}
