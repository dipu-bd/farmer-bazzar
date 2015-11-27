/* district data in bangladesh */
CREATE TABLE District (
	ID INTEGER PRIMARY KEY, /* ID of the district */
	Name VARCHAR(150) /* Name of the district */	
);

/* user data */
CREATE TABLE PersonInfo (
	ID INTEGER PRIMARY KEY, 
	ModAccess INTEGER CHECK(ModAccess BETWEEN 0 AND 1), /* access type of the user */
	Email VARCHAR(100) NOT NULL, /* email of the user */
	Password VARCHAR(25) NOT NULL, /* password */
	FirstName VARCHAR(60) NOT NULL, /* first name */
	LastName VARCHAR(60) NOT NULL,	/* last name */
	PhoneNumber VARCHAR(20) NOT NULL, /* Phone number */	
	Address VARCHAR(250) NOT NULL, /* general address field for the user */
	DistID REFERENCES District(ID) NOT NULL, /* id of the home district */			
	DateOfBirth DATE,	
	Graphic BLOB
);

/* Category tree of the crop */
CREATE TABLE CropCategory (
	ID INTEGER PRIMARY KEY, /* id of the crop */
	CatID INTEGER, /* id of the category */
	ParentID INTEGER REFERENCES CropCategory(ID), /* parent category id */
	ChildID INTEGER REFERENCES CropCategory(ID), /* child category id */
	Name VARCHAR(150) NOT NULL, /* name of the category */
	Details VARCHAR(450) /* short information if necessary */
);

/* To store crop information */
CREATE TABLE CropInfo (
	ID INTEGER PRIMARY KEY, /* id of crop */
	CatID INTEGER, /* leaf category id */
	Name VARCHAR(150) NOT NULL /* name of the crop */
);

/* product information */
CREATE TABLE ProductInfo (
	ID INTEGER PRIMARY KEY, /* id of the product */
	ProdID INTEGER, /* id of the product */
	Name VARCHAR(230) NOT NULL,  /* name of the product */
	Details VARCHAR(450), /* short information about the product */	
	CropID INTEGER, /* id of the crop */
	UserID INTEGER REFERENCES PersonInfo(ID), /* id of the user posted */
	DistID REFERENCES District(ID) NOT NULL, /* id of the home district */	
	MfDate DATE, /* date of manufacturing */
	ExpDate DATE, /* date of expiration */
	Price LONG, /* Minimum of the price */	
	Graphic BLOB /* picture of the product */
);

/* rate of a user */
CREATE TABLE RateInfo (	
    ID INTEGER PRIMARY KEY, /* id of the rating */
	ProdID INTEGER, /* id of the product which has been rated */
	UserID INTEGER,
	Rating INTEGER CHECK(Rating BETWEEN 1 AND 5) /* Rating in scale of 5 */	
);