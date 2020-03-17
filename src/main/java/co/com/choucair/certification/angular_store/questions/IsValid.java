package co.com.choucair.certification.angular_store.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class IsValid implements Question<Boolean> {
    private String toValide;
    private Target target;

    public IsValid(String toValide, Target target) {
        this.toValide = toValide;
        this.target = target;
    }

    public static IsValid the(String toValide, Target target) {
        return new IsValid(toValide, target);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return toValide.equals(target.resolveFor(actor).getText());
    }
}
