package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public  BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click (By element) throws Exception
    {
        try {

            driver.findElement(element).click();

        } catch (Exception e) {

            throw new Exception("No se pudo clickear el elemento: " + element);
        }

    }



    public void findElement (By element) throws Exception
    {
        try {

            driver.findElement(element);

        } catch (Exception e) {

            throw new Exception("No se pudo encontrar el elemento: " + element);
        }



    }

    public  String  getText (By element) throws Exception {
        try {

            return driver.findElement(element).getText();

        }catch (Exception e){

            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }

    }

    public  void  getTitleLocator (By element) throws Exception
    {
        try {

            driver.findElement(element).findElement(element);

        } catch (Exception e) {

            throw new Exception("No se pudo encontrar el localizador");
        }

    }

    public Boolean isDisplayed (By element) throws Exception {
        try {

            return driver.findElement(element).isDisplayed();

        }catch (Exception e){

            throw new Exception("No se pudo encontrar el elemento: " + element);
        }

    }

    public  String  getTitle () throws Exception {
        try {

            return driver.getTitle();

        }catch (Exception e){

            throw new Exception("No se pudo obtener el titulo del driver");
        }


    }

    public  void  close () throws Exception {
        try {

             driver.close();

        }catch (Exception e){

            throw new Exception("No se pudo cerrar la ventana");
        }


    }

    public void findElemens (By element) throws Exception
    {
        try {

            driver.findElements(element);

        } catch (Exception e) {

            throw new Exception("No se pudo encontrar el elemento: " + element);
        }



    }





}
