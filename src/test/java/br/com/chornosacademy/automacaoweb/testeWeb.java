package br.com.chornosacademy.automacaoweb;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testeWeb {
    ChromeDriver testeDriver;

    @Before
    public void inicializarTestes () {
        WebDriverManager.chromedriver().setup();
        testeDriver = new ChromeDriver();
        testeDriver.manage().window().maximize();
        testeDriver.get("https://www.chronosacademy.com.br/");
    }


    @Test
    public void primeiroTeste(){
        //WebDriverManager.firefoxdriver().setup();
        //FirefoxDriver objetoDriver;
        //objetoDriver = new FirefoxDriver();
       // /html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4

       String xpath = "//section[2]//h4";
       WebElement txtTexto = testeDriver.findElementByXPath(xpath);
       String titulo = txtTexto.getText();

       Assert.assertEquals("Porque Tempo É Conhecimento",titulo);


    }


    @After
    public void finalizarTestes() {
        testeDriver.quit();

    }

}
