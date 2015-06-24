## TurengAPI - Turkish <-> English Dictionary API in Java

How to use:
```java
TurengAPI tureng = new TurengAPI();

// input can be in Turkish or English
ArrayList<Result> results = tureng.translate("warehouse");

for (Result result : results)
  System.out.println( result.toString() );
```

Output:
```
Common Usage -> (n.) ardiye
Common Usage -> (n.) antrepo
Common Usage -> (n.) toptan satış yeri
Common Usage -> (n.) depo
Common Usage -> (n.) ambar
General -> (v.) -i depolamak
General -> (v.) ambarlamak
General -> (v.) depolamak
General -> (v.) depoya koymak
General -> (v.) ambara koymak
General -> (n.) ardiye
General -> (n.) gereç ambarı
General -> (n.) depo
General -> (n.) antrepo
General -> (n.) toptan satış yeri
General -> (n.) büyük mağaza
General -> (n.) ambar
Slang -> (-) aşırı kalabalık hapishane
Trade/Economic -> (-) antrepo
Trade/Economic -> (-) depo
Trade/Economic -> (-) büyük mağaza
Trade/Economic -> (-) depolamak
Trade/Economic -> (-) ambar
Trade/Economic -> (-) ardiye
Trade/Economic -> (-) umumi mağaza
Trade/Economic -> (-) depo ardiye ambar
Trade/Economic -> (-) depoya yerleştirmek
Trade/Economic -> (-) mağazalamak
Technical -> (-) dağıtılmadan önce malların toplandığı bina
Textile -> (-) depo
```
