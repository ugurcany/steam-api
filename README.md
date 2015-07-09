## DictionaryAPI

Java API for Turkish <-> English, English -> English, and Turkish -> Turkish dictionary

* `en-tr` and `tr-en` translations are retrieved from [*Tureng*](http://tureng.com/) and [*Zargan*](http://www2.zargan.com/).
* `en-en` definitions are retrieved from [*Babylon*](http://www.babylon.com/).
* `tr-tr` definitions are retrieved from [*Sozluk.Net*](http://www.sozluk.net/).

**How to use:**
```java
BilingualDictAPI tureng = new TurengAPI();
// input can be in Turkish or English
Results results = tureng.translate("spit out");
results.print();

BilingualDictAPI zargan = new ZarganAPI();
// input can be in Turkish or English
results = zargan.translate("geri götürmek");
results.print();

MonolingualDictAPI babylon = new BabylonAPI();
// input can only be in English
results = babylon.getDefinitionOf("get on");
results.print();

MonolingualDictAPI sozlukNet = new SozlukNetAPI();
// input can only be in Turkish
results = sozlukNet.getDefinitionOf("süzmek");
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
en-en:	Get on -> embark
en-en:	Get on -> enter a bus or train or plane (e.g. "She got on the bus about 40 minutes ago")
en-en:	Get on -> proceed, advance
en-en:	Get on -> succeed, manage well
en-en:	Get on -> agree with
=============Babylon=============
=============SozlukNet=============
tr-tr:	süzmek -> Bir siviyi, içindeki kati maddelerden ayirmak için bez veya delikli bir kaptan geçirmek
tr-tr:	süzmek -> Bazi sivilarin yogunlaşmasina yol açan, kati ve tortulu maddeleri bu sivilardan ayirmak
tr-tr:	süzmek -> Gözle, inceleyerek, dikkatle bakmak
tr-tr:	süzmek -> (göz için) baygın ve anlamlı bakmak
=============SozlukNet=============
```
