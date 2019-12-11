import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContainer {

    @RequestMapping
    public String sayHello(){
        return "Hello";
    }
}
