package alex.swaggerhidden.service;

import org.springdoc.core.GenericParameterService;
import org.springdoc.core.OperationService;
import org.springdoc.core.PropertyResolverUtils;
import org.springdoc.core.RequestBodyService;
import org.springdoc.core.SecurityService;
import org.springdoc.core.providers.JavadocProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Optional;


@Component
@Primary
public class MyOperationService extends OperationService {

    @Value("${app.expose-hidden}")
    private boolean exposeHidden;

    public MyOperationService(GenericParameterService parameterBuilder, RequestBodyService requestBodyService, SecurityService securityParser, PropertyResolverUtils propertyResolverUtils, Optional<JavadocProvider> javadocProvider) {
        super(parameterBuilder, requestBodyService, securityParser, propertyResolverUtils, javadocProvider);
    }

    @Override
    public boolean isHidden(Method method) {
        if (exposeHidden) {
            return false;
        }
        return super.isHidden(method);

    }
}
