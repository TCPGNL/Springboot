package com.tcpgnl.jsontest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.tcpgnl.jsontest.Book;
import java.util.Date;

@RestController
public class BookController {
    @RequestMapping("/book")
    public Book book() {
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
        // 只是返回最后一个???
    }
}
