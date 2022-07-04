package provider.service.implementation;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import provider.data.EchoInfoRepository;
import provider.data.po.EchoInfo;
import provider.service.EchoService;

/**
 * author : liuanglin
 * date : 2022/7/4 17:02
 * description :
 */
@SofaService(uniqueId = "echo")
@Service("echoService")
public class EchoServiceImpl implements EchoService {

    @Autowired
    EchoInfoRepository repository;

    @Override
    public String saySomething(String saying) {
        return saying;
    }

    @Override
    public String reEcho(Long id) {
        return repository.findById(id).get().getInfo();
    }
}
