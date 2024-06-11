package easemytrip.example.easemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visa {
    @GetMapping("/visa")
    public String getData() {return  "Please submit your visa at the india embassy." ; }
}