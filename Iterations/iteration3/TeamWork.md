# Team Work

## Team Info (We are group 16!)
Name|	Email|Github
| --- |:-----:| -----:|
Yuhang Wang|ywang289@jhu.edu|Nautilus1993
Xiaoxiao Liu|xliu91@jhu.edu|xliu59
Mengdan Zhang|mzhang45@jhu.edu|MengdanZhang0321
Beinan Wang|bwang48@jhu.edu|kyo744
Da Chen|dchen78@jhu.edu	|Firmamenter

## Teamwork Tips -- keep updating :)

###How to teamwork in the following iterations:

--- Yuhang

#### 1. Git: 

+ "pull the newest version" everytime openning IntelliJ IDEA && Android Studio, before adding more functions. 

+  "Don't new a branch".

+ Submit back: before submit, pull the newest version again to make sure there is no conflict with current works. 

####2. Code Review: (we need to work together at least 2-3 times a week, 3-4 hours each time)

Code owner go through what you had ever done since last commit. Others need to be careful for the following points:

+ Architecure.
	+ Does he logically seperated his works to correct places? (please follow MVC pattern strictly).

+ API. 
	+ Does his works -- in XX_Controller.java -- match our API definitions? 
	+ if not, we need to either change the {request, response} in his code or [API](https://github.com/jhu-oose/2016-group-16/blob/master/iteration3/API.md) definition. The reason why synchronizing "Controller endpoints" and "API definitions" is for **unit test** and **frontend-backend seperation**.

+ Database.  
	+ Does his work update our current [DB schema](https://github.com/jhu-oose/2016-group-16/blob/master/iteration3/Database.md), like create or delete tables?
	+ If yes, please fetch out why he did that. If his reasons make sense, we will update database and documents(schema).








