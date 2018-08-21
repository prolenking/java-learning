package javalearning.javalearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("javalearning.javalearning.mapper")
public class JavaLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaLearningApplication.class, args);
    }
}
