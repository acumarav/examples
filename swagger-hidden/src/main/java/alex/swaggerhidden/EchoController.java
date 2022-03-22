package alex.swaggerhidden;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "Echo Controller", description = "Echo Controller Description")
@RestController
@RequestMapping(value = "/")
public class EchoController {

    @GetMapping(value = "ping")
    @Operation(description = "normal ping")
    public String ping() {
        return "ping ping ping";
    }

    @GetMapping(value = "sping")
    @InternalAPI
    @Operation(description = "secret hidden ping", hidden = true)
    public String secretPing() {
        return "secret ping";
    }
}
