package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testSaveAndFindById() {
        Book book = new Book();
        book.setTitle("Sample Book");
        book.setAuthor("Sample Author");

        entityManager.persist(book);
        entityManager.flush();

        Book found = bookRepository.findById(book.getId()).orElse(null);
        assertThat(found).isNotNull();
        assertThat(found.getTitle()).isEqualTo(book.getTitle());
        assertThat(found.getAuthor()).isEqualTo(book.getAuthor());
    }
    
}
