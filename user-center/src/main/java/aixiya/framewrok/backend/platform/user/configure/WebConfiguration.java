package aixiya.framewrok.backend.platform.user.configure;


import aixiya.framewrok.backend.platform.user.intercepter.ManagerIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Autowired
    private ManagerIntercepter managerIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(managerIntercepter);
    }

}
