Feature: Validate the demoblaze e-commerce website funtionality

@scenario1
Scenario: Order Mobile Phone
Given user Launch The Url Of Demoblaze Website
When user Click The Login Button
And user Enter The Username In Username Field
And user Enter The Password In Password Field
And user Click The Log Button
And user Click The Samsung Mobile In The List
And user Click The Addtocart Button
And user Click The Cart Button In The Top
And user Click The Placeorder Button
And user Enter The Name In Name Field
And user Enter The Country In Country Field
And user Enter The City In City Field
And user Enter The Creditcard In Creditcard Field
And user Enter The Month In Month Field
And user Enter The Year In Year Field
And user Click The Purchase Button
And user Click The Ok Button

@scenario2
Scenario: Delete Previous Order and purchasing another Products
When user Click The Nokia Mobile
And user Click The Addtocart Button
And user Click The Home Button
And user Click The Sonylaptop
And user Click The Addtocart Button
And user Click The Home Button
And user Click The Iphone 
And user Click The Addtocart Button
And user Click The Cart Button In The Top
And user Delete The Nokia Mobile
And user Click The Placeorder Button
And user Enter The Name In Name Field
And user Enter The Country In Country Field
And user Enter The City In City Field
And user Enter The Creditcard In Creditcard Field
And user Enter The Month In Month Field
And user Enter The Year In Year Field
And user Click The Purchase Button
And user Click The Ok Button

