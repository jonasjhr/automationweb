package br.com.chornosacademy.automacaoweb;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testeWeb {
    @Test
    public void primeiroTeste(){
        //WebDriverManager.firefoxdriver().setup();
        //FirefoxDriver objetoDriver;
        //objetoDriver = new FirefoxDriver();

        WebDriverManager.chromedriver().setup();
        ChromeDriver testeDriver;
        testeDriver = new ChromeDriver();
        testeDriver.manage().window().maximize();

        testeDriver.get("https://www.chronosacademy.com.br/");

       // String xpath = "//*[@id=\"header-produto\"]/div[2]/div/div/a";
       // WebElement txtTexto = testeDriver.findElementByXPath(xpath);
       // String titulo = txtTexto.getText();

       //00 Assert.assertEquals("",titulo);

        testeDriver.quit();

    }

}
