import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/gyms").authenticated() // Require authentication for /gyms endpoint
                .anyRequest().permitAll() // Allow access to other endpoints without authentication
                .and()
                .oauth2Login()
                .and()
                .oauth2ResourceServer()
                .jwt(); // Configure JWT as the resource server
        return http.build();
    }
}
