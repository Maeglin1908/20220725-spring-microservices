package fr.dawan.springboot.circulardep;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

//@Service
public class ServiceA {
    
    @Autowired
    private ServiceB b;

    public ServiceA() {
       
    }
    
    @PostConstruct
    void init() {
        b.setA(this);
    }

   // @Autowired
    public ServiceA(/*@Lazy*/ ServiceB b) {
        this.b = b;
    }

    public ServiceB getB() {
        return b;
    }

    public void setB(ServiceB b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "ServiceA [b=" + b + "]";
    }
    
    

}
