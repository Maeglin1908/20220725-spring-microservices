package fr.dawan.springcore.beans;

import java.io.Serializable;

public class ArticleDao implements Serializable {

    private static final long serialVersionUID = 1L;

    private String data;

    public ArticleDao() {
        System.out.println("ArticleDao: Constructeur par défaut");
    }

    public ArticleDao(String data) {
        System.out.println("ArticleDao: Constructeur un paramètre");
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ArticleDao [data=" + data + ", toString()=" + super.toString() + "]";
    }
    
}
