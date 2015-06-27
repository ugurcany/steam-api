## TurengAPI

Turkish <-> English Dictionary

*Data source: http://tureng.com/*

**How to use:**
```java
TurengAPI tureng = new TurengAPI();

// input can be in Turkish or English
ArrayList<Result> results = tureng.translate("hava durumu");

for (Result result : results)
	System.out.println( result );
```

**Output:**
```
hava durumu -> (Common Usage, n.) weather
hava durumu -> (General, n.) weather forecast
hava durumu -> (General, n.) weather condition
hava durumu -> (Technical, -) weather condition
hava durumu -> (Computer, -) weather
hava durumu -> (Aeronautic, -) air conditions
hava durumu -> (Meteorology, -) weather condition
hava durumu (hava tahmini) -> (General, n.) weather forecast
hava durumu haritalarý -> (General, n.) weather map
hava durumu programý sunan kimse -> (General, n.) forecastman
hava durumu radarý -> (General, n.) weather radar
hava durumu sözlüðü -> (General, n.) weather dictionary
hava durumu sunucusu -> (General, n.) weather man
hava durumu sunucusu -> (General, n.) weather reporter
hava durumu sunucusu -> (General, n.) weathergirl
hava durumu sunucusu -> (General, n.) weather presenter
hava durumu tahlili -> (General, n.) weather analysis
hava durumu tahmini -> (General, n.) weather forecasting
öngörülemeyen hava (durumu) -> (General, n.) unpredictable weather
yerel hava durumu -> (General, n.) local weather forecast
hava durumu göstergeci -> (Technical, -) weatherglass
maddenin durumu hava, sývý, gaz gibi -> (Technical, -) state of matter
sinoptik hava durumu -> (Technical, -) synoptic situation
sinoptik hava durumu haritasý -> (Technical, -) synoptic weather chart
sinoptik hava durumu haritasý -> (Technical, -) synoptic chart
önemli hava durumu bilgisi -> (Aeronautic, -) sigmet information
önemli hava durumu bilgisi -> (Aeronautic, -) sigmet information
orta burun eti içerisinde hava bulunmasý durumu -> (Medical, -) concha bullosa
görülmemiþ hava durumu -> (Environment, -) unusual weather
sayýsal hava durumu tahmini -> (Environment, -) numerical weather prediction
cephe hava durumu -> (Meteorology, -) frontal weather
hava durumu sunucusu -> (Meteorology, -) weatherman
hava durumu sunucusu -> (Meteorology, -) weather forecaster
radyo ile hava durumu yardýmý -> (Meteorology, -) radio weather aids
uçulabilecek en kötü hava durumu -> (Meteorology, -) weather minimum
hava akýný haber verme ve ikaz durumu -> (Military, -) air raid warning condition
hava alarm durumu -> (Military, -) air alert
hava savunma hazýrlýk durumu -> (Military, -) air defence readiness
hava savunma topçusu ateþ kontrol durumu -> (Military, -) anti-aircraft control condition
hava savunma topçusu hazýrlýk durumu -> (Military, -) air defence artillery condition of readiness
```
