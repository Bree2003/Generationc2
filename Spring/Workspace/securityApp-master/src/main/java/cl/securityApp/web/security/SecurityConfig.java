package cl.securityApp.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) //ignora toda la configuración de seguridad que traes, y vamos a usar la que definiremos en esta clase.
public class SecurityConfig{ //configurar las rutas que van a quedar libres para los usuarios y las que no.
	
	
	@Autowired
	private UserDetailsService jwtUserDetailsService;

	@Autowired
    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

	
	@Autowired
	private JwtFilter jwtFilter;
	
	/*
	 @Override
	    protected void configure(HttpSecurity httpSecurity) throws Exception {
	        httpSecurity.csrf().disable()
	                .authorizeRequests().antMatchers(HttpMethod.POST,"/auth/*").permitAll(). //cualquier usuario puede hacer ingreso a esta ruta
	                        anyRequest().authenticated().and(). //aquí tienes que estar autenticado para hacer ingreso.
	                        exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and().sessionManagement() //MANEJO DE EXCEPCIONES.
	                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	        httpSecurity.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
	    }*/
	 @Bean
	  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	    http.cors().and().csrf().disable()
	        .exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and()
	        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
	        .authorizeRequests().antMatchers(HttpMethod.POST,"/auth/*").permitAll()
	        .anyRequest().authenticated();
	    
	   // http.authenticationProvider(authenticationProvider());

	    http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
	    
	    return http.build();
	  }

	   /* @Override
	    public void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(jwtUserDetailsService).passwordEncoder(passwordEncoder());
	    }*/
	 
	 @Bean
	  public DaoAuthenticationProvider authenticationProvider() {
	      DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
	       
	      authProvider.setUserDetailsService(jwtUserDetailsService);
	      authProvider.setPasswordEncoder(passwordEncoder());
	   
	      return authProvider;
	  }

	    @Bean //traspasamos datos y parámetros de un lado a otro
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }


	   /* @Bean
	    @Override
	    public AuthenticationManager authenticationManagerBean() throws Exception {
	        return super.authenticationManagerBean();
	    }*/
	    
	    @Bean
	    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
	      return authConfig.getAuthenticationManager();
	    }

}
