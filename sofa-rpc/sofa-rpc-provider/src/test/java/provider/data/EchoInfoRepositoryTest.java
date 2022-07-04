package provider.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import provider.data.po.EchoInfo;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author : liuanglin
 * date : 2022/7/4 19:04
 * description :
 */
@SpringBootTest
class EchoInfoRepositoryTest {

    @Autowired
    EchoInfoRepository echoInfoRepository;

    @Test
    void saveEchoInfo() {
        final EchoInfo info = new EchoInfo();
        info.setInfo("first");
        EchoInfo savedEchoInfo = echoInfoRepository.save(info);
        System.out.println(savedEchoInfo);
        assertEquals(info.getInfo(), savedEchoInfo.getInfo());
    }
}