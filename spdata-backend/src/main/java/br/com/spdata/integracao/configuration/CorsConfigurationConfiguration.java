package br.com.spdata.integracao.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfigurationConfiguration implements WebMvcConfigurer
{
	private static final String[] RESOURCE_LOCATIONS = {
		"classpath:/META-INF/resources/",
		"classpath:/resources/static",
		"classpath:/static/",
		"classpath:/public/"};
	@Override
	public void addCorsMappings(CorsRegistry registry)
	{
		registry.addMapping("/api/**")//
			.allowedMethods("GET", "POST")//
			.allowedHeaders("*");
		registry.addMapping("/**");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		if(!registry.hasMappingForPattern("/webjars/**"))
		{
			registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		}
		if(!registry.hasMappingForPattern("/**"))
		{
			registry.addResourceHandler("/**").addResourceLocations(RESOURCE_LOCATIONS);
		}
	}
}