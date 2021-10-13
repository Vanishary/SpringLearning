package org.lgt.controller;

import org.lgt.bean.Author;
import org.lgt.bean.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2020年10月25日 18:51
 */
@RestController
public class BookController {

    @GetMapping("/book")
    @ResponseBody
    public String book(@ModelAttribute("b") Book book, @ModelAttribute("a") Author author) {
        System.out.println(book.toString() + author.toString());
        return book.toString() + author.toString();
    }
}
