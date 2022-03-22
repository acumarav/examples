package alex.swaggerhidden;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class DefaultController {

    @GetMapping("/")
    public void root(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");

    }


    @GetMapping("/index.html")
    public void index(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");
    }
}
