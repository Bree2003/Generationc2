package cl.prueba3.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecSecurityConfig {
	
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		
		//prototipado rápido, creamos usuarios manualmente
		
		UserDetails user1 = User.withUsername("user1")
				.password(passwordEncoder().encode("user1Pass"))
				.roles("USER")
				.build();
	
		UserDetails user2 = User.withUsername("user2")
				.password(passwordEncoder().encode("user2Pass"))
				.roles("USER")
				.build();
		
		UserDetails admin = User.withUsername("admin")
				.password(passwordEncoder().encode("adminPass"))
				.roles("ADMIN")
				.build();
		
		return new InMemoryUserDetailsManager(user1,user2,admin);
		
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		
		//configuraciones de http builder para solicitudes de autorización y login
		
		//permitimos acceso anomimo en /login para que los user puedan identificarse
		//mientras restringimos /admin para admin roles y asegurar todo lo demás
		//el orden de antMatchers() es importante, las reglas más específicas
		//deben ir primero seguido de las más generales
		
	http.csrf()
	.disable()
	.authorizeRequests()
	.antMatchers("/admin/**")
	.hasRole("ADMIN")
	.antMatchers("/anonymous*")
	.anonymous()
	.antMatchers("/login*")
	.permitAll()
	.anyRequest()
	.authenticated();
	/*.and()
	
	//extendemos al registro de login y logout
	
	.formLogin()
	.loginPage("/login.html")
	.loginProcessingUrl("/perform_login")
	.defaultSuccessUrl("/homepage.html",true)
	.failureUrl("/login.html?error=true")
	.and()
	.logout()
	.logoutUrl("/perform_logout")
	.deleteCookies("JSESSIONID");*/
	
	return http.build();
	
	//loginPage() - la página de inicio de sesión personalizada
	//loginProcessingUrl() : la URL para enviar el nombre de usuario y la contraseña
	//defaultSuccesUrl() : la página de destino después de un inicio de sesión exitoso
	//failUrl() : la página de destino después de un inicio de sesión fallido
	//logoutURL() - el cierre de sesión personalizado
		
	}
	
	//método en donde encriptamos las contraseñas
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
