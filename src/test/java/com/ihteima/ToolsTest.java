package com.ihteima;

import com.ihteima.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: ToolsTest
 * Package: com.ihteima
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 19:24
 * @Version 1.0
 */
@SpringBootTest
public class ToolsTest {
    @Autowired
    private SeparateChatAssistant separateChatAssistant;
    
    
    @Test
    public void test(){
        String chat = separateChatAssistant.chat(1, "1+2等于几，475695037565的平方根是多少？");

        System.out.println(chat);
    }
}
