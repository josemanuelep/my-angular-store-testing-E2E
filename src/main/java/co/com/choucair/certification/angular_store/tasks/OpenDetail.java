package co.com.choucair.certification.angular_store.tasks;

import co.com.choucair.certification.angular_store.model.Phone;
import co.com.choucair.certification.angular_store.userinterface.ProductsList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static co.com.choucair.certification.angular_store.util.Constants.INDEX_0;

public class OpenDetail implements Task {
    private List<Phone> phones;

    public OpenDetail(List<Phone> phones) {
        this.phones = phones;
    }
    public static OpenDetail of(List<Phone> phones){
        return Tasks.instrumented(OpenDetail.class,phones);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String index = phones.get(INDEX_0).getId();
        actor.attemptsTo(Click.on(ProductsList.getTargetByid(index)));

    }
}
