package co.com.choucair.certification.angular_store.model;

import cucumber.api.java.eo.Do;

import java.text.NumberFormat;
import java.util.Locale;

public class Phone {
    private Integer id;
    private String name;
    private String description;
    private String price;
    private String iva;
    private String total;
    private static Locale locale = new Locale("en", "US");
    private static NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = currencyFormatter.format(price);
    }

    public String getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = currencyFormatter.format(iva);
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = currencyFormatter.format(total);
    }
}
