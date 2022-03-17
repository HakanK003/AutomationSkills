package com.hk.tests.extra;

public class NormalizeSpace {

    // This is the way for normalizing spaces for locators


/*

     1-  <tagName>      goodbye   random        spaces       </tagName>

     xPath --> //tagName[normalize-space(text())='goodbye random spaces']


     2-  <label id='has    random   spaces       '>text </label>

     xPath --> //label[contains(normalize-space(@id),'has random')]

 */


/*

    --> Other Example Scenarios
    
    1- normalize-space('hello')	-->	hello

    2- normalize-space(' hello ')	-->	hello

    3- normalize-space('there there')	-->	hello there

    4- normalize-space('hello       there')	-->	hello there

    5- normalize-space('   hello       there   ')	-->	hello there


    6- normalize-space('hello
    					there')	-->	hello there

    7- normalize-space('')	-->	zero-length string

    8- normalize-space('   ')	-->	zero-length string

    9- normalize-space(())	-->	zero-length string

    10- normalize-space(      hello  )	-->	hello

*/



}
