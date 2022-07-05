package provider.service.implementation;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import provider.data.EchoRepository;
import provider.data.po.EchoPO;
import provider.service.EchoService;

/**
 * author : liuanglin
 * date : 2022/7/4 17:02
 * description :
 */
@SofaService(uniqueId = "echo", bindings = {@SofaServiceBinding(bindingType = "bolt")})
@Service("echoService")
public class EchoServiceImpl implements EchoService {

    @Autowired
    EchoRepository repository;

    @Override
    public String saySomething(String saying) {
        final EchoPO po = new EchoPO();
        po.setInfo(saying);
        return repository.save(po).getInfo();
    }

    @Override
    public String reEcho(Long id) {
        return repository.findById(id).get().getInfo();
    }

}
