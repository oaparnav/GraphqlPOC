package com.graphql.GraphqlPOC;


import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import lombok.Value;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${com.ford.msl.ip-whitelist}")
    private String[] ipWhiteList;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable().authorizeRequests()
        .antMatchers("/api/servicehistory/v1/convoy.html").authenticated()
        .requestMatchers(request -> {
			if (request.getRequestURI() != null && (request.getRequestURI().contains("/api/servicehistory/v1")
					|| request.getRequestURI().contains("/api/servicehistory/v2"))) {
				if (request.getRequestURI().contains("/api/servicehistory/v1/internal")) {
					return false;
				}
				return true;
			}
			return false;
       	}).permitAll()
                .anyRequest().access("isAuthenticated() and (" + getIpWhitelistSpel() + ")")
                .and()
                .httpBasic();
    }

    private String getIpWhitelistSpel() {
        return stream(ipWhiteList)
                .map(ip -> String.format("hasIpAddress('%s')", ip))
                .collect(joining(" or "));
    }
}
