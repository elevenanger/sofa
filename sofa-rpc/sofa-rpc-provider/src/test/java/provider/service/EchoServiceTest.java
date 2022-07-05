package provider.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author : liuanglin
 * date : 2022/7/4 19:23
 */
@SpringBootTest
class EchoServiceTest {

    @Autowired
    EchoService echoService;

    @Test
    void reEcho() {
        assertEquals("first",echoService.reEcho(1794L));
    }
}