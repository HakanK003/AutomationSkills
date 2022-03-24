package com.hk.tests1_TestNG.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skill011_WebTables {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.hhhhhhhh.com/web-tables");


        // we want to print name and card number

        WebElement tableLast = driver.findElement(By.xpath("//tbody//tbody/tr[last()]/td[2]"));

        for (int i = 2; i<=9;i++) {
            WebElement tableName = driver.findElement(By.xpath("//tbody//tbody//tr[" + i + "]//td[2]"));
            WebElement tableCardNumber = driver.findElement(By.xpath("//tbody//tbody//tr[" + i + "]//td[11]"));
            System.out.println(tableName.getText()+"'s card number is "+tableCardNumber.getText());
        }
    }

}

/*

        - HOW DO WE HANDLE WEBTABLES USING SELENIUM?
        - We write custom locators using xpath or cssSelector and get the data we want to get.

        - How do we create HTML web tables?
        - <table> tag creates html web tables.

        #1- We create the table tag
        #2- We create rows first
        #3- We create cells inside of the rows

        td: table data     -> used to create cells inside of a table
        th: table header-> used to create cells, but it will make content bolded and centered
        tr: table row     -> used to create rows inside of table


        ex


        P1_ WRITE A LOCATOR THAT RETURNS THE TABLE 1 ITSELF

            //table[@id='table1']


        P2_ WRITE A LOCATOR THAT RETURNS ALL OF THE ROWS INSIDE OF TABLE 1

            //table[@id='table1']//tr

        P3_ WRITE A LOCATOR THAT RETURNS ALL OF THE ROWS INSIDE OF BODY - TABLE 1

            //table[@id='table1']/tbody//tr


        P4_ WRITE A LOCATOR THAT RETURNS ONLY 3RD ROW IN THE BODY

            //table[@id='table1']/tbody//tr[3]

        P5_ WRITE A LOCATOR THAT RETURNS ALL OF THE CELLS IN ALL OF THE ROW (IN BODY)

            //table[@id='table1']/tbody//tr//td

            //table[@id='table1']//tr//td -> if there is no <td> in <thead> we can use this too

        P6_ WRITE A LOCATOR THAT RETURNS ALL OF THE FIRST NAMES FROM TABLE

            //table[@id='table1']/tbody//tr//td[2]

        P7_ WRITE A LOCATOR THAT RETURNS FRANKS CELL SPECIFICALLY

            //table[@id='table1']/tbody//tr[2]//td[2]

            We are saying:

            //tr[2] : get me the second row in the <tbody>
            //td[2] : get me the second cell in the 2nd row.

        P8_ WRITE A LOCATOR THAT RETURNS FRANKS CELL SPECIFICALLY
            USE FRANKS TEXT

            //table[@id='table1']//td[.='Frank']

            - If you can create locators with text, it will be more dependent against the dynamism of the table


        P9_ WRITE A LOCATOR THAT RETURNS $100 CELL SPECIFICALLY
            USE FRANKS TEXT


            //table[@id='table1']/tbody//tr[3]//td[4]

            //table[@id='table1']//td[.='$100.00']


        P10_ WRITE A LOCATOR THAT RETURNS JASONS DUE AMOUNT BASED ON JASONS NAME


        1- We can locate Jason, go to parent row, and come back in the same row to get "Due" cell
            //table[@id='table1']//tbody//td[.='Jason']/../td[4]

        2- We can use the sibling method from xpath
            //table[@id='table1']//tbody//td[.='Tim']/following-sibling::td[2]

        P11_ WRITE A LOCATOR THAT RETURNS Tim's last name  BASED ON tim's NAME

            //table[@id='table1']/tbody//td[.='Tim']/../td[1]

            //table[@id='table1']/tbody//td[.='Tim']/preceding-sibling::td


        P12_ WRITE A LOCATOR THAT RETURNS ALL EMAILS THAT HAS $50 DUE DATE

            //table[@id='table1']/tbody//td[.='$50.00']/preceding-sibling::td[1]




 */