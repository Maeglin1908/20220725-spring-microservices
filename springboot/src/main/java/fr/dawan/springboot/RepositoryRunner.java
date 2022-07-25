package fr.dawan.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class RepositoryRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("RepositoryRunner.run()");

    }

}
