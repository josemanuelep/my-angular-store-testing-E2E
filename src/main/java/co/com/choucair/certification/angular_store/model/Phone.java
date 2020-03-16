package co.com.choucair.certification.angular_store.model;

import javax.money.MonetaryAmount;
import java.util.Currency;

public class Phone {
    private String phone;
    private Currency price = Currency.getInstance("USD");
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Currency getPrice() {
        return price;
    }

    public void setPrice(Currency price) {
        this.price = price;
    }
}
