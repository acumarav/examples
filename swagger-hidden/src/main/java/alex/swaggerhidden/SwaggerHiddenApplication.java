package alex.swaggerhidden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class SwaggerHiddenApplication {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        SpringApplication.run(SwaggerHiddenApplication.class, args);
    }

}
