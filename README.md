## SteamAPI - {under development}

Java API for [*Steam*](http://store.steampowered.com/), the online gaming platform

**How to use:**
```java
SteamAPI steam = new SteamAPI();

String gameTitle = "depth";
int upperLimit = 5; // upper limit for the number of search results
SearchMode searchMode = SearchMode.RELEVANCE; // see "SearchMode.java" for other search modes
Games games = steam.searchGame(gameTitle, upperLimit, searchMode);

games.printAll();
```

**Output:**
```
=============<274940>=============
title: Depth
price: 39,00 TL
discounted price: 13,26 TL (-66%)
platforms: [win]
review summary: Very Positive (87% of the 3,967 user reviews for this game are positive.)
added on: 3 Nov, 2014
image url: http://cdn.akamai.steamstatic.com/steam/apps/274940/capsule_sm_120.jpg?t=1436473512
=============<274940>=============
=============<248530>=============
title: Depth Hunter 2: Deep Dive
price: 24,00 TL
discounted price: 10,80 TL (-55%)
platforms: [win]
review summary: Mostly Positive (71% of the 313 user reviews for this game are positive.)
added on: 20 Aug, 2014
image url: http://cdn.akamai.steamstatic.com/steam/apps/248530/capsule_sm_120.jpg?t=1428076528
=============<248530>=============
=============<570>=============
title: Dota 2
price: Free To Play
platforms: [win, mac, linux, steamplay]
review summary: Very Positive (93% of the 399,130 user reviews for this game are positive.)
added on: 9 Jul, 2013
image url: http://cdn.akamai.steamstatic.com/steam/apps/570/capsule_sm_120.jpg?t=1434653483
=============<570>=============
=============<346110>=============
title: ARK: Survival Evolved
price: 49,00 TL
platforms: [win, mac, linux, steamplay]
review summary: Mostly Positive (73% of the 19,874 user reviews for this game are positive.)
added on: 2 Jun, 2015
image url: http://cdn.akamai.steamstatic.com/steam/apps/346110/capsule_sm_120.jpg?t=1436434436
=============<346110>=============
=============<292030>=============
title: The Witcher® 3: Wild Hunt
price: 89,00 TL
platforms: [win]
review summary: Very Positive (93% of the 16,025 user reviews for this game are positive.)
added on: 18 May, 2015
image url: http://cdn.akamai.steamstatic.com/steam/apps/292030/capsule_sm_120.jpg?t=1436350247
=============<292030>=============
```
