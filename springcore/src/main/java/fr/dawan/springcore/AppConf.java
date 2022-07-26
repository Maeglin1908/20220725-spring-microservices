package fr.dawan.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import fr.dawan.springcore.beans.ArticleDao;
import fr.dawan.springcore.beans.ArticleService;

@Configuration
@ComponentScan(basePackages = "fr.dawan.springcore")
public class AppConf {
    
    @Bean
    @Primary
    public ArticleDao daoA() {
        return new ArticleDao("data1");
    }
    
    @Bean(name = "daoB")
    public ArticleDao dao() {
        return new ArticleDao("data2");
    }

    @Bean
    @Scope("prototype")
    public ArticleService serviceB(ArticleDao daoA) {
        return new ArticleService(daoA);
    }
    
    @Bean
    public ArticleService serviceC() {
        return new ArticleService(daoA()); 
    }
    
    @Bean
    public ArticleService serviceD() {
        ArticleService s=new ArticleService();
        s.setDao(daoA());
        return s;
    }
}
