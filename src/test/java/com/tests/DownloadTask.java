package com.tests;

import com.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DownloadTask extends TestBase {

    @Test
    public void fileDownload(){
        WebDriverWait wait= new WebDriverWait(driver,10);
        // 1- user gets the homepage "https://demoqa.com/"
        //  2- and user clicks elements button
        //3- and user verifies "Elements" text
        //4- And user clicks upload and download button
        //5- when user clicks download button
        //6- Then user verifies downloaded file is exist

        // 1- user gets the homepage "https://demoqa.com/"
        driver.get("https://demoqa.com/");

        //  2- and user clicks elements button
        driver.findElement(By.xpath("//h5[1]")).click();

        //3- and user verifies "Elements" text
        String actualElementText= driver.findElement(By.xpath("(//*[text()='Elements'])[1]")).getText();
        String expectedElementText="Elements";
        Assert.assertEquals(actualElementText,expectedElementText,actualElementText +" is not equal to "+ expectedElementText);

        //4- And user clicks upload and download button
        driver.findElement(By.xpath("(//li[@id='item-7'])[1]")).click();

        //5- when user clicks download button
        WebElement downloadButton =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("downloadButton")));
        downloadButton.click();

        String userPath= System.getProperty("user.home");
        System.out.println("User Home: "+userPath);

        boolean isExists= Files.exists (Paths.get("C:\\Users\\Karadayi\\Downloads\\sampleFile.jpeg"));

        Assert.assertTrue(isExists);










    }


}
