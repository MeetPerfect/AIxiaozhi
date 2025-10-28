package com.ihteima.domain.dos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * ClassName: ChatMessage
 * Package: com.ihteima.domain.dos
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 14:23
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("chat_messages")
public class ChatMessages {

    @Id
    private ObjectId id;
    
    private int messageId;
    
    private String content; //存储当前聊天记录列表的json字符串
}
