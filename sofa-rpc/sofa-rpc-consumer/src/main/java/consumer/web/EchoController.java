package consumer.web;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import org.springframework.web.bind.annotation.*;
import provider.service.EchoService;

/**
 * author : liuanglin
 * date : 2022/7/4 17:20
 */
@RestController
@RequestMapping("/echo")
public class EchoController {

    @SofaReference(uniqueId = "echo", binding = @SofaReferenceBinding(bindingType = "bolt"))
    private EchoService echoService;

    @PostMapping()
    public String echo(@RequestParam(value = "saying") String saying) {
        return echoService.saySomething(saying);
    }

    @GetMapping("/{id}")
    public String reEcho(@PathVariable Long id) {
        return echoService.reEcho(id);
    }
}
