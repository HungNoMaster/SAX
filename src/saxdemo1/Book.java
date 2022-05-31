/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saxdemo1;

/**
 *
 * @author khang
 */
public class Book {

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private String category;
    private String author;
    private String name;
    private float price;

    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }
    private String nameSpace;

    @Override
    public String toString() {
        return "Book{" + "category=" + category + ", author=" + author + ", name=" + name + ", price=" + price + ", nameSpace=" + nameSpace + '}';
    }

    
    
    
}
