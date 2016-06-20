package mtg.imgserver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jbo on 20.06.2016.
 */
@RestController
public class PingController {

    @RequestMapping("/")
    public String ping() {
        return "Hi from Image Server";
    }
}
