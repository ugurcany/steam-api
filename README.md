## SozlukAPI

Turkish <-> English Dictionary API. Translations are retrieved from the websites *Tureng* and *Zargan*.

**How to use:**
```java
SozlukAPI tureng = new TurengAPI();
SozlukAPI zargan = new ZarganAPI();

// input can be in Turkish or English
ArrayList<Result> results = tureng.translate("ÇOLUK ÇOCUK");

for (Result result : results)
	System.out.println( result );

System.out.println();

// input can be in Turkish or English
results = zargan.translate("ÇOLUK ÇOCUK");

for (Result result : results)
	System.out.println( result );
```

**Output:**
```
tr-en:	çoluk çocuk -> (General, n.) fry
tr-en:	çoluk çocuk -> (General, n.) brood
tr-en:	çoluk çocuk -> (General, n.) family
tr-en:	çoluk çocuk -> (General, n.) wife and children
tr-en:	çoluk çocuk -> (General, n.) children
tr-en:	çoluk çocuk -> (General, n.) offspring
tr-en:	çoluk çocuk -> (General, adv.) all the family
tr-en:	çoluk çocuk sahibi -> (General, n.) having a family
tr-en:	çocuk çoluk -> (Idioms, -) the small fry

tr-en:	çoluk çocuk -> (, -) household
tr-en:	çoluk çocuk -> (, -) home- folks
tr-en:	çoluk çocuk -> (, -) family
tr-en:	çoluk çocuk -> (, -) descent
```

*Data sources:*
* *http://tureng.com/*
* *http://www2.zargan.com/*
