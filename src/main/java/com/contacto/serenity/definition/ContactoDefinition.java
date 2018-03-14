package com.contacto.serenity.definition;


import com.contacto.serenity.steps.ContactoSteps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;




    public class ContactoDefinition {
    @Steps
    private
    ContactoSteps pasos;

    @Given("que estoy en la pagina de qvision technologies")
    public void abrirUrl(){
        pasos.abrirPagina();

          }

    @When("me registre con nombre<nombre>, email<email>, numContacto<numContacto>, nombreEmpresa<nombreEmpresa>, ciudad<ciudad>, asunto<asunto>, mensaje<mensaje>")
    public void  registroContacto(@Named("nombre")String nombre,@Named("email")String email,@Named("numContacto")String numContacto,@Named("nombreEmpresa")String nombreEmpresa,@Named("ciudad")String ciudad,@Named("asunto")String asunto,@Named("mensaje")String mensaje){
        pasos.registro(nombre,email,numContacto,nombreEmpresa,ciudad,asunto,mensaje);
    }

    @Then("quedo registrado")
    public void validarMensaje(){
        pasos.validar();

    }

 }
