package it.accenture.library.repository;

import it.accenture.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List; // Assicurati di importare List

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT b FROM Book b")

    public List<Book> findAllBooks();

    @Query("SELECT libro FROM Book libro WHERE libro.id = idLibro")
    public Book findBookById(@Param("idLibro") Long id);
}
