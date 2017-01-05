## Part 1. Information
- name: JHUFurniture
- groupid: 16
- name: Mengdan Zhang, Xiaoxiao Liu, Beinan Wang, Yuhang Wang, Da Chen
- [the backend code] (https://github.com/MengdanZhang0321/javaBackendAmanda)

## Part 2. Updated from iteration 1

###Feature List
1. A user shall be either in user mode or guest mode.
* Once the app is opened, the default mode for users is guest mode.
* **[Key Feature] A user shall be able to change mode between guest mode and user mode at anytime when he/she uses our app by logging in and logging out.**
* **[Key Feature] A first-time user shall be able to register an account when using the app.**
* When registering an account, the user shall provide his/her JHU email address, phone number and a password. Both the email address and the phone number need to be verified.
* **[Key Feature] A user shall be able to log in by providing his/her email address and password.**
* **[Key Feature] Our app also supprots administrators who are authorized to maintain system.**
* In user mode, a user shall have an account view.
* In user mode, a user shall be able to complete his/her personal info by entering his/her name, address and uploading a badge photo in his/her account view. 
* In user mode, a user shall be able to edit his/her name, address, password and badge photo in account view.
* In user mode, a user shall be able to change his/her phone number and re-verify it.
* A user shall be able to browse items through different departments.
* **[Key Feature] A filter function shall be available. Items can also be sorted by Price, Newest Arrivals, Popularity, etc.**
* **[Key Feature] Our app will include a recommendation algorithm, to suggest products based on a user's wishlist.**
* In guest mode, a user shall not be able to see another user's contact information and address.
* In user mode, a user shall be able to see others’ contact information and  address.
* **[Key Feature] In user mode, a user shall be able to post items.**
* **[Key Feature] In user mode, a user shall be able make a wishlist by starring items of interest. The wishlist can be viewed and edited.**
* In user mode, a user shall have a selling list.
* To post a new item for sale, a user **must** be in user mode and must provide the following information: 
    * the name of the item
    * the category the item belongs to
    * the price
    * the date the item becomes available 
    * the expiration date of sale 
    * availability of delivery
    * the pick-up address
    * at least one photo of the item
    * an optional description
    * condition of the item
* Once an item is sold before its expiration date, the user shall be able to tag that item as unavailable.
* An item shall be tagged as unavailable when it expires unless its owner extends its expiration date.
* In user mode, a user shall be able to delete his/her posted items.
* Our app shall be able to clean unavailable items regularly and automatically.
* **[Key Feature] In user mode, a user shall be able to subscribe to a subdepartment and receive notifiction emails or text messages either weekly, or everytime a new item is posted in the subscribed subdepartment.**
* An item shall have an attribute to reflect how many people have wishlisted it.
* **[Key Feature] In user mode, a user shall be able to see the distance between items' pick-up address and his/her own address.**
* When a user posts a new item, he/she shall be able choose the way of being contacted by potential buyers from our four standard contact methods: email, facebook, text, and phone.
* **[Key Feature] In user mode, once clicking one of our four standard contact methods in a item's details page, our app will switch to corresponding appliactions helping you contact with seller.**
* *[Extended Feature] Our app shall provide search engine for users.*
* *[Extended Feature] In user mode, a user shall be able to see his/her view histories and contact histories.*

### GUI sketches
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/1.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/2.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/3.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/4.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/5.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/6.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/7.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/8.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/9.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/10.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/11.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/12.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/13.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/14.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/15.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/16.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/17.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/18.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/19.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/20.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/21.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/22.png)
![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/23.png)


## Part 3. Architecture

### System Architecture


We are planing to develop both the **Android Application System** and **Web management platform** based on Model-View-Controller(Presentor) pattern. 

![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/Android.jpg)

####Deployment: 
Android devices + Server with public IP address(AWS)

####Client (View) : 

1. Include UI layout and reactful activities.
2. Send http request to server.
3. Receive http response and extract data out.

####Server(Model + Presentor) : 

1. Listen on 80 Port. Receive request and send response back.
2. Define the class methods and attributes.
3. Mapping database tables to model (logical classes).
4. manage database.


------

![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/Web.jpg)

####Deployment: 

Server with Public IP Address(AWS). 

####Client (Browser) : 

1. Send http request to server.
2. Receive http response and extract data out.
3. Manage cookies and sessions.

####Server(View + Model + Presentor) : 

1. Include UI layout and reactful activities.
1. Listen on 80 Port. Receive request and send response back.
2. Define the class methods and attributes.
3. Mapping database tables to model (logical classes).
4. Manage database.

### Package Architecture
In order to maintain high cohesion and high modularity, the classes are grouped into packages by feature. Our second-hand funiture trading app has the following packages:

- com.JHUFurniture.user
- com.JHUFurniture.item
- com.JHUFurniture.loginRegister
- com.JHUFurniture.verification
- com.JHUFurniture.subscribe
- com.JHUFurniture.filterSearch
- com.JHUFurniture.recommendation
- com.JHUFurniture.googleMap
- com.JHUFurniture.facebook

Each package contains all items related to the feature, from user-interface, to Java code, to database items. The details of each package  is as below:

- com.JHUFurniture.user
  * UI pages related to basic user activity like editing user information, displaying user's wishlist, selling list, and etc.
  * User.java - a Model object
  * SellingList.java - a Model object
  * Wishlist.java - a Model object
  * UserController.java - a controller object
  * UserService.java - a service object
  * database items (User, SellingList, Wishlist)
  
 
- com.JHUFurniture.item
  * UI pages related to posting a new item, displaying item information, and etc.
  * Item.java - a Model object
  * ItemController.java - a controller object
  * ItemService.java - a service object
  * database items (Item)
  

- com.JHUFurniture.signin
  * UI pages related to log in, log out
  * SigninRegisterController.java - a controller object
  * SigninRegisterService.java - a service object
  
  
- com.JHUFurniture.Register (use JavaMail, Nexmo/DIY-2FA)
  * UI pages related to registration
  * RegisterController.java 
  * RegisterService.java

- com.JHUFurniture.subscribe (use JavaMail)
  * UI pages related to customize a subscription request
  * Subscribe.java - a Model object
  * SubscribeController.java
  * SubscribeService.java
  * database items (Subscribe)
  * mail.HTML -  HTML framework of the email
   
- com.JHUFurniture.filterSearch
  * UI pages that allows user to select of set of checkboxes and then displays a list of items
  * filterController.java
  * filterService.java

- com.JHUFurniture.recommendation (use machine learning package: Weka)
  * precomputation.java - precompute a table of variables, which will be used by our recommendation alogrithm very  frequently, to avoid wasteful duplication of effort.
  * recommendation.java - contain recommendation algorithms  
<font color="#a50e0e" size = "px"> recommendation system only changes the order we display items. It uses the same UI and DB as them in item package.</font>

- com.JHUFurniture.googleMap (use GoogleMap and MapFragment)
  * UI pages used to integrate google maps in our application in order to show item location on the map, and to calculate the distance between item's location and user's home address
  * mapController.java
  * mapService.java
 
- com.JHUFurniture.facebook (use Facebook4J library)
  * UI page that redirects user to the seller's facebook page

In summary, we decide to use sparkJava as the Java web framework, MySQL for the database in our andriod app. Helper libraries includes 

- Google Gson (JSON)
- JavaMail (email verification and subscription)
- Nexmo/DIY-2FA (phone number verification)
- Google maps (calculate distance between item and user)
- Facebook API
- Weka (recommendation system)

## Part 4 Use cases
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
14. User is redirected to main page, where "Post", "Selling", "Wishlist" buttons are lightened


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
7. Server displays user's personal info. and a "Done" button at the bottom of the page. Here, each element is editable.
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

### User wants to filter/sort items by certain conditions ###
1. User logins susccessfully
2. User navigates to a certain department by clicking the department image/title
3. User navigates to a certain category by clicking the category image/title
4. User clicks the filter button on the top right of the Item-list page
5. User selects constraints to filter/sort results, including Condition, delivery, (if not deliver) distance, start date, end date 
6. The Item-List page will re-order the results

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
6. User clicks "New item" button (or through cliking "Post" botton on the navigation bar on the bottom of each page, directly after step 1.)
7. A "create item" page pops up
8. If user select "no delivery", then page shows up extra fields, letting the seller to edit pick-up location( show the seller's home address as default)
9. User enters detail info. to create a new item
10. Server updates for-sell list, and directs user back to "My sell" list page.
11. Now the user is able to see that the new item has been added 

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

### User wants to subscribe a category###
1. User click the subscribe button on the top-right of item-list page
2. Server display a new page, letting the user to write in a subscribtion email for receiving notifications. 
3. Constraints including category, sub-category, condition, can-you-deliver, notify-me-by have default value. 
4. Once a user subscribe a sub-category with a certain email, new notifications including the item detail will be pushed to this email according to the frequency selected by the user.

## Part 5 JavaDoc 
see attached document: javaDoc
## Part 6. UML class diagram 

![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration2/image/UML.png)

##7. Prototyping code##
###Insturctions###
The android project folder is named "View" and is located at "iteration2/View". Please import the folder into Android Studio and test it.

###Summary###
We have finished a prototype of the registration part in Android Studio. The first page is the email verification page, user can enter his/her email address and then click the "verify" button. Since we have not implemented the actual email verification feature, the page for successful verification will be loaded no matter what the user has entered. After 3 sceonds, the page for phone verification will show up. The phone verification page works similarly to the email verification page. After phone verification, user will be directed to the password setup page. Finally, a "done" page will show up, indicating the registration process is finished. 

###Accomplishment###
1. We have figured out how to navigate from one page to another and how to load a new page with a time counter.
2. We have coded our frontend so it closely (though not exactly)  resembles our UI sketches.

###Goals###
1. We need to implement the email and phone verification features.
2. We need to add a login button on the action bar.


[OOSE_Backend](https://github.com/Firmamenter/OOSE_Backend)
