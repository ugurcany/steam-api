# steam-api

Java library to search and retrieve game data from [*Steam*](http://store.steampowered.com/), the online gaming platform

**How to use:**
```java
SteamAPI steam = new SteamAPI(CountryCode.TR, Language.TURKISH);

String gameTitle = "warhammer";
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
=============<id: 4580>=============
title: Warhammer® 40,000: Dawn of War® - Dark Crusade
price: 21,00 TL
discounted price: 5,25 TL (-75%)
platforms: [win]
review summary: Büyük Çoğunlukla Olumlu (Bu oyun için yazılan 938 adet kullanıcı incelemesinden 96% tanesi olumlu.)
added on: 7 Ağu 2007
thumbnail url: http://cdn.akamai.steamstatic.com/steam/apps/4580/capsule_sm_120.jpg?t=1436547594
=============<id: 4580>=============
=============<id: 9450>=============
title: Warhammer® 40,000: Dawn of War® - Soulstorm
price: 21,00 TL
discounted price: 5,25 TL (-75%)
platforms: [win]
review summary: Büyük Çoğunlukla Olumlu (Bu oyun için yazılan 1,389 adet kullanıcı incelemesinden 95% tanesi olumlu.)
added on: 5 Mar 2008
thumbnail url: http://cdn.akamai.steamstatic.com/steam/apps/9450/capsule_sm_120.jpg?t=1435965517
=============<id: 9450>=============
=============<id: 4570>=============
title: Warhammer® 40,000: Dawn of War® - Game of the Year Edition
price: 31,00 TL
discounted price: 7,75 TL (-75%)
platforms: [win]
review summary: Çok Olumlu (Bu oyun için yazılan 1,046 adet kullanıcı incelemesinden 93% tanesi olumlu.)
added on: 7 Ağu 2007
thumbnail url: http://cdn.akamai.steamstatic.com/steam/apps/4570/capsule_sm_120.jpg?t=1436200161
=============<id: 4570>=============
=============<id: 9310>=============
title: Warhammer® 40,000: Dawn Of War® – Winter Assault
price: 31,00 TL
discounted price: 7,75 TL (-75%)
platforms: [win]
review summary: Çok Olumlu (Bu oyun için yazılan 173 adet kullanıcı incelemesinden 91% tanesi olumlu.)
added on: 7 Ağu 2007
thumbnail url: http://cdn.akamai.steamstatic.com/steam/apps/9310/capsule_sm_120.jpg?t=1435939270
=============<id: 9310>=============
=============<id: 15620>=============
title: Warhammer® 40,000™: Dawn of War® II
price: 31,00 TL
platforms: [win]
review summary: Çok Olumlu (Bu oyun için yazılan 2,724 adet kullanıcı incelemesinden 90% tanesi olumlu.)
added on: 18 Şub 2009
thumbnail url: http://cdn.akamai.steamstatic.com/steam/apps/15620/capsule_sm_120.jpg?t=1436309031
=============<id: 15620>=============

=============<id: 4580>=============
title: Warhammer® 40,000: Dawn of War® - Dark Crusade
price: 21,00 TL
discounted price: 5,25 TL (-75%)
platforms: [win]
review summary: Büyük Çoğunlukla Olumlu (Bu oyun için yazılan 938 adet kullanıcı incelemesinden 96% tanesi olumlu.)
added on: 7 Ağu 2007
thumbnail url: http://cdn.akamai.steamstatic.com/steam/apps/4580/capsule_sm_120.jpg?t=1436547594
description: Kronus’un merkezindeki çölün derinliklerinde, kemik dizili tüneller ve mezar odalarından oluşan bal peteği şekilli dev bir mekân uyanmakta olan Necron belasına ev sahipliği yapıyor. Uzun yıllar önce bu yerler, Necron'ların yok ettiği ırkların kemiklerini koymak için yapılmış büyük bir nekropolün bulvarları ve meydanlarıydı.
header image url: http://cdn.akamai.steamstatic.com/steam/apps/4580/header.jpg?t=1436547594
screenshot urls: [https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/4580/ss_c65e3bf992a4ef8c97fa4745a781d70d8a3f821d.1920x1080.jpg?t=1436547594, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/4580/ss_fe02d9beb54fbc09d3f1f794c4b7fc0c9738e4b3.1920x1080.jpg?t=1436547594, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/4580/ss_a0cbf10e02036ba868c96be7e7a36dd309df7724.1920x1080.jpg?t=1436547594, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/4580/ss_769dea41dc85d1f7dbbfc7ab161c56bb367647af.1920x1080.jpg?t=1436547594, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/4580/ss_e868a3b6c330645949c938bc0663f412546d3dfc.1920x1080.jpg?t=1436547594, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/4580/ss_44767dafcd49d50a288508f492a68f620513fc9d.1920x1080.jpg?t=1436547594, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/4580/ss_d22f99de050d5d69b728c8bf18b8eeda8df3865a.1920x1080.jpg?t=1436547594, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/4580/ss_c9a9104e71a36a84d1b31937694be11d14c61d35.1920x1080.jpg?t=1436547594, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/4580/ss_cf4056ced5f921547dc7fbd4ef38f3a8fc3316c3.1920x1080.jpg?t=1436547594, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/4580/ss_a1e2e90e1f44ac977cd23b422f57ae7ff71590e3.1920x1080.jpg?t=1436547594]
release date: 9 Eki 2006
metascore: 87/100
details: [Tek Oyunculu, Çok Oyunculu, Steam Cloud]
tags: [Strateji, Warhammer 40K, GZS, Bilim-Kurgu, Çokoyunculu, Base-Building, Tek Oyunculu, Games Workshop, Klasik, Gerçek Zamanlı, Aksiyon, Atmosferik]
=============<id: 4580>=============
```
