package com.example.lbms.BMS.Controller;

import com.example.lbms.BMS.Model.Book;
import com.example.lbms.BMS.Model.Genre;
import com.example.lbms.BMS.Service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BMSController {

    private final BookService bookService;

    BMSController(BookService bookService){
        this.bookService = bookService;
    }
    //        Search By title, Author Name And Genre Name
    @GetMapping("/title/{title}")
    public List<Optional<Book>> searchByTitle(@PathVariable("title") String title){
        return bookService.searchByTitle(title);
    }

    @GetMapping("/author/{name}")
    public List<Optional<Book>> searchByAuthor(@PathVariable("name") String authorName){
        return bookService.searchByAuthor(authorName);
    }

    @GetMapping("/genre/{genre}")
    public List<Optional<Book>> searchByGenre(@PathVariable("genre") String genreName){
        Genre genre = Genre.valueOf(genreName);
        return bookService.searchByGenre(genre);
    }
    // Create A book
    @PostMapping("/")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    //      Update A Book using patch
    @PatchMapping("/{id}")
    public Book updateBook(@PathVariable("id") Long id, @RequestBody Book book){
        return bookService.updateBook(id, book);
    }

    //      Delete a Book
    @DeleteMapping("/{id}")
    public Book deleteBook(@PathVariable("id") Long id){
        return bookService.deleteBook(id);
    }

    //      Get a Book by Id
    @GetMapping("/{id}")
    public Book getSingleBook(@PathVariable("id") Long id)
    {
        return bookService.getSingleBook(id);

    }

    //        Get all Books
    @GetMapping("/")
    public List<Book> getAllBooks()
    {
        return bookService.getAllBooks();

    }


}