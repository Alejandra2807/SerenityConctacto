package com.contacto.serenity.steps;

import com.contacto.serenity.pages.ContactoPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.annotations.Named;

public class ContactoSteps extends ScenarioSteps {

    @Page
    ContactoPages prueba;

    @Step
    public void abrirPagina(){
        prueba.open();
    }

    @Step
    public void registro(String nombre, String email, String numContacto, String nombreEmpresa, String ciudad, String asunto, String mensaje){
        prueba.registrarContacto(nombre,email, numContacto, nombreEmpresa, ciudad, asunto,mensaje);
    }

    @Step
    public void  validar(){
        prueba.validarMensaje();
    }

}
