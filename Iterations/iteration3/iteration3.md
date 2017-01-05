# Iteration 3  
## Current Progress (Iteration 3)
  
+ The objective of this iteration is to focus on 
    + Front-End interaction (login/registration)
    + detailed API definition
    + database design and implementation

+ Implemented Features

  + Registration(partially): 
  
  When a user enters his/her email address during registration, the email address will be sent to the backend. The backend will query the database to see if the email address already exists. If so, a message "Email already exists" will pop on the android device screen. The user has to enter new email addresses until one is not in the databse. If a fresh email address is provided, a screen showing succesful email verification will be briefly displayed. After that, the user will be directed to the phone verification page which works similarly to the email verification page. On the password setup page, the user needs to enter a password that is at least 8 characters long and retype it to confirm. If the two passwords do not match, a message "Password confirmation doesn't match!" will show up. If the passwords match but are too short, a message "Password too short" will be generated instead. 
  
  + Login: 
  
  When a user enters his/her email address and password during login period, the email must contain @ and password must have at least 8 characters. If email and password matches record in our database, then a message "User Login!" will be generated. Otherwise, message "User not Login" will be generated instead.

## Future implementations

### Iteration 4
   
   + Refine login/registration
   + User create and update personal profile.
   + Fetch items list based on user's choice of categories.
   + Fetch item detail info and display.
   + User post/like item.
   + Generate selling list/ wish list.

### Iteration 5 

  + Complete login/registration.
  + Admin system: manage posted items.
  + Google API.
  + Recommendation System.
  

### Iteration 6

  + Complete all functions covered with test.
  + Documentation.
  + Remote deployment.

## Code
The fronted and backend are located in two separate repositories. You can access them through the link below:  
  
+ [frontend](https://github.com/Firmamenter/Frontend)

The fronted repo contains the android project which can be imported into Android Studio.  

+ [backend](https://github.com/Firmamenter/Backend)

The backend repo contains the maven project and the databse (the db file) just for simple testing purposes.

## Database

+ DB Schema: click [here](https://github.com/jhu-oose/2016-group-16/blob/master/iteration3/Database.md).

## API 

+ API details: clike [here](https://github.com/jhu-oose/2016-group-16/blob/master/iteration3/API.md).

## Team work

+ Please [add](https://github.com/jhu-oose/2016-group-16/blob/master/iteration3/TeamWork.md) your ideas to improve teamwork effectiveness.
