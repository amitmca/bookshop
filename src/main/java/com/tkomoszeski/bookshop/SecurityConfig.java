package com.tkomoszeski.bookshop;

import com.tkomoszeski.bookshop.user.service.AppUserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final AppUserDetailsService appUserDetailsService;
    
    @Autowired
    public SecurityConfig(AppUserDetailsService appUserDetailsService)
    {
        this.appUserDetailsService = appUserDetailsService;
    }

	// This method is for overriding the default AuthenticationManagerBuilder.
	// We can specify how the user details are kept in the application. It may
	// be in a database, LDAP or in memory.
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(appUserDetailsService);
	}
	
     @Override
     protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
          .antMatchers("/index.html", "/", "/home","/logout", "/login","/favicon.ico","/*.js","/*.js.map").permitAll()
          .anyRequest().authenticated()
          .and().logout().permitAll().logoutRequestMatcher(new AntPathRequestMatcher("/logout","POST"))
          .and().httpBasic().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
          .and().csrf().disable();
     
    }

  

    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("user").roles("USER")
                .and()
        		.withUser("admin").password("admin").roles("ADMIN");
    }
}