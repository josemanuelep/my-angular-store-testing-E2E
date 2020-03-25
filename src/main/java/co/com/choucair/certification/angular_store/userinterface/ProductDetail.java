package co.com.choucair.certification.angular_store.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductDetail {
    public static final Target PRODUCT_NAME = Target.the("").located(By.name("product-name"));
    public static final Target PRODUCT_PRICE = Target.the("").located(By.name("price"));
    public static final Target PRODUCT_IVA = Target.the("").located(By.name("iva"));
    public static final Target PRODUCT_TOTAL = Target.the("").located(By.name("total"));
    public static final Target PRODUCT_DESC = Target.the("").located(By.name("description"));
    public static final Target BUTTON_ADD_TO_CAR = Target.the("").located(By.id("add-car"));
}
