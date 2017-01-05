#Hopkins used item trading app - Iteration 1#


## 1. Group 16 information ##

### member ###
Yuhang Wang, Beinan Wang, Da Chen, Xiaoxiao Liu, Mengdan Zhang

## 2. Vision Statement##
Our goal is to design an used item trading app for the Johns Hopkins community.Allowing the users to find the desired items for the best price in a fast and convenient fashion will be our first priority, In addition, making the app a secure platform will also be our focus. Email and text verifications are required for successful registration. Thus, making sure sellers and buyers using the app are real. Besides the core functionality, extended features such as recommending items based on user's history will be added if we are ahead of our schedule.

##3. Feature List##

###Feature List###
1. A user shall be either in user mode or guest mode.
* Once the app is opened, the default mode for users is guest mode.
* A user shall be able to change mode between guest mode and user mode at anytime when he/she uses our app by logging in and logging out.
* A first-time user shall be able to register an account when using the app.
* When registering an account, the user shall provide his/her JHU email address, phone number and a password. Both the email address and the phone number need to be verified.
* A user shall be able to log in by using his/her email address and password.
* In user mode, a user shall have an account view.
* In user mode, a user shall be able to complete his/her personal info by entering his/her name, address and uploading a badge photo in his/her account view. 
* In user mode, a user shall be able to edit his/her name, address, password and profile photo in account view.
* In user mode, a user shall be able to change his/her phone number and re-verify it.
* A user shall be able to browse items through different departments.
* [Optional] A user shall be able to use the filter function to search for items that satsify specific conditions.
* [Optional] The user shall be able to use the search engine to find items.
* In guest mode, a user shall not be able to see another user's contact information and address.
* In user mode, a user shall be able to see others’ contact information and  address.
* In user mode, a user shall be able to post items in his/her account view.
* In user mode, a user shall be able to collect items, and be able to open his/her “Wish List” to manage the collected items.
* In user mode, a user shall have a selling list in his/her account view.
* To post a new item for sale, a user **must** be in user mode and must provide the following information: 
    * the name of the item
    * the category the item belongs to
    * the price
    * the date the item becomes available 
    * the expiration date of the item 
    * availability of delivery
    * the pick-up address
    * at least one photo of the item
    * an optional description
    * condition of the item
* Once an item is sold before its expiration date, the user shall be able to tag that item as unavailable.
* An item shall be tagged unavailable when it expires unless its owner extend its expiration date.
* In user mode, a user shall be able to delete his/her posted items.
* Our app shall be able to clean unavailable items regularly and automatically.
* [Optional] An item shall have an attribute to reflect how many people have liked it.
* [Optional] In user mode, a user shall be able to see his/her view history. 
* [Optional] Our app shall be able to recommend items to users via recommendation algorithm.

## 4. UI Sketches ##

### Register Step1 : Verify Email ###
![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/1.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/4.png)

### Register Step2 : Verify Phone Number ###
![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/2.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/5.png)

### Register Step3 : Confirm Password ###
![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/3.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/6.png)

### Login ###
![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/7.png)

### Home: Top-level Departments ###
**Guest Mode** : Post, Selling, Wishes is **NOT** available.

![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/8.png)



**User Mode** : Post, Selling, Wishes can be clicked.

![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/9.png)

(Click 1 department: for example "Bedroom")

### Home: Second-level Categories ###
![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/10.png)

### Home: List Page ###
![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/11.png)

### Home: Detail Page ###

![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/12.png)

### Post: Add an Item for Sell ###

![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/13.png)

### Wishes: Wishlist ###
![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/14.png)

### Selling: List of Items on Selling ###

![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/15.png)

### Me: Manage Accont ###
![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/16.png)


## 5. Domain Analysis##
### Graph notion ###
![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/pattern.jpg)

### Login && Register ###

![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/Login_Register.jpg)

### Home ###

![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/Home.jpg)

### Wishlist && Me ###

![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/WishList_Me.jpg)

### Post && selling list###

![](https://github.com/jhu-oose/2016-group-16/blob/master/Iteration1/img/Post_Selling.jpg)

## 6. User-case list ##

### Guest sign up ###
1. Guest user opens app
2. Main page displays top-level departments together with 4 buttons (Post, Selling, Wishlist and Me) at the bottom of the page. All buttons except "Me" cannot be clicked, as user has not logged in.
3. User clicks "Me" button
4. Server directs user to login/register page
5. User clicks "create a new account"
6. Server directs user to register page
7. User enters username, password, email and phone number
   - If email has been registered, user will be directed back to register page, with a notification saying "The email has been registered!"
8. Server sends a verification email
9. User checks email and clicks verification link
10. Server sends a notification saying "Email verified."
11. Server sends a verification message to phone number
12. User checks message and enters verification code
13. Server sends a notification saying "Your account is created successfully."
13. User is redirected to main page, where "Post", "Selling", "Wishlist" buttons are lightened

### User log in ###
1. Existed user opens app
2. Main page displays top-level departments together with 4 buttons (Post, Selling, Wishlist and Me) at the bottom of the page. All buttons except "Me" cannot be clicked, as user has not logged in.
3. User clicks "Me" button
4. Server directs user to login/register page
5. User enters username and password, then clicks login button
   - If username and password match, user will be redirected to main page, where "Post", "Selling", "Wishlist" buttons are lightened
   - If username does not existed or username and password do not match, user will be directed back to login/register page, with an error notification saying "sign-in error"

### User wants to update personal information ###
1. User logs in successfully
2. User clicks "Me" button at the bottom-right corner of the page
3. Server displays the menu below: 
   - My profile
   - My wishlist
   - My sell
   - Help
4. User clicks "My profile" link
5. Server displays user's personal info., together with an "Edit" button at the upper-rigtht corner of the page
6. User clicks the "Edit" button
7. Server displays user's personal info. and a "Save" button at the bottom of the page. Here, each element is editable.
8. User updates personal info. and clicks "Save" when he/she finishes.
   - If email address or phone number is missing, user will be directed back to edit page with an error notification saying "Contact information cannot be missing."
   - Else, user will be directed to "My profile" view page

###Guest wants to see seller's contact information ###
1. Guest user opens app
2. Main page displays top-level departments together with 4 buttons (Post, Selling, Wishlist and Me) at the bottom of the page. 
3. Guest clicks a department (Bedroom)
4. Page displays a list of second-level categories (Beds, Mattresses, Lighting, and etc.)
4. Guest clicks a category
5. Page displays a list of item overview
5. Guest clicks an item to view detail info.
6. Server displays detail info. of an item, together with a link: "please login/register to see the seller's contact information"
7. Guest clicks link
8. Server directs user to login/register page
9. User enters JHU email and password to log in
10. Server checks email and password 
11. User is directed back to item detail page
12. Now the user is able to see the seller's contact information.

###Guest wants to add an item to wishlist ###
1. Guest clicks a second-level category
2. Server displays a list of item overview 
3. User clicks the star located at the upper-right corner to like an item (add the item to wishlist)
4. A login/register page pops up with a notification saying "You need to login to add this item to your wishlist."
5. User logs in or creates an account successfully 
6. User is directed back to item list page
7. User clicks star again to like the item
8. Server adds item to wishlist

### User wants to view/update wishlist ###
1. User logs in successfully
2. User clicks "My wishlist" button
3. Page displays the menu shown as below: 
   - My profile
   - My wishlist
   - My sell
   - Help
4. User clicks "My wishlist" link
5. Page displays a list of items the user liked before. A list item consists of:
   - furniture name
   - link to view furniture detail
   - "Delete" botton    
   
####view item detail####
1. User clicks link to view detail information of an item
2. Page displays item's detail info., including name, description, price, photo, time left, and etc. 

####remove item from wishlist####
1. User clicks "Remove" button of an item 
2. Server deletes the item from wishlist and directs user back to wishlist page.
3. Now the user is able to see that the item has been deleted 
    
### User wants to post an item for sell ###
1. User logs in successfully
2. User clicks "Me" button
3. Page displays menu shown below: 
   - My profile
   - My wishlist
   - My sell
   - Help
4. User clicks "My sell" link
5. Server displays a list of for-sell items together with a "New" botton at the page's upper-right corner 
6. User clicks "New item" button
7. A "create item" page pops up
7. User enters detail info. to create a new item
8. Server updates for-sell list, and directs user back to "My sell" list page.
9. Now the user is able to see that the new item has been added 

### User wants to view/update/remove a for-sell item###
1. User logs in successfully
2. User clicks "Me" button
3. Page displays menu shown as below: 
   - My profile
   - My wishlist
   - My sell
   - Help
4. User clicks "My sell" link
5. Server displays a list of for-sell items together with a "New item" botton. A list item consists of:
   - furniture name
   - link to view furniture detail
   - "Edit" botton
   - "Remove" botton
   
####view item detail####
1. User clicks link to view detail info. of an item
2. Server displays item's detail info., including name, description, price, photo, time left, and etc. 

####update item details####
1. User clicks "Edit" button of an item 
2. Page displays item's detail information and a "Save" button at bottom of page. Here, each element is editable.
3. User updates item's information and clicks "Save" when he/she finishes
4. Server updates item info. and directs user back to "My sell" page
5. Now the user is able to see that the item has been updated

####remove item from for-sell list####
1. User clicks "Remove" button of an item 
2. Server deletes item from for-sell list and directs user back to "My sell" page.
3. Now the user is able to see that the item has been deleted 

## 7. Architecture ##

Our project will adopt a model-view-presenter architecture to deal with the separation of concerns. 

The model layer employs Java to define the data and MySQL to build the database. Ionic will be used as the framework for the design of the view layer. 

In between, a presenter layer will be constructed with the help of the RxJava library. In addition, a SMS gateway such as Ozeki NG SMS Gateway and the Apache HttpComponents library are needed for our cell phone validation feature.

Last but not least, existing open source implementations of the Java Servlet, potentially Tomcat will be used to aid the development of our email verification feature.



 
