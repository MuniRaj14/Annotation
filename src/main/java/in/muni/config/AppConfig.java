package in.muni.config;

import in.muni.utils.PwdUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public AppConfig(){
        System.out.println("AppConfig :: Constructor");
    }

    @Bean
    public PwdUtils createPwdUtils(){
        System.out.println(" CreatePwdUtils() has been called");
        PwdUtils pw = new PwdUtils();
        // logic ;

        return pw;
    }
}
