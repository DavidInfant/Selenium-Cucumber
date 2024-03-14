Feature: To validate the login fundtionality of gmail applications
Scenario Outline: To validate the positive and negative combination of login functionality
Given User has to launch the browswer and maximise the window
When User has to launch Gmail url
And User has to pass the data "<emaildatas>" in email field
And User has tp pass the data "<passworddatas>" in password field
And User has to click login button
Then User has to close the browser

Examples:
|emaildatas               |passworddatas|
|seleniuminmakes@gmail.com|Inmakes|
|123@gmail.com            |abcdefg|
|abcd@gmail.com           |123456|
|inmakes@gmail.com        |selenium|
|frameworks@gmail.com     |selenium|
|manualtesting@gmail.com  |tesing123|
|apitesting@gmail.com     |Table@123|
