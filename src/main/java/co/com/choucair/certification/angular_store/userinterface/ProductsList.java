package co.com.choucair.certification.angular_store.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsList {
    public static final Target BUTTON_ADD_TO_CAR = Target.the("").located(By.id("add-car"));
    public static Target getTargetByid(String id) {
        return Target.the(id).located(By.id(id));
    }
}
