package fr.dawan.springcore.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service(value="serviceA")
//@Scope("protoype")
@Lazy
public class ArticleService implements Serializable {

    private static final long serialVersionUID = 1L;
    
   // @Autowired
   // @Qualifier(value="DaoB")
    private ArticleDao dao;

    public ArticleService() {
       System.out.println("ArticleService: Constructeur par défaut");
    }

    @Autowired
    public ArticleService(@Qualifier(value="daoB") ArticleDao dao) {
        System.out.println("ArticleService: Constructeur un paramètre");
        this.dao = dao;
    }

    public ArticleDao getDao() {
        return dao;
    }
    
 //   @Autowired
    public void setDao(/*@Qualifier(value="DaoB") */ArticleDao dao) {
        this.dao = dao;
    }

    @PostConstruct
    public void init() {
        System.out.println("Méthode init");
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("Méthode destroy");
    }
    
    @Override
    public String toString() {
        return "ArticleService [dao=" + dao + ", toString()=" + super.toString() + "]";
    }
}
