package co.com.sofkau.web.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Authentication implements Task {
    private String correo;

    public Authentication(String correo) {
        this.correo = correo;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
