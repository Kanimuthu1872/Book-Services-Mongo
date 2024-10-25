package com.example.Book_Author.Service;
import com.example.Book_Author.Entity.Author;
import com.example.Book_Author.Repo.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(String id) {
        return authorRepository.findById(id).orElse(null);
    }

    public Author updateAuthor(String id, Author author) {
        author.setAuthorId(id);
        return authorRepository.save(author);
    }

    public void deleteAuthor(String id) {
        authorRepository.deleteById(id);
    }
}