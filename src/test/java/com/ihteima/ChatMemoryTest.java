package com.ihteima;

import com.ihteima.assistant.Assistant;
import com.ihteima.assistant.SeparateChatAssistant;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.response.ChatResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

/**
 * ClassName: ChatMemoryTest
 * Package: com.ihteima
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 12:42
 * @Version 1.0
 */
@SpringBootTest
public class ChatMemoryTest {

    @Autowired
    private Assistant assistant;


    @Autowired
    private QwenChatModel qwenChatModel;

    @Test
    public void test1() {
        UserMessage userMessage1 = UserMessage.userMessage("我是小明");
        ChatResponse chatResponse1 = qwenChatModel.chat(userMessage1);
        AiMessage aiMessage1 = chatResponse1.aiMessage();

        System.out.println(aiMessage1.text());

        UserMessage userMessage2 = UserMessage.userMessage("你知道我是谁吗?");
        ChatResponse chatResponse2 = qwenChatModel.chat(Arrays.asList(userMessage1, aiMessage1, userMessage2));
        AiMessage aiMessage = chatResponse2.aiMessage();
        System.out.println(aiMessage.text());
    }
    
    @Autowired
    private SeparateChatAssistant separateChatAssistant;
    

}
