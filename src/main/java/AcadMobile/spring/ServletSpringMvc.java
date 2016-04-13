package AcadMobile.spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMvc extends AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
	protected Class<?>[] getRootConfigClasses() {		
		return new Class[] { AppWebConfiguration.class, JPAConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//carrega a configuração do jpa
		return new Class[]{};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
