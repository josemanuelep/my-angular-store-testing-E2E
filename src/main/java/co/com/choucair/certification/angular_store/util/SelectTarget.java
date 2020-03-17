package co.com.choucair.certification.angular_store.util;


import jdk.dynalink.beans.StaticClass;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SelectTarget {

    public static Target selectByid(String id, String targetDescription){
       return    Target.the(targetDescription).located(By.id(id));
    }

    public static Target selectByXpaht(String xpath, String targetDescription){
        return    Target.the(targetDescription).located(By.id(xpath));
    }
}
