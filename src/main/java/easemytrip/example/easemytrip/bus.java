package easemytrip.example.easemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {
    @GetMapping("/bus")

    public String getData() {return  "Please book your train ticket on redbus 55% discount" ; }
}
