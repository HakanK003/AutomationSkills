package com.hk.tests.selenium;

public class Skill010_Dropdowns {
}


/*
- DROPDOWNS:

- How many types of dropdowns we have?
- 2


#1- HTML Dropdowns (non-select)
    - If the dropdowns are created using anything other than <select> tag, it is a "non-select dropdown"

#2- Select Dropdowns
    - If dropdown is created using <select> tag, it is a select dropdown
    - To be able to use the Select class from Selenium, it has to be <select> dropdown.

- How do we handle select dropdowns?
#1- I would create Select class object
#2- I would locate the <select> dropdown and pass it into the constructor.
#3- Now I can use the Select object with the methods that comes from Select class.

- getOptions :
    - to get all <options>
    - Return type: List<WebElement>

- getFirstSelectedOption :
    - returns the currently selected option as a single web element.
    - Return type: WebElement

- selectByIndex
- selectByValue
- selectByVisibleText
 */