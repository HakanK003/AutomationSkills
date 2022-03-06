package com.hk.tests.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skill004_CssSelector {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("WebsiteURL");

        /*
         * Css Selector
           -

         */

    }

}

/*
- cssSelector locator:
    - cssSelector is one of 8 locators from Selenium library.
    - cssSelector allows us to create custom locators.
    - we are able to locate web elements with any attribute value.
    - we are not just limited to name, id, className
    - we can use any custom attribute we see on a web element

    syntax#1: tagName[attribute='value']
    syntax#1: tagName[attribute="value"]

ex:    <label class="login-item-checkbox-label" for="USER_REMEMBER">Remember me on this computer</label>

cssSelector practice #1- Locate "label" using "class" attribute

    tagName[attribute='value']

    label[class='login-item-checkbox-label']


cssSelector practice #2- Locate "label" using "for" attribute

    tagName[attribute='value']

    label[for='USER_REMEMBER']



ex#2: ex: <a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>

#1- locate above link using cssSelector, using name:

    tagName[attribute='value']
    a[name='uh68']

#2- locate above link using cssSelector, using id:

    a[id='bb22']

#3- locate above link using cssSelector, using class:

    a[class='ff58']

#4- locate above link using cssSelector, using href:

    a[href='https://tesla.com']


- cssSelector has another syntax, but it works with id and class attributes only.

- . stands for class attribute
- # stands for id attribute

syntax#2:

    tagName.classValue
    tagName#idValue


ex#3: ex: <a href="https://tesla.com" name="uh68" class="ff58" id="bb22"> TESLA CYBERTRUCK </a>

    tagName.classValue ---> a.ff58

    tagName#idValue --> a#bb22

    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    - cssSelector:
    - cssSelector is one of 8 locators of Selenium.
    - It allows users/us to create custom locators using attributes and values.
    - It does not limit us using only class, id, name attributes.
    - We can use ANY attribute and their values.
    - It has its own syntax that we must follow to create cssSelector.
    - Using cssSelector we can go from parent to child element.
    - To go from parent to child we use > sign.
    - Using cssSelector we cannot go from child to parent.

    parentElement  > childElement

    div[class='large-6 small-12 columns'] > label

- SYNTAX #1:
- We are not limited with any attribute or value.

    tagName[attribute='value'] --> more specific way of writing css

    [attribute='value'] --> we can even not provide tagName, but it will be less specific

- SYNTAX #2:

- We are limited with id, and class attributes' values.

-What does . stand for in cssSelector?
- . stands for class in cssSelector

-What does # stand for in cssSelector?
- # stands for id in cssSelector


<div id="55k" name="kgl33" for="randomV12">
    <a href="https://tesla.com"> CYBERTRUCK OFFICIAL </a>
</div>

ex#1_syntax#1: write css selector that is locating the a tag

    a[href='https://tesla.com']


ex#2_syntax#1: write css selector that is locating the "div" tag "for" attribute

    tagName[attribute='value']
    div[for='randomV12']
    div[name='kgl33']
    div[id='55k']

- all of the above locators are locating the same web element, <div>.

ex#3_syntax#2:write css selector that is locating the "div" tag "id" attribute

    tagName#idValue
    div#55k



 */