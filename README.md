## steam-api

A Java library to search and retrieve game data from [*Steam*](http://store.steampowered.com/), the online gaming platform

**How to use:**
```java
SteamAPI steam = new SteamAPI(CountryCode.TR, Language.TURKISH);

String gameTitle = "dishonored";
int numOfResults = 5; // upper limit for the number of games to be retrieved
SearchMode searchMode = SearchMode.RELEVANCE; // see "SearchMode.java" for other search modes

// search for games
Games games = steam.searchForGames(gameTitle, numOfResults, searchMode);
games.printAll();

System.out.println();

// retrieve game data
Game game = games.get(0);
steam.fillWithDetails(game);
System.out.println(game);
```

**Output:**
```
=============<id: 205100>=============
title: Dishonored
price: 31,00 TL
platforms: [win]
review summary: Büyük Çoğunlukla Olumlu (Bu oyun için yazılan 17,830 adet kullanıcı incelemesinden 97% tanesi olumlu.)
added on: 11 Eki 2012
image url: http://cdn.akamai.steamstatic.com/steam/apps/205100/capsule_sm_120.jpg?t=1416967454
=============<id: 205100>=============
=============<id: 205100,208570,208575,212893,212894>=============
title: Dishonored - Game of the Year Edition
price: 49,00 TL
platforms: [win]
review summary: Büyük Çoğunlukla Olumlu (Bu oyun için yazılan 18,018 adet kullanıcı incelemesinden 97% tanesi olumlu.)
added on: 10 Eki 2013
image url: http://cdn.akamai.steamstatic.com/steam/subs/31292/capsule_sm_120.jpg?t=1405639074
=============<id: 205100,208570,208575,212893,212894>=============
=============<id: 6850>=============
title: Hitman 2: Silent Assassin
price: 13,00 TL
platforms: [win]
review summary: Çok Olumlu (Bu oyun için yazılan 605 adet kullanıcı incelemesinden 88% tanesi olumlu.)
added on: 15 Mar 2007
image url: http://cdn.akamai.steamstatic.com/steam/apps/6850/capsule_sm_120.jpg?t=1424688723
=============<id: 6850>=============
=============<id: 50620>=============
title: Darksiders™
price: 31,00 TL
platforms: [win]
review summary: Çok Olumlu (Bu oyun için yazılan 4,990 adet kullanıcı incelemesinden 90% tanesi olumlu.)
added on: 23 Eyl 2010
image url: http://cdn.akamai.steamstatic.com/steam/apps/50620/capsule_sm_120.jpg?t=1391776766
=============<id: 50620>=============
=============<id: 212894>=============
title: Dishonored: The Brigmore Witches
price: 18,00 TL
platforms: [win]
review summary: Çok Olumlu (Bu oyun için yazılan 57 adet kullanıcı incelemesinden 94% tanesi olumlu.)
added on: 13 Ağu 2013
image url: http://cdn.akamai.steamstatic.com/steam/apps/212894/capsule_sm_120.jpg?t=1381766370
=============<id: 212894>=============

=============<id: 205100>=============
title: Dishonored
price: 31,00 TL
platforms: [win]
review summary: Büyük Çoğunlukla Olumlu (Bu oyun için yazılan 17,830 adet kullanıcı incelemesinden 97% tanesi olumlu.)
added on: 11 Eki 2012
image url: http://cdn.akamai.steamstatic.com/steam/apps/205100/capsule_sm_120.jpg?t=1416967454
description: Dishonored is an immersive first-person action game that casts you as a supernatural assassin driven by revenge. With Dishonored’s flexible combat system, creatively eliminate your targets as you combine the supernatural abilities, weapons and unusual gadgets at your disposal.
header image url: http://cdn.akamai.steamstatic.com/steam/apps/205100/header.jpg?t=1416967454
screenshot urls: [https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/205100/ss_409bb8591d4c8278815510d9be737b57dfc57e06.1920x1080.jpg?t=1416967454, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/205100/ss_32d76a6ff4b216410b90ff2cdb7107a28a1baed2.1920x1080.jpg?t=1416967454, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/205100/ss_fd7613fa1b8f19674cc0b4cd53db39c9618641fd.1920x1080.jpg?t=1416967454, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/205100/ss_8d26f4f83fb598eed36bdb0c6ecb41962a64ccf7.1920x1080.jpg?t=1416967454, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/205100/ss_e6f960fda9132baa23aca305359064dbc1b6f507.1920x1080.jpg?t=1416967454, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/205100/ss_30e0328295a5d208283e69eb382fac2fa94809a8.1920x1080.jpg?t=1416967454]
release date: 11 Eki 2012
metascore: 91/100
details: [Tek Oyunculu, Steam Başarımları, Oyun Kumandası Desteği, Steam Cloud]
tags: [Gizlilik, Steampunk, Aksiyon, Birinci Şahıs, Suikastçi, Atmosferik, Tek Oyunculu, Macera, Zengin Hikâye, Birden Fazla Son, Karanlık, Dystopian, Sihir, FPS, RYO, Replay Value, Fantezi, Açık Dünya, shooter, Bilim-Kurgu]
=============<id: 205100>=============
```
