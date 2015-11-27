CREATE TABLE AccessType (
	ID INTEGER PRIMARY KEY,
	AddProduct BOOLEAN, /* can add product */
	ViewProduct BOOLEAN,  /* only can view product */
	AdminControl BOOLEAN
);

CREATE TABLE Districts (
	ID INTEGER PRIMARY KEY, /* ID of the district */
	Name VARCHAR(150), /* Name of the district */	
);

CREATE TABLE UserInfo (
	ID INTEGER PRIMARY KEY,
	TypeID INTEGER REFERENCES AccessType(ID), /* access type of the user */
	Email VARCHAR(100) NOT NULL, /* email of the user */
	FirstName VARCHAR(60) NOT NULL, /* first name */
	LastName VARCHAR(60) NOT NULL,	/* last name */
	PhoneNumber VARCHAR(20) NOT NULL, /* Phone number */
	Address VARCHAR(250) NOT NULL, /* general address field for the user */
	DistID REFERENCES Districts(ID) NOT NULL, /* id of the home district */
	Gender VARCHAR(30),
	DateOfBirth DATE,
	Photo BLOB	
);

/* To store crop information */
CREATE TABLE CropsInfo (
	ID INTEGER PRIMARY KEY, /* id of crop */
	CatID INTEGER REFERENCES CropCategory(ID), /* leaf category id */
	Name VARCHAR(150) NOT NULL, /* name of the crop */
);

/* Category tree of the crop */
CREATE TABLE CropCategory (
	ID INTEGER PRIMARY KEY, /* id of the crop */
	ParentID INTEGER REFERENCES CropCategory(ID), /* parent category id */
	ChildID INTEGER REFERENCES CropCategory(ID), /* child category id */
	Name VARCHAR(150) NOT NULL, /* name of the category */
	Details VARCHAR(450), /* short information if necessary */
);

/* product information */
CREATE TABLE ProductInfo (
	ID INTEGER PRIMARY KEY, /* id of the product */
	Name VARCHAR(230) NOT NULL,  /* name of the product */
	Details VARCHAR(450), /* short information about the product */
	CropID INTEGER REFERENCES CropsInfo(ID), /* id of the crop */
	UserID INTEGER REFERENCES UserInfo(ID), /* id of the user posted */
	Picture BLOB, /* picture of the product */
	MfDate DATE, /* date of manufacturing */
	ExpDate DATE, /* date of expiration */
	PriceMin LONG, /* Minimum of the price */
	PriceMax LONG /* Maximum of the price */	
);

CREATE TABLE RateInfo (	
    ID INTEGER PRIMARY KEY, /* id of the rating */
	ProdID INTEGER REFERENCES ProductInfo(ID), /* id of the product which has been rated */
	Rating INTEGER CHECK(Rating BETWEEN 1 AND 5), /* Rating in scale of 5 */	
);