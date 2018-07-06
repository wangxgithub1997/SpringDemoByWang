package demo8;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 复杂类型注入
 */
public class T {
    public static void main(String[] args){
       ApplicationContext cac=
                new ClassPathXmlApplicationContext("demo8/applicationContext.xml");
        BookController controller=(BookController) cac.getBean("bookController");
        controller.addBook();
    }
}
