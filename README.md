## DictionaryAPI

Turkish <-> English Dictionary API. Translations are retrieved from the websites *Tureng* and *Zargan*.

**How to use:**
```java
SozlukAPI tureng = new TurengAPI();
SozlukAPI zargan = new ZarganAPI();

// input can be in Turkish or English
ArrayList<Result> results = tureng.translate("pay out");

for (Result result : results)
	System.out.println( result );

System.out.println();

// input can be in Turkish or English
results = zargan.translate("geri götürmek");

for (Result result : results)
	System.out.println( result );
```

**Output:**
```
en-tr:	pay out -> (General, v.) acısını çıkarmak
en-tr:	pay out -> (General, v.) ödemek (parayı)
en-tr:	pay out -> (General, v.) harcamak
en-tr:	pay out -> (General, v.) gevşetmek (ip/zincir vb'ni)
en-tr:	pay out -> (General, v.) ödemek
en-tr:	pay out -> (General, v.) acısını çıkartmak
en-tr:	pay out -> (Trade/Economic, -) ödemek
en-tr:	pay out -> (Marine, -) kaloma etmek
en-tr:	pay out of pocket -> (General, v.) cebinden ödemek
en-tr:	pay out of pocket -> (General, v.) cepten ödemek
en-tr:	pay out of pocket -> (General, v.) kendi cebinden ödemek
en-tr:	you should figure out a way to pay him his money -> (Speaking, -) ona, parasını ödemenin bir yolunu bulmalısın
en-tr:	constant pay out ratio -> (Trade/Economic, -) sabit oranda kar payı dağıtımı
en-tr:	pay-out ratio money -> (Trade/Economic, -) pay başına karın bir yüzdesi oranında dağıtılan kar payı
en-tr:	mustering-out pay -> (Military, -) terhis tahsisatı

tr-en:	geri götürmek -> (-, Fiil) to carry back
tr-en:	geri geri götürmek -> (-, Fiil) to back up
tr-en:	yabancı ülkelerdeki yatırımlardan elde edilen kazançları kendi memleketine geri götürmek -> (-, Fiil) to repatriate earnings from foreign investments
tr-en:	sermayeyi kendi memleketine geri götürmek -> (-, Fiil) to repatriate capital
tr-en:	otomobili geri geri götürmek -> (-, Fiil) to back a car
```

*Data sources:*
* *http://tureng.com/*
* *http://www2.zargan.com/*
