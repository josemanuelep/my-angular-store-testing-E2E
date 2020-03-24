package co.com.choucair.certification.angular_store.model;

import cucumber.api.java.eo.Do;
import org.jetbrains.annotations.NotNull;

import java.text.NumberFormat;
import java.util.Locale;

public class Phone implements Comparable<Phone> {
    private String id;
    private String name;
    private String description;
    private String price;
    private String iva;
    private String total;
    private static Locale locale = new Locale("en", "US");
    private static NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

    public Phone(String name, String description, String price, String iva, String total) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getIva() {
        return iva;
    }

    public String getTotal() {
        return total;
    }

    @Override
    public int compareTo(@NotNull Phone phone) {
        return 0;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + total.hashCode();
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        hash = 31 * hash + (price == null ? 0 : price.hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return this.hashCode()== phone.hashCode();
    }

    public String toString(){
        return "Phone "+this.name+" With price "+this.price+" and IVA "+this.iva+" with total "+this.total+" and description "+this.description;
    }
}
