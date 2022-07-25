package fr.dawan.springcore.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="serviceA")
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

    @Override
    public String toString() {
        return "ArticleService [dao=" + dao + ", toString()=" + super.toString() + "]";
    }
}
