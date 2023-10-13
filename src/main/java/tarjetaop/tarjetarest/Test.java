package tarjetaop.tarjetarest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping
    @RequestMapping("/item")
    public   String get() {
        return "hello world";
    }
}
