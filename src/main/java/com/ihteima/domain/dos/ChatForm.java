package com.ihteima.domain.dos;

import lombok.Data;

/**
 * ClassName: ChatForm
 * Package: com.ihteima.domain.dos
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 18:51
 * @Version 1.0
 */
@Data
public class ChatForm {
    /**
     * 对话Id
     */
    private Long memoryId;

    /**
     * 用户问题
     */
    private String message;
}
