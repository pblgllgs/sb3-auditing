package com.pblgllgs.sb3auditing.audit;
/*
 *
 * @author pblgl
 * Created on 24-04-2024
 *
 */

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;
public class AuditorAwareImpl  implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Amila");
    }
}
