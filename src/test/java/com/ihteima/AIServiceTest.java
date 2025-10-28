package com.ihteima;

import com.ihteima.assistant.Assistant;
import com.ihteima.assistant.ChatMemoryAssistant;
import com.ihteima.assistant.SeparateChatAssistant;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.service.AiServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: AIServiceTest
 * Package: com.ihteima
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 12:32
 * @Version 1.0
 */
@SpringBootTest
public class AIServiceTest {
    @Autowired
    private QwenChatModel qwenChatModel;

    @Test
    public void test() {

        Assistant assistant = AiServices.create(Assistant.class, qwenChatModel);
        String chat = assistant.chat("你是谁?");
        System.out.println(chat);
    }

    @Autowired
    private Assistant assistant;

    @Test
    public void test1() {
        String chat = assistant.chat("我是谁?");
        System.out.println(chat);
    }


    @Test
    public void test2() {
        MessageWindowChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);
        Assistant assistant = AiServices.builder(Assistant.class)
                .chatLanguageModel(qwenChatModel)
                .chatMemory(chatMemory)
                .build();

        String answer = assistant.chat("我是小明");
        System.out.println(answer);
        String chat = assistant.chat("你好,我是谁?");
        System.out.println(chat);
    }

    @Autowired
    private ChatMemoryAssistant chatMemoryAssistant;

    @Test
    public void test3() {


        String answer = chatMemoryAssistant.chat("我是小明");
        System.out.println(answer);
        String chat = chatMemoryAssistant.chat("你好,我是谁?");
        System.out.println(chat);
    }

    @Autowired
    private SeparateChatAssistant separateChatAssistant;

    @Test
    public void testChatMemory5(){

        String reponse1 = separateChatAssistant.chat(1, "我是小明");
        System.out.println(reponse1);
        String chat = separateChatAssistant.chat(1, "我是谁?");
        System.out.println(chat);
        String chat1 = separateChatAssistant.chat(2, "我是谁?");
        System.out.println(chat1);
        
    }

    @Test
    public void testChatMemory6(){
        String chat = chatMemoryAssistant.chat("我是小明");
        System.out.println(chat);
    }
    
}
