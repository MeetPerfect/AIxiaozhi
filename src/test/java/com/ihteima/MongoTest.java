package com.ihteima;

import com.ihteima.domain.dos.ChatMessages;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * ClassName: PostgresTest
 * Package: com.ihteima
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 13:42
 * @Version 1.0
 */
@SpringBootTest
public class MongoTest {

    @Autowired
    private MongoTemplate mongoTemplate;
    
    @Test
    public void test(){
        
//        mongoTemplate.insert(new ChatMessages(1L, "你是谁"));
        
    }
}
