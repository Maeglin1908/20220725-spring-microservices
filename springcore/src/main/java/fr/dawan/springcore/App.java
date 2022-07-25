package fr.dawan.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dawan.springcore.beans.ArticleDao;
import fr.dawan.springcore.beans.ArticleService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConf.class);
        System.out.println("________________________________");
        ArticleDao daoA=ctx.getBean("daoA",ArticleDao.class);
        System.out.println(daoA);
        
        ArticleService servA=ctx.getBean("serviceA",ArticleService.class);
        System.out.println(servA);
        ArticleService servA2=ctx.getBean("serviceA",ArticleService.class);
        System.out.println(servA2);
        
        ArticleService servB=ctx.getBean("serviceB",ArticleService.class);
        System.out.println(servB);
        ArticleService servB2=ctx.getBean("serviceB",ArticleService.class);
        System.out.println(servB2);
        ((AbstractApplicationContext)ctx).close();
    }
}
