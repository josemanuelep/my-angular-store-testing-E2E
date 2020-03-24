package co.com.choucair.certification.angular_store.questions;

import co.com.choucair.certification.angular_store.model.Phone;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static co.com.choucair.certification.angular_store.userinterface.ProductDetail.*;
import static co.com.choucair.certification.angular_store.util.Constants.INDEX_0;

public class IsValid implements Question<Boolean> {
    private List<Phone> phones;

    public IsValid(List<Phone> phones) {
        this.phones = phones;
    }

    public static IsValid the(List<Phone> phones) {
        return new IsValid(phones);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String name = PRODUCT_NAME.resolveFor(actor).getText();
        String description = PRODUCT_DESC.resolveFor(actor).getText();
        String price =PRODUCT_PRICE.resolveFor(actor).getText().replaceAll("\\D+","");
        String iva = PRODUCT_IVA.resolveFor(actor).getText().replaceAll("\\D+","");
        String total = PRODUCT_TOTAL.resolveFor(actor).getText().replaceAll("\\D+","");
        Phone phoneInthePage = new Phone(name,description,price,iva,total);
        Phone phoneToCompare = this.phones.get(INDEX_0);
        System.out.println("Phone of page "+phoneInthePage);
        System.out.println("Phone of feature "+phoneToCompare.toString());

        return phoneInthePage.equals(phoneToCompare);
    }
}
