package com.example.prestamolibros.DAO

import androidx.room.*
import com.example.prestamolibros.Model.Author
import com.example.prestamolibros.Model.Book

@Dao
interface BookDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBook(book: Book)

    @Update
    suspend fun updateBook(book: Book)

    @Delete
    suspend fun deleteBook(book: Book)

    @Query("SELECT * FROM libros")
    suspend fun getAllBooks(): List<Book>

    @Query("SELECT * FROM libros WHERE libroId = :id")
    suspend fun getBookById(id: Int): Book?

    @Query("SELECT * FROM autores")
    suspend fun getAllAuthors(): List<Author>
}