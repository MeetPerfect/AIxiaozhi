package com.ihteima.tools;

import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.ToolMemoryId;
import org.springframework.stereotype.Component;

/**
 * ClassName: CalculatorTools
 * Package: com.ihteima.tools
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 19:22
 * @Version 1.0
 */
@Component
public class CalculatorTools {

    @Tool(name = "加法运算", value = "返回两个参数相加之和")
    double sum(@ToolMemoryId int memoryId, 
               @P(value = "加数1", required = true) double a, 
               @P(value = "加数2", required = true) double b) {
        System.out.println("调用加法");
        return a + b;
    }

    @Tool
    double squareRoot(@ToolMemoryId int memoryId, double x) {
        System.out.println("调用平方根运算");
        return Math.sqrt(x);
    }
}
