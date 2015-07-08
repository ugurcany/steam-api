## DictionaryAPI

Java API for bidirectional Turkish <-> English dictionary

*en-tr* and *tr-en* translations are retrieved from the websites [*Tureng*](http://tureng.com/) and [*Zargan*](http://www2.zargan.com/).

*en-en* definitions are retrieved from [*Babylon*](http://www.babylon.com/).

**How to use:**
```java
DictionaryAPI tureng = new TurengAPI();
// input can be in Turkish or English
Results results = tureng.translate("spit out");
results.print();

DictionaryAPI zargan = new ZarganAPI();
// input can be in Turkish or English
results = zargan.translate("geri götürmek");
results.print();

BabylonAPI babylon = new BabylonAPI();
// input can only be in English
results = babylon.getDefinitionOf("get on");
results.print();
```

**Output:**
```
=============Tureng=============
en-tr:	spit out -> (General, v.) söylemek
en-tr:	spit out -> (General, v.) tükürmek
en-tr:	spit out thick wads of phlegm -> (General, v.) balgam çıkarmak
en-tr:	spit it out! -> (Colloquial) haydi söylesene!
en-tr:	get chewed up and spit out -> (Idioms) kullanılmak
en-tr:	get chewed up and spit out -> (Idioms) heba edilmek
en-tr:	get chewed up and spit out -> (Idioms) bozuk para gibi harcanmak
en-tr:	spit it out! -> (Speaking) çıkar ağzındaki baklayı
en-tr:	spit (out) one's dummy -> (British Slang) öfke nöbetine girmek
en-tr:	spit (out) one's dummy -> (British Slang) kendinden geçmek
en-tr:	spit (out) one's dummy -> (British Slang) kriz geçirmek
=============Tureng=============
=============Zargan=============
tr-en:	geri götürmek -> (Fiil) to carry back
tr-en:	geri geri götürmek -> (Fiil) to back up
tr-en:	yabancı ülkelerdeki yatırımlardan elde edilen kazançları kendi memleketine geri götürmek -> (Fiil) to repatriate earnings from foreign investments
tr-en:	sermayeyi kendi memleketine geri götürmek -> (Fiil) to repatriate capital
tr-en:	otomobili geri geri götürmek -> (Fiil) to back a car
=============Zargan=============
=============Babylon=============
en-en:	Get on -> embark; enter a bus or train or plane (e.g. "She got on the bus about 40 minutes ago")
en-en:	Get on -> proceed, advance; succeed, manage well; agree with
=============Babylon=============
```
