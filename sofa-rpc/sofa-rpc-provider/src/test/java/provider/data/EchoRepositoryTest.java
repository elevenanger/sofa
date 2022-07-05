package provider.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import provider.data.po.EchoPO;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author : liuanglin
 * date : 2022/7/4 19:04
 * description :
 */
@SpringBootTest
class EchoRepositoryTest {

    @Autowired
    EchoRepository echoRepository;

    @Test
    void saveEchoInfo() {
        final EchoPO info = new EchoPO();
        info.setInfo("first");
        EchoPO savedEcho = echoRepository.save(info);
        System.out.println(savedEcho);
        assertEquals(info.getInfo(), savedEcho.getInfo());
    }
}