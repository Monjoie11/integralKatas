#Integral Social Networking Kata

###This application has been updated to a newer version of Gradle to accomodate incluson of Spring Boot 2.0

My approach will be to:

1) Stub a repo that satisfies Feature:Publishing
2) Implement service satisfying ""
3) Expose Controller satisfying ""

I will be using Test Driven *Design*

I will create empty classes, then failing test, then implement necessary code for test to pass, then refactor, then add a faiiling test of the next functionality, then repeat

I am making my init commit a 5:00pm mdt

--------------------------------------------

6:59pm debreif:

Yet another time TDD saves the day. Starting within a messageServiceImpl my first failing test led me to create a user class, which ;ed me to solving all of the functionality of the publishing feature within User's design. These messageTest test more directly asses user, and would ultimatley be moved to a User test class. I have left them here for accuracy. I look forward to completing the next features.
