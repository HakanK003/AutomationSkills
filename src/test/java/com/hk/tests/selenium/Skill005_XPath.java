package com.hk.tests.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skill005_XPath {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("WebsiteURL");

    /*
    * XPath Locators
        - xpath is one of 8 locators of Selenium
        - xpath allows us to create custom locators using provided attributes and their values
        - we can also use the text of the provided web element to create locators
        - XPATH has 2 different types
        - XPATH allows us to create custom locators.
        - We can use any attribute and any attribute value to create our own custom locator.
        - Xpath can move from parent to child and child to parent
    */

    /*
    * ABSOLUTE XPATH:
        - Absolute xpath starts with single slash "/"
        - It starts looking in html from the root/parent element : html element
        - It starts from html tag, and it goes down 1 by 1 until we reach to the web element we are looking for
        - This is not good way of locating a web element.
        - It will break with any minimal change in the html code.

        --> /html/body/table/tbody/tr[2]/td/div/div/form/div[4]/button
    */



     /*
     * RELATIVE XPATH
        - Relative xpath starts with double slash "//"
        - "//" means you can start from anywhere in the HTML code
        - Since we are allowed to start from anywhere in the HTML code, relative xpath is very dependable
        - We will use relative xpath, not absolute xpath
        - The only time your relative xpath is breaking (not working) is when/if the developer is specifically changing the attribute value we used

        --> MAIN SYNTAX: //tagName[@attribute='value']
    */


    /*
    * COMMONLY USED XPATH SYNTAX:

        #1- //tagName[@attribute='value']
        - We are saying, get me the given tag with provided attribute and value
        #2- //tagName[contains(@attribute, 'value')]
        - We are saying, get me the given tag that has the attribute which contains the value in the locator
        #3- //tagName[.='text']  same as //tagName[text()='text']
        - This locator will return the web element with given text
        #4- //*[@attribute='value']
        - We are saying, we do not care about which tagName, return us the web element with matching attribute and value result


     */


     /*
         - We use "/" single slash to move to direct child
          - We use "//" double slash to move to any child.
          - It means jump to the point I will be giving to you  - Or start from anywhere.


            - How do we move from parent to direct child using xpath?
                - We use "/" single slash to go to direct child.

            - How do we move from parent to direct child using xpath?
                - We use "//" double slash to go to any child.

            - How do we move from child to parent using xpath?
                - We use "/.."
                - This will take our locator to the parent of currently located web element.


          - How do we move from child to parent?
                - We use "/.."
                - We do not have to provide any tag name when we are moving from child to parent.
                - It will automatically move to direct parent

                1-    <div id="uh98">
                2-        <div>
                3-            <a href="https://google.com"> Google 1 </a>
                4-        </div>
                5-        <div>
                6-            <a href="https://google.com"> Google 2 </a>
                7-        </div>
                8-        <div>
                9-            <a href="https://google.com"> Google 3 </a>
                10-        </div>
                11-    </div>

                    ex: Locate Google 2 link using its text with xpath

                1-    //a[.='Google 2'] --> this locator is returning me line 6

                2-    //a[.='Google 2']/..  --> this locator is returning me line 5

                3- //a[.='Google 2']/../.. --> this locator is returning me line 1



            - How do we go from sibling to sibling?
            - There are two methods for going from sibling to sibling
            - "/preceding-sibling::" will go to the sibling that comes before
            - "/following-sibling::" will go to the sibling that comes after

            - The web element we locate will become the starting point (point 0).
            - We decide whether we want to go preceding or following sibling.
            - We count and we pass the index number.

                //tagName[@attribute='value']



            ex:    //option[@value='3']


                <select>
            2        <option value="1"> Orange 1</option>
            1        <option value="2"> Orange 2</option>
            0        <option value="3"> Orange 3</option>
            1        <option value="4"> Orange 4</option>
            2        <option value="5"> Orange 5</option>
                </select>


            //option[@value='3']/preceding-sibling::option[1] --> this will point to Orange 1

            //option[@value='3']/following-sibling::option[2] --> this will point to Orange 5


            ex #1: locate month May using its value

                    (//option[@value='4'])[1]

            ex #2: locate month of March using May locator as a base and use sibling method

                    (//option[@value='4'])[1]/preceding-sibling::option[2]


            ex #3: locate month of October using May locator as a base and use sibling method

                    (//option[@value='4'])[1]/following-sibling::option[5]



      */

     /*
     * Indexing using xpath locator:
        - If there are more than 1 matching results for an xpath locator, we can use indexes to select exactly which one we want.

        <div>
            <a href="https://google.com"> Google 1 </a>
            <a href="https://google.com"> Google 2 </a>
            <a href="https://google.com"> Google 3 </a>

        </div>

        ex: //a[@href='https://google.com'] --> this will return me 3 matching results.

        - I can use indexes to select exactly a specific one.


        (//a[@href='https://google.com'])[1] ---> returns Google 1
        (//a[@href='https://google.com'])[2] ---> returns Google 2
        (//a[@href='https://google.com'])[3] ---> returns Google 3

        - For xpath indexes start from 1

        - What is the syntax with the indexing in xpath?
        - How do we use indexes with xpath?

        - //tagName[@attribute='value'][3]
        - If we use indexes without paranthesis, this way will only work in direct siblings.

        - (//tagName[@attribute='value'])[3]
        - If we use indexes with paranthesis, this way it will work and index through the whole html page.

      */

      /*
           - How do you handle dynamic web elements?
            - How do you handle web elements with dynamic attribute value?

            - Dynamic attribute value: means some part of an attribute value is changing when the page is refreshed.

                    Answer#1: we use xpath methods: contains, starts-with, and ends-with

                    1-    //tagName[contains(@attribute, 'value')]
                    2-    //tagName[starts-with(@attribute, 'value')]
                    3-    //tagName[ends-with(@attribute, 'value')]

                    Answer#2: we can also locate a static (stable) parent or child web element, locate that, and move to desired web element.

                    genk12034789102348971234
                    genk98012731098237102933

                     1                2

                    0ahUKEwj6seyij4L2AhWejYkEHRdZBUMQ39UDCAY
                    0ahUKEwiY2L7wj4L2AhVzkokEHRqzCo4Q39UDCAY


                    //input[contains(@data-ved, '0ahUK')]

       */

    /*
    * Chrome developer tool :
        - Chrome developer tool : right click > copy > copy selector --> cssSelector
        - chrome developer tool : right click > copy > copy xpath --> relative xpath
        - chrome developer tool : right click > copy > copy full xpath --> absolute xpath
        - I do not suggest using any tools unless for just seeing example purpose.
    */

    /*
    * How to move lines up and down without having to copy and paste:
        - Keep your cursor in the line you want to move
        - MAC: command + shift + up or down arrow
        - Windows : control + shift + up or down arrow
     */

    }

}
