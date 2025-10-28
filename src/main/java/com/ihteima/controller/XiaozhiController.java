package com.ihteima.controller;

import com.ihteima.assistant.XiaozhiAgent;
import com.ihteima.domain.dos.ChatForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: XiaozhiController
 * Package: com.ihteima.controller
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 18:52
 * @Version 1.0
 */
@Tag(name = "小智")
@RestController
@RequestMapping("/xiaozhi")
public class XiaozhiController {
    
    @Autowired
    private XiaozhiAgent xiaozhiAgent;
    
    @Operation(summary = "小智对话功能")
    @PostMapping("/chat")
    public String chat(@RequestBody ChatForm chatForm) {
        
        return xiaozhiAgent.chat(chatForm.getMemoryId(), chatForm.getMessage());
    }
}
