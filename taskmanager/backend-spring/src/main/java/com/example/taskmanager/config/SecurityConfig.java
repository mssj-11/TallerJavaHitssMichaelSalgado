package com.example.taskmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.taskmanager.security.JwtFilter;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
@EnableMethodSecurity(prePostEnabled = true) // Esto activa @PreAuthorize
public class SecurityConfig {
	
	private final JwtFilter jwtFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Esto desactiva protección CSRF para pruebas con Postman
                // Config. rutas públicas y protegidas
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(
                                //"/api/**",
                                "/api/auth/**",
                                "/v3/api-docs/**",
                                "/swagger-ui/**",
                                "/swagger-ui.html"
                                //"/api/tasks/**"
                        ).permitAll() // Permite acceso sin autenticación (estas rutas serán públicas)
                        .requestMatchers("/api/tasks/**").hasAnyAuthority("USER", "ADMIN")
                        .anyRequest().authenticated() // El resto requerirá autenticación
                )
                //.httpBasic(Customizer.withDefaults()); // Autenticación básica temporal 
                // JWT
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
                .formLogin(form -> form.disable())
                .httpBasic(httpBasic -> httpBasic.disable());
        
        return http.build();
    }
}
