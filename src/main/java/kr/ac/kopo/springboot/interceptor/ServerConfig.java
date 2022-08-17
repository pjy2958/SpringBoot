package kr.ac.kopo.springboot.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

@Configuration
public class ServerConfig implements WebMvcConfigurer {
    private static final List<String> URL_PATTERNS = Arrays.asList("/board/**");

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(URL_PATTERNS);
    }
}
