package com.myorg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyServiceApplication.class)
@WebAppConfiguration
public class MyServiceApplicationTests {

    @Test
    public void contextLoads() {
    }
    
    @Test
    public void testToFail () {
        assertTrue(false);
    }
}
