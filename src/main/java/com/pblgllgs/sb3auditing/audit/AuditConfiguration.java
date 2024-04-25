package com.pblgllgs.sb3auditing.audit;
/*
 *
 * @author pblgl
 * Created on 24-04-2024
 *
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class AuditConfiguration {

    @Bean
    public AuditorAware<String> auditorProvider() {
        return new SpringSecurityAuditorAwareImpl();
    }

}
