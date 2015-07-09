## SteamAPI - {under development}

Java API for [*Steam*](http://store.steampowered.com/), the online gaming platform

**How to use:**
```java
SteamAPI steam = new SteamAPI();
Games games = steam.searchGame("company of heroes", 5);
// inputs are "game title" and "upper limit for the number of search results"
games.printAll();
```

**Output:**
```
=============<365820>=============
title: Company of Heroes 2 - The British Forces
price: 21,00 TL
discounted price: 18,90 TL (-10%)
platforms: [win]
added on: 3 Sep, 2015
image url: http://cdn.akamai.steamstatic.com/steam/apps/365820/capsule_sm_120.jpg?t=1436461308
=============<365820>=============
=============<20540>=============
title: Company of Heroes: Tales of Valor
price: 31,00 TL
platforms: [win]
review summary: Overwhelmingly Positive (95% of the 835 user reviews for this game are positive.)
added on: 9 Apr, 2009
image url: http://cdn.akamai.steamstatic.com/steam/apps/20540/capsule_sm_120.jpg?t=1436461359
=============<20540>=============
=============<231430>=============
title: Company of Heroes 2
price: 59,00 TL
platforms: [win]
review summary: Mostly Positive (79% of the 17,820 user reviews for this game are positive.)
added on: 25 Jun, 2013
image url: http://cdn.akamai.steamstatic.com/steam/apps/231430/capsule_sm_120.jpg?t=1436467696
=============<231430>=============
=============<4560>=============
title: Company of Heroes
price: 18,00 TL
platforms: [win]
review summary: Overwhelmingly Positive (96% of the 2,824 user reviews for this game are positive.)
added on: 17 Jul, 2007
image url: http://cdn.akamai.steamstatic.com/steam/apps/4560/capsule_sm_120.jpg?t=1436461368
=============<4560>=============
=============<9340>=============
title: Company of Heroes: Opposing Fronts
price: 31,00 TL
platforms: [win]
review summary: Very Positive (93% of the 343 user reviews for this game are positive.)
added on: 27 Sep, 2007
image url: http://cdn.akamai.steamstatic.com/steam/apps/9340/capsule_sm_120.jpg?t=1436461343
=============<9340>=============
```
