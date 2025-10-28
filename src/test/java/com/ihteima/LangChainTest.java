package com.ihteima;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.community.model.dashscope.WanxImageModel;
import dev.langchain4j.data.image.Image;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.output.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;

/**
 * ClassName: LangChainTest
 * Package: com.ihteima
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/25 21:23
 * @Version 1.0
 */
@SpringBootTest
public class LangChainTest {

    @Test
    public void test() {

        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://langchain4j.dev/demo/openai/v1")
                .apiKey("demo")
                .modelName("gpt-4o-mini")
                .build();

        String chat = model.chat("你是谁?");
        System.out.println(chat);

    }


    @Autowired
    private OpenAiChatModel openAiChatModel;

    @Test
    public void test1() {
        String chat = openAiChatModel.chat("你是谁?");
        System.out.println(chat);
    }

    @Autowired
    private QwenChatModel qwenChatModel;

    @Test
    public void test3() {
        String chat = qwenChatModel.chat("你是谁");
        System.out.println(chat);
    }

    @Test
    public void test4() {
        WanxImageModel build = WanxImageModel.builder()
                .modelName("wanx2.1-t2i-plus")
                .apiKey(System.getenv("DASH_SCOPE_API_KEY"))
                .build();

        Response<Image> response = build.generate("奇幻森林精灵：在一片弥漫着轻柔薄雾的\n" +
                "古老森林深处，阳光透过茂密枝叶洒下金色光斑。一位身材娇小、长着透明薄翼的精灵少女站在一朵硕大的蘑菇上。她\n" +
                "有着海藻般的绿色长发，发间点缀着蓝色的小花，皮肤泛着珍珠般的微光。身上穿着由翠绿树叶和白色藤蔓编织而成的\n" +
                "连衣裙，手中捧着一颗散发着柔和光芒的水晶球，周围环绕着五彩斑斓的蝴蝶，脚下是铺满苔藓的地面，蘑菇和蕨类植\n" +
                "物丛生，营造出神秘而梦幻的氛围。");
        URI url = response.content().url();

        System.out.println(url);
    }

    @Test
    public void test5() {
//        WanxImageModel model = new WanxImageModel();
//
//        Response<Image> response = model.generate("生成一只猪");
//        System.out.println(response.getOutput().getUrl());
    }
}
