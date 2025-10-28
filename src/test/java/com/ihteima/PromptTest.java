package com.ihteima;

import com.ihteima.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: PromptTest
 * Package: com.ihteima
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 18:20
 * @Version 1.0
 */
@SpringBootTest
public class PromptTest {
    @Autowired
    private SeparateChatAssistant separateChatAssistant;
    
    @Test
    public void test(){
        String chat = separateChatAssistant.chat(5, "今天几号?");
        System.out.println(chat);
    }

    @Test
    public void testV(){
        String chat = separateChatAssistant.chat2(1, "我是小明");
        System.out.println(chat);
        String chat1 = separateChatAssistant.chat2(1, "我是谁?");
        System.out.println(chat1);
    }

    @Test
    public void testMultiV(){
        String chat = separateChatAssistant.chat3(1, "我是谁, 多大了?", "小明", 17);
        System.out.println(chat);
    }
}
