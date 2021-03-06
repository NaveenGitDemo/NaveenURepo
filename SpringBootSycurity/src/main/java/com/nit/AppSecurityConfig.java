package com.nit;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.weaver.patterns.AndPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.NoOp;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

//	@Bean
//	@Override
//	protected UserDetailsService userDetailsService() {
//		
//		List<UserDetails> users=new ArrayList<UserDetails>();
//		users.add(User.withDefaultPasswordEncoder().username("Naveen").password("Mani").roles("USER").build());
//		return new InMemoryUserDetailsManager(users);
//	}
	  @Autowired
      UserDetailsService userDetailsService;
	  @Bean
	  public AuthenticationProvider authProvider() {
		  DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		  provider.setUserDetailsService(userDetailsService);
		  provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		  return provider;
	  }
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * http .csrf().disable() .authorizeRequests().antMatchers("/login").permitAll()
	 * .anyRequest().authenticated() .and() .formLogin()
	 * .loginPage("/login").permitAll() .and() .logout().invalidateHttpSession(true)
	 * .clearAuthentication(true) .logoutRequestMatcher(new
	 * AntPathRequestMatcher("/logout"))
	 * .logoutSuccessUrl("logout-success").permitAll();
	 * 
	 * }
	 */
	  
	  
	  
	
}
