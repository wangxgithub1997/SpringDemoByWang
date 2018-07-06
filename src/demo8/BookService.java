package demo8;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
//<bean id="bookService" class="demo8.BookService"></bean>
@Service("bookService")
public class BookService {
    @Resource(name = "bookDao")
    private BookDao bookDao;
    public void addBook(){
        bookDao.addook();
    }
}
