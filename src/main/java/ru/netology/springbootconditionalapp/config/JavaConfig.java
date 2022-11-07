package ru.netology.springbootconditionalapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springbootconditionalapp.profile.DevProfile;
import ru.netology.springbootconditionalapp.profile.ProductionProfile;
import ru.netology.springbootconditionalapp.profile.SystemProfile;

@Configuration
public class JavaConfig {
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
