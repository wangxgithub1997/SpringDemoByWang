package demo8;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
//<bean id="bookController" class="demo8.BookController"></bean>
@Controller("bookController")
public class BookController {
    @Resource(name = "bookService")
    private BookService bookService;
    public void addBook(){
        bookService.addBook();
    }
}
