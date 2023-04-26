package com.borened.mock.config;

import com.borened.mock.interceptor.MockInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author cch
 * @since 2023-04-26
 */
public class MockMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MockInterceptor());
    }

}
