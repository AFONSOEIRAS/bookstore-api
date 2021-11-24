package com.afonso.bookstore;

import com.afonso.bookstore.domain.Categoria;
import com.afonso.bookstore.domain.Livro;
import com.afonso.bookstore.repositories.CategoriaRepository;
import com.afonso.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication {


	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}



}
