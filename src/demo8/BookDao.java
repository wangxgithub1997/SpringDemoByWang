package demo8;

import org.springframework.stereotype.Repository;

//<bean id="bookDao" class="demo8.BookDao"></bean>
@Repository("bookDao")
public class BookDao {
    public void addook(){
        System.out.println("添加图书");
    }
}
