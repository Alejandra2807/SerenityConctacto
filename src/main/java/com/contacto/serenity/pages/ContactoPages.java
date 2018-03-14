package com.contacto.serenity.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://www.qvision.com.co/contacto/")
public class ContactoPages extends PageObject{

    @FindBy(name = "your-name")
    private WebElementFacade name;

    @FindBy(name = "your-email")
    private WebElementFacade email1;

    @FindBy(name = "your-number")
    private WebElementFacade number;

    @FindBy(name = "nombreempresa")
    private WebElementFacade nombreempresa1;

    @FindBy(name = "ciudad")
    private WebElementFacade ciudad1;

    @FindBy(name = "your-subject")
    private WebElementFacade subject;

    @FindBy(name = "your-message")
    private WebElementFacade message;

    @FindBy(xpath = "//*[@id=\"wpcf7-f6256-p2304-o1\"]/form/p[9]/input")
    private WebElementFacade btnEnviar;

    @FindBy(xpath = "//*[@id=\"wpcf7-f6256-p2304-o1\"]/form/div[2]")
    private WebElementFacade lblMensaje;

    //public ContactoPages(WebDriver driver){
        //super(driver);
   // }

    public void registrarContacto(String nombre, String email, String numContacto, String nombreEmpresa, String ciudad, String asunto, String mensaje){

        name.sendKeys(nombre);
        email1.sendKeys(email);
        number.sendKeys(numContacto);
        nombreempresa1.sendKeys(nombreEmpresa);
        ciudad1.sendKeys(ciudad);
        subject.sendKeys(asunto);
        message.sendKeys(mensaje);
        btnEnviar.click();
    }

    public void validarMensaje(){
        MatcherAssert.assertThat("Ocurrió un error de validación. Por favor, confirme los campos y envíe el formulario de nuevo.", lblMensaje.isDisplayed());
    }



}
