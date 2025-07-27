package mate.academy.model;

import java.math.BigDecimal;
import mate.academy.lib.Dao;

public class Book {
    @Dao
    private Long id;
    @Dao
    private String title;
    @Dao
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book:" + "id=" + id + ", title='" + title + '\'' + ", price=" + price + '}';
    }
}
