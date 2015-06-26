## TurengAPI - Turkish <-> English Dictionary

*Data source: http://tureng.com/*

**How to use:**
```java
TurengAPI tureng = new TurengAPI();

// input can be in Turkish or English
ArrayList<Result> results = tureng.translate("hava durumu");

for (Result result : results) {
	System.out.println( result.getCategory() + " -> " + "(" + result.getType() + ") " +  result.getTranslation() );
	// or System.out.println( result );
}
```

**Output:**
```
Common Usage -> (n.) weather
General -> (n.) weather forecast
General -> (n.) weather condition
Technical -> (-) weather condition
Computer -> (-) weather
Aeronautic -> (-) air conditions
Meteorology -> (-) weather condition
```
