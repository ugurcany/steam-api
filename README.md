## DictionaryAPI

Java API for Turkish <-> English, English -> English, and Turkish -> Turkish dictionary

* `en-tr` and `tr-en` translations are retrieved from [*Tureng*](http://tureng.com/) and [*Zargan*](http://www2.zargan.com/).
* `en-en` definitions are retrieved from [*Sozluk.Net*](http://www.sozluk.net/) and [*Babylon*](http://www.babylon.com/).
* `tr-tr` definitions are retrieved from [*Sozluk.Net*](http://www.sozluk.net/).

**How to use:**
```java
BilingualDictAPI tureng = new TurengAPI();
// input can be in Turkish or English
Results results = tureng.translate("spit out");
results.print();

BilingualDictAPI zargan = new ZarganAPI();
// input can be in Turkish or English
results = zargan.translate("süpürmek");
results.print();

MonolingualDictAPI sozlukNet = new SozlukNetAPI();
// input can be in Turkish or English
results = sozlukNet.getDefinitionOf("pay");
results.print();

MonolingualDictAPI babylon = new BabylonAPI();
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
tr-en:	süpürmek -> (Fiil) to sweep
tr-en:	süpürmek -> (Fiil) to brush
tr-en:	hafif hafif süpürmek -> (Fiil) to whisk
tr-en:	yukarıdan aşağıya doğru süpürmek -> (Fiil) to sweep down
tr-en:	silip süpürmek -> (Fiil) to sweep
tr-en:	bütün işleri süpürmek -> (Fiil) to make a clean sweep of it
tr-en:	silip süpürmek -> (Fiil) to mop up profits
tr-en:	silip süpürmek -> (Fiil) to mop up
=============Zargan=============
=============SozlukNet=============
en-en:	Pay -> (v. t.) To cover, as bottom of a vessel, a seam, a spar, etc., with tar or pitch, or waterproof composition of tallow, resin, etc.; to smear.
en-en:	Pay -> (v. t.) To satisfy, or content; specifically, to satisfy (another person) for service rendered, property delivered, etc.; to discharge one's obligation to; to make due return to; to compensate; to remunerate; to recompense; to requite; as, to pay workmen or servants.
en-en:	Pay -> (v. t.) Hence, figuratively: To compensate justly; to requite according to merit; to reward; to punish; to retort or retaliate upon.
en-en:	Pay -> (v. t.) To discharge, as a debt, demand, or obligation, by giving or doing what is due or required; to deliver the amount or value of to the person to whom it is owing; to discharge a debt by delivering (money owed).
en-en:	Pay -> (v. t.) To discharge or fulfill, as a duy; to perform or render duty, as that which has been promised.
en-en:	Pay -> (v. t.) To give or offer, without an implied obligation; as, to pay attention; to pay a visit.
en-en:	Pay -> (v. i.) To give a recompense; to make payment, requital, or satisfaction; to discharge a debt.
en-en:	Pay -> (v. i.) Hence, to make or secure suitable return for expense or trouble; to be remunerative or profitable; to be worth the effort or pains required; as, it will pay to ride; it will pay to wait; politeness always pays.
en-en:	Pay -> (n.) Satisfaction; content.
en-en:	Pay -> (n.) An equivalent or return for money due, goods purchased, or services performed; salary or wages for work or service; compensation; recompense; payment; hire; as, the pay of a clerk; the pay of a soldier.
tr-tr:	pay -> Birden fazla kişi arasinda bölüşülmüş bir bütünden, bu kişilerin her birine düşen bölüm, hisse
tr-tr:	pay -> Eşit bölüm
tr-tr:	pay -> Bayagi kesirlerden birinin eşit parçalardan kaç tane alindigini gösteren sayi: paydanin üstüne yazilarak yatik bir çizgi ile ondan ayrılır
=============SozlukNet=============
=============Babylon=============
en-en:	Get on -> embark
en-en:	Get on -> enter a bus or train or plane (e.g. "She got on the bus about 40 minutes ago")
en-en:	Get on -> proceed, advance
en-en:	Get on -> succeed, manage well
en-en:	Get on -> agree with
=============Babylon=============
```
