package fr.dawan.springboot.circulardep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class ServiceB {
    
   //@Autowired
    private ServiceA a;

    public ServiceB() {
        super();
    }

 //   @Autowired
    public ServiceB(ServiceA a) {
        super();
        this.a = a;
    }

    public ServiceA getA() {
        return a;
    }

    public void setA(ServiceA a) {
        this.a = a;
    }

}
