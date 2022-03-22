package alex.swaggerhidden;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@Tag(name = "Admin Controller", description = "Admin Controller Description")
@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @GetMapping("users")
    public String[] users() {
        return new String[]{"alex", "service", "noname"};
    }
}
