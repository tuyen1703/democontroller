package vn.edu.pxu.democontroller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import vn.edu.pxu.democontroller.repository.ProductRepository;
import vn.edu.pxu.democontroller.repository.ProductRepositoryImpl;
import vn.edu.pxu.democontroller.service.ProductService;
import vn.edu.pxu.democontroller.service.ProductServiceImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "vn.edu.pxu.democontroller" })
public class AppConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	@Bean
	public ProductService productService() {
		return new 	ProductServiceImpl();
	}
	
	@Bean
	public ProductRepository productRepository() {
		return new ProductRepositoryImpl();
	}
}