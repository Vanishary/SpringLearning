package org.lgt.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2021年03月07日 17:31
 */
@RestController
@RequestMapping("/book")
public class BookCorsController {
    @PostMapping("/")
    @CrossOrigin(value = "http://localhost:8081", maxAge = 1800, allowedHeaders = "*")
    public String addBook(String name) {
        return "receive:" + name;
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(value = "http://localhost:8081", maxAge = 1800, allowedHeaders = "*")
    public String deleteBookId(@PathVariable Long id) {
        return String.valueOf(id);
    }
}
