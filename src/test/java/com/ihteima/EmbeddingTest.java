package com.ihteima;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.model.output.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: EmbeddingTest
 * Package: com.ihteima
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 22:21
 * @Version 1.0
 */
@SpringBootTest
public class EmbeddingTest {
//    pcsk_3pN9x8_FvfRhuwDEfvrpfgwJnKwQHSvdddxqBicPDSfTGufWu3kn4ebnDB7A9nDemPnsq8
    @Autowired
    private EmbeddingModel embeddingModel;
    @Test
    public void testEmbeddingModel(){
        Response<Embedding> embed = embeddingModel.embed("你好");
        System.out.println("向量维度：" + embed.content().vector().length);
        System.out.println("向量输出：" + embed.toString());
    }
}
