package javalearning.javalearning;

import javalearning.javalearning.mapper.BookMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaLearningApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void contextLoads() throws IOException {

    }

    @Test
    public void test(){
        System.out.println(bookMapper.se());
    }

}
