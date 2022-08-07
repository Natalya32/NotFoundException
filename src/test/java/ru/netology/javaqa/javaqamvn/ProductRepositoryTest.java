package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Book prod1 = new Book(24, "Rings", 111, "Tolkin");
    Smartphone prod2 = new Smartphone(222, "Iphone", 111111, "Apple");
    Smartphone prod3 = new Smartphone(123, "Iphone", 112233, "AppleNew");

    @Test

    public void shouldRemoveByIdIfAvailable() {
        manager.add(prod1);
        manager.add(prod2);
        manager.add(prod3);
        Product[] prod = {prod2, prod3};
        repo.removeById(24);
        Product[] actual = repo.getProds();
        Assertions.assertArrayEquals(actual, prod);
    }

    @Test

    public void shouldRemoveByIdIfIdNot() {
        manager.add(prod1);
        manager.add(prod2);
        manager.add(prod3);
        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(2);
        });
    }
}
