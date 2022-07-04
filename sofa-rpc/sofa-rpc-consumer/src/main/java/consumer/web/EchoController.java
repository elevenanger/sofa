package consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import provider.service.EchoService;

/**
 * author : liuanglin
 * date : 2022/7/4 17:20
 */
@RestController
@RequestMapping("/echo")
public class EchoController {

    @Autowired
    EchoService echoService;

    @GetMapping()
    public String echo() {
        return echoService.saySomething("hello sofa");
    }

    @GetMapping("/{id}")
    public String reEcho(@PathVariable Long id) {
        return echoService.reEcho(id);
    }
}
