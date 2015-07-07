## SozlukAPI

Turkish <-> English Dictionary API. Translations are retrieved from the websites *Tureng* and *Zargan*.

**How to use:**
```java
SozlukAPI tureng = new TurengAPI();
SozlukAPI zargan = new ZarganAPI();

// input can be in Turkish or English
ArrayList<Result> results = tureng.translate("LIVE ON");

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
en-tr:	live on -> (General, v.) geçimini sürdürmek
en-tr:	live on -> (General, v.) yaþamýný idame ettirmek
en-tr:	live on -> (General, v.) ile beslenmek
en-tr:	live on -> (General, v.) ile geçinmek
en-tr:	live on -> (General, v.) geçinmek
en-tr:	live on a very small amount of money -> (General, v.) çok az bir parayla geçinmek
en-tr:	live on borrowed money -> (General, v.) borç yemek
en-tr:	live on one's nerves -> (General, v.) diken üstünde olmak
en-tr:	live on someone else -> (General, v.) haraç yemek
en-tr:	live on the border of -> (General, v.) 'nýn sýnýrýnda yaþamak
en-tr:	live on the edge -> (General, v.) uçlarda yaþamak
en-tr:	live on the edge -> (General, v.) hayatý uçlarda yaþamak
en-tr:	live on the margins of society -> (General, v.) toplumun sýnýrlarýnda/kýyýsýnda yaþamak
en-tr:	live on the razor's edge -> (General, v.) ölümle kalým arasýnda olmak
en-tr:	live on the razor's edge -> (General, v.) iki ateþ arasýnda kalmak
en-tr:	live high on the hog -> (Colloquial, -) para içinde yüzmek
en-tr:	live high on the hog -> (Colloquial, -) lüks içinde yaþamak
en-tr:	live on one's own -> (Colloquial, -) tek baþýna yaþamak
en-tr:	live high on the hog -> (Idioms, -) þatafatlý bir hayat sürmek
en-tr:	live high on the hog -> (Idioms, -) çok rahat bir yaþam sürmek
en-tr:	live high on the hog -> (Idioms, -) çok zengin olmak
en-tr:	live high on the hog -> (Idioms, -) bir eli yaðda bir eli balda olmak
en-tr:	live high on the hog -> (Idioms, -) para içinde yüzmek
en-tr:	live high on the hog -> (Idioms, -) har vurup harman savurmak
en-tr:	live on a borrowed time -> (Idioms, -) günleri sayýlý olmak
en-tr:	live on an amount of money -> (Idioms, -) belli bir parayla hayatýný idame ettirmek
en-tr:	live on an amount of money -> (Idioms, -) belirli miktar parayla yaþamak
en-tr:	live on borrowed time -> (Idioms, -) az zamaný kalmýþ olmak
en-tr:	live on borrowed time -> (Idioms, -) bir gözü topraða bakmak
en-tr:	live on borrowed time -> (Idioms, -) ölmekte olmak
en-tr:	live on borrowed time -> (Idioms, -) sayýlý günleri kalmak
en-tr:	live on borrowed time -> (Idioms, -) bir ayaðý mezarda olmak
en-tr:	live on borrowed time -> (Idioms, -) cabadan yaþamak
en-tr:	live on one's nerves -> (Idioms, -) heyecanlý bir karaktere sahip olmak
en-tr:	live on one's own -> (Idioms, -) (genelde ekonomik özgürlüðünü kazanýp) kendi baþýna yaþamak
en-tr:	live on one's wits -> (Idioms, -) zekasý sayesinde yaþamýný sürdürmek
en-tr:	live on the breadline -> (Idioms, -) aþýrý yoksul olmak
en-tr:	live on the breadline -> (Idioms, -) açlýk sýnýrýnda yaþamak
en-tr:	live on the edge -> (Idioms, -) tehlikeli yaþamak
en-tr:	live on the fat of the land -> (Idioms, -) yediði önünde yemediði arkasýnda olmak
en-tr:	live on the fat of the land -> (Idioms, -) tuzu kuru olmak
en-tr:	live on the fat of the land -> (Idioms, -) çok iyi durumda olmak
en-tr:	live on the fat of the land -> (Idioms, -) her þeyin en iyisi ile geçinmek
en-tr:	live on the fat of the land -> (Idioms, -) bolluk bereket içinde yaþamak
en-tr:	live on the fat of the land -> (Idioms, -) rahat bir yaþam sürmek
en-tr:	which/what floor do you live on? -> (Speaking, -) evin kaçýncý katta?
en-tr:	which/what floor do you live on? -> (Speaking, -) kaçýncý katta oturuyorsunuz?
en-tr:	which/what floor do you live on? -> (Speaking, -) kaçýncý katta yaþýyorsunuz?
en-tr:	which/what floor do you live on? -> (Speaking, -) kaçýncý katta oturuyorsun?
en-tr:	which/what floor do you live on? -> (Speaking, -) kaçýncý katta yaþýyorsun?
en-tr:	which/what floor do you live on? -> (Speaking, -) eviniz kaçýncý katta?
en-tr:	live on something -> (Aeronautic, -) ile yaþamak
en-tr:	live on something -> (Aeronautic, -) ile geçinmek
en-tr:	live on something -> (Aeronautic, -) ile beslenmek

tr-en:	çoluk çocuk -> (-, -) household
tr-en:	çoluk çocuk -> (-, -) home- folks
tr-en:	çoluk çocuk -> (-, -) family
tr-en:	çoluk çocuk -> (-, -) descent
```

*Data sources:*
* *http://tureng.com/*
* *http://www2.zargan.com/*
