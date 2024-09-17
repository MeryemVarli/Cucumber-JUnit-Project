package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class BrowserUtils {

    //all methods are static

    //WeElement element=driver.findElement();
   ///element.getText()
    public static String getText(WebElement element){

        return element.getText().trim();

    }





    public static String getText(WebElement element,WebDriver driver){


        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(element)).getText().trim();

    }








    //clears input field and enters data into input field
    public static void sendKeys(WebElement element,String keys){

        element.clear();
        element.sendKeys(keys);
    }



    public static void sendKeys(WebElement element,WebDriver driver,String key){

try {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(element));
    element.clear();
    element.sendKeys(key);
} catch (ElementNotInteractableException | NoSuchElementException e){  //you can use many exceptions but cant use parent and child exceptions together
    System.err.println("Exception occurred while sending keys attempting fluentWait "+e.getMessage());

//    Wait<WebDriver> fluentWait=new FluentWait<>(driver)
//            .withTimeout(Duration.ofSeconds(10))
//                    .pollingEvery(Duration.ofSeconds(2));
//    fluentWait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(key);


}

    }



    //reusable method to handle dropdowns
    public static void selectBy(WebElement element,String option,String methodName){
        Select select=new Select(element);

        switch (methodName){

            case "visibleText":
                select.selectByVisibleText(option);
                break;
            case "ByValue":
                select.selectByValue(option);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(option));
                break;
            default:
                System.out.println("please check your method name,the method name you chose is not available ");
       break;
        }


    }



 public static String firstSelectedOption(WebElement element) {

      Select select=new Select(element) ;
      return select.getFirstSelectedOption().getText().trim(); //this

    }








    //returns list of webElement from select.It retrieves all the options from the dropdown
    public static List<WebElement> getAllSelectOptions(WebElement element){
       Select select=new Select(element);
       return select.getOptions();



    }

    public static void selectOptionFromAllOptions(WebElement element, String option){

        Select select = new Select(element);
        for (WebElement e: select.getOptions()){

            if (BrowserUtils.getText(e).equalsIgnoreCase(option)){
                e.click();
                break;
            }

        }

    }

    public static void selectOptionFromAllOptions(List<WebElement> elementList, String option){

        for (WebElement e: elementList){

            if (BrowserUtils.getText(e).equalsIgnoreCase(option)){
                e.click();
                break;
            }

        }

    }




    public static void click(WebElement element){

      element.click();

    }


    public static void click(WebElement element, WebDriver driver){
//TimeoutException
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()",element);
        }catch (TimeoutException | ElementNotInteractableException e){

            System.err.println("JavaScript method did not work on click " + e.getMessage());

        }

    }

    public static void switch2Windows(WebDriver driver){

        String currentID=driver.getWindowHandle();
        Set<String> allIDs = driver.getWindowHandles();

        for (String id:allIDs){

            if (!id.equals(currentID)){
                driver.switchTo().window(id);
                break;
            }
        }
    }



    public static void switchWindowWithTitle(WebDriver driver,String title){

        Set<String> ids=driver.getWindowHandles();

        for (String id:ids){
            driver.switchTo().window(id);

            if (driver.getTitle().contains(title)){
                break;
            }
        }


    }



    public static void switchWindowWithURL(WebDriver driver,String url){
        Set<String> ids=driver.getWindowHandles();

        for (String id:ids){
            driver.switchTo().window(id);

            if (driver.getCurrentUrl().contains(url)){
                break;
            }
        }


    }



public static void moveToElementWithActions(WebDriver driver,WebElement element){
//i need a driver for action class and also need a webelement to use moveToElement so
// i provuded them in the method as a paramter

    Actions actions=new Actions(driver);
    actions.moveToElement(element).build().perform();

}



    public static void scrollWithPoint(WebElement element,WebDriver driver){
    JavascriptExecutor js= (JavascriptExecutor) driver;

    Point point=element.getLocation();
    int x= point.getX();
    int y= point.getY();

    js.executeScript("window.scrollTo("+x+", "+y+")");


    }


 public static void scrollWithJS(WebDriver driver,WebElement element){
     JavascriptExecutor js= (JavascriptExecutor) driver;
      js.executeScript("arguments[0].scrollIntoView(true)",element);

 }


 public static void clickWithJS(WebElement element,WebDriver driver){

        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click()",element);

 }



 public static String getTitleWithJS(WebDriver driver,String URL){

        JavascriptExecutor js= (JavascriptExecutor) driver;
     String actualTitle = js.executeScript("return document.title").toString();

     return actualTitle;

 }



 public static void acceptJSAlert(WebDriver driver){

        try{

            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
            wait.until(ExpectedConditions.alertIsPresent());
           Alert  alert=driver.switchTo().alert();
            alert.accept();
        }catch (NoAlertPresentException e){
            System.err.println("Exception occurred while attempting to switch to js alert "+e.getMessage());
        }

 }


 public static String getTextFromAlert(WebDriver driver){
     String text="";

     try{

         WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
         wait.until(ExpectedConditions.alertIsPresent());
         Alert  alert=driver.switchTo().alert();
         text=alert.getText();
     }catch (NoAlertPresentException e){
         System.err.println("Exception occurred while attempting to switch to js alert "+e.getMessage());
     }

     return text;

 }





}
