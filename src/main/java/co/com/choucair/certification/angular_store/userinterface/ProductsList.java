package co.com.choucair.certification.angular_store.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsList {
//    public static final Target
    public static Target getTargetByid(String id){
        return Target.the("").located(By.id("z"+id));
    }
}
