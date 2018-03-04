package info.rexis.uas.config.authserver;

import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class AuthServerConfigurer extends AuthorizationServerConfigurerAdapter {
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("democlient")
                .authorizedGrantTypes("password", "client_credentials")
                .secret("{noop}demosecret")
                .scopes("all");
    }
}
