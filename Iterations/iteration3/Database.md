#Database Specification
##Part 1. E-R diagram

![](https://github.com/jhu-oose/2016-group-16/blob/master/iteration3/E_R_Diagram.jpg)

##Part 2. schema

	DROP TABLE UserDetail;
	CREATE TABLE UserDetail(
	   userId        INTEGER PRIMARY KEY     NOT NULL,
	   contactId	   INTEGER			 NOT NULL,
	   userName      VARCHAR(20) NOT NULL,
	   FOREIGN KEY (userId) REFERENCES UserLogin(userId)
	   FOREIGN KEY (contactId) REFERENCES ContactId(contactId)
	);
	
	DROP TABLE UserLogin;
	CREATE TABLE UserLogin(
		userId INTEGER PRIMARY KEY AUTOINCREMENT,
	  password    VARCHAR(50)   NOT NULL,
		email  VARCHAR(100)  NOT NULL
	);
	
	DROP TABLE ContactInfo;
	CREATE TABLE ContactInfo(
	   contactId   INTEGER PRIMARY KEY AUTOINCREMENT,
	   email       VARCHAR(100)  NOT NULL,
	   phone	     VARCHAR(13)	 NOT NULL,
	   address     VARCHAR(100)  NOT NULL,
	   zipCode		 VARCHAR(20)   NOT NULL
	);
	
	DROP TABLE Item;
	CREATE TABLE Item(
	    itemId          INTEGER PRIMARY KEY AUTOINCREMENT,
	    sellerId        INT                   NOT NULL,
	    name            VARCHAR(100)          NOT NULL,
	    description     TEXT,
	    imgPath         VARCHAR(100),
	    postDate        DATETIME,
	    avialableDate   DATETIME,
	    expireDate      DATETIME,
	    price           REAL CHECK(price > 0) NOT NULL,
	    category1       VARCHAR(20)           NOT NULL,
	    category2       VARCHAR(20)           NOT NULL,
	    isDeliver       BOOLEAN               NOT NULL,
	    condition       VARCHAR(10)           NOT NULL,
	    pickUpAddress   VARCHAR(100),
	    numOflikes      INT CHECK(numOflikes > 0)
	);
	
	DROP TABLE SellingList;
	CREATE TABLE SellingList(
		userId INT NOT NULL,
		itemId INT NOT NULL,
		CONSTRAINT pk_user_item  PRIMARY KEY(userId, itemId),
		FOREIGN KEY (userId) REFERENCES UserDetail(userId),
		FOREIGN KEY (itemId) REFERENCES Item(itemId)
	);
	
	DROP TABLE WishList;
	CREATE TABLE WishList(
		userId INT NOT NULL,
		itemId INT NOT NULL,
		CONSTRAINT pk_user_item PRIMARY KEY(userId, itemid),
		FOREIGN KEY (userId) REFERENCES UserDetail(userId),
		FOREIGN KEY (itemId) REFERENCES Item(itemId)
	);
	
	DROP TABLE Category;
	CREATE TABLE Category(
	  categoryId INTEGER PRIMARY KEY AUTOINCREMENT,
	  categoryName VARCHAR(50),
	  parentId INT NOT NULL,
	  FOREIGN KEY (parentId) REFERENCES Category(categoryId)
	);
	
	DROP TABLE Subscribe;
	CREATE TABLE Subscribe(
	  subscribeId INTEGER PRIMARY KEY AUTOINCREMENT,
	  userId INT NOT NULL,
	  sellerId INT NOT NULL,
	  category1 VARCHAR(50),
	  category2 VARCHAR(50),
	  FOREIGN KEY (userId) REFERENCES UserDetail(userId),
	  FOREIGN KEY (sellerId) REFERENCES UserDetail(userId)
	);


##Part 3. Test Data

### UserLogin Table
	INSERT INTO UserLogin (userId,  password, email)
	VALUES (1, "11111111", "123@jhu.edu");
	
	INSERT INTO UserLogin (userId,  password, email)
	VALUES (2, "22222222", "dchen78@jhu.edu");
	
	INSERT INTO UserLogin (userId,  password, email)
	VALUES (3, "33333333", "ywang289@jhu.edu");
	
	INSERT INTO UserLogin (userId,  password, email)
	VALUES (4, "11111111", "bwang57@jhu.edu");
