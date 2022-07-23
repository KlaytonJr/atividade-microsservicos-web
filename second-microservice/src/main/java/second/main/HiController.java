package second.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hi")
public class HiController {
    
    @GetMapping
    public String getMessage() {
        return "Hi World";
    }
    
}