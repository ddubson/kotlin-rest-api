package com.ddubson.controllers

import com.ddubson.models.Author
import com.ddubson.models.Book
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController {

    @GetMapping("/books")
    fun getAllBooks(): List<Book> {
        return listOf(
                Book(1L, "Hello", Author(1L, "author1")),
                Book(2L, "World!", Author(2L, "author")))
    }

    @GetMapping("/books/{id}")
    fun getBook(@PathVariable("id") id: Long): Book {
        val author: Author = Author(1L, "Author Name")
        return Book(id, "Hello World!", author)
    }
}