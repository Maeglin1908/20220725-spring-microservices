package fr.dawan.springboot.circulardep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class CircularRunner implements ApplicationRunner {

    @Autowired
    ServiceA a;
    
    @Autowired
    ServiceB b;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(a);
        System.out.println(b);
    }

}
