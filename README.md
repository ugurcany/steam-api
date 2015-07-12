## SteamAPI - {under development}

A Java library to search and retrieve game info from [*Steam*](http://store.steampowered.com/), the online gaming platform

**How to use:**
```java
SteamAPI steam = new SteamAPI(CountryCode.US);

String gameTitle = "depth";
int numOfResults = 5; // upper limit for the number of games to be retrieved
SearchMode searchMode = SearchMode.RELEVANCE; // see "SearchMode.java" for other search modes

// search the Steam game store
Games games = steam.searchStore(gameTitle, numOfResults, searchMode);
games.printAll();

// retrieve extra info about a game
Game game = games.get(0);
String gameId = game.getId();
GameExtra gameExtra = steam.retrieveExtraInfo(gameId);
System.out.print(gameExtra);
```

**Output:**
```
=============<274940>=============
title: Depth
price: $24.99
discounted price: $8.49 (-66%)
platforms: [win]
review summary: Very Positive (85% of the 4,556 user reviews for this game are positive.)
added on: Nov 3, 2014
image url: http://cdn.akamai.steamstatic.com/steam/apps/274940/capsule_sm_120.jpg?t=1436473512
=============<274940>=============
=============<248530>=============
title: Depth Hunter 2: Deep Dive
price: $14.99
discounted price: $6.74 (-55%)
platforms: [win]
review summary: Mostly Positive (71% of the 313 user reviews for this game are positive.)
added on: Aug 20, 2014
image url: http://cdn.akamai.steamstatic.com/steam/apps/248530/capsule_sm_120.jpg?t=1428076528
=============<248530>=============
=============<570>=============
title: Dota 2
price: Free To Play
platforms: [win, mac, linux, steamplay]
review summary: Very Positive (93% of the 399,557 user reviews for this game are positive.)
added on: Jul 9, 2013
image url: http://cdn.akamai.steamstatic.com/steam/apps/570/capsule_sm_120.jpg?t=1434653483
=============<570>=============
=============<346110>=============
title: ARK: Survival Evolved
price: $29.99
platforms: [win, mac, linux, steamplay]
review summary: Mostly Positive (73% of the 20,110 user reviews for this game are positive.)
added on: Jun 2, 2015
image url: http://cdn.akamai.steamstatic.com/steam/apps/346110/capsule_sm_120.jpg?t=1436434436
=============<346110>=============
=============<292030>=============
title: The Witcher® 3: Wild Hunt
price: $59.99
platforms: [win]
review summary: Very Positive (93% of the 16,122 user reviews for this game are positive.)
added on: May 18, 2015
image url: http://cdn.akamai.steamstatic.com/steam/apps/292030/capsule_sm_120.jpg?t=1436350247
=============<292030>=============
=============<274940-extra>=============
description: Play as a shark or a diver in a dark aquatic world and overcome your enemies by employing cunning, teamwork, and stealth. Depth blends tension and visceral action as you team up against AI or be matched with other players in heart pounding combat.
header image url: http://cdn.akamai.steamstatic.com/steam/apps/274940/header.jpg?t=1436473512
screenshot urls: [https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/274940/ss_8e2c7052961b6dcb3752574312de80bb71c3695c.1920x1080.jpg?t=1436473512, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/274940/ss_4c4113da58c2c855d9988761ac0b9befd1e78352.1920x1080.jpg?t=1436473512, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/274940/ss_f2adf96fc2cd8e873b258f097a0f18a6a2f56c30.1920x1080.jpg?t=1436473512, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/274940/ss_dd061bece34c3180550c5ba8a4034da0eb3768ab.1920x1080.jpg?t=1436473512, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/274940/ss_fdbc8dab732bf3dff623cff24828699196ebccab.1920x1080.jpg?t=1436473512, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/274940/ss_038576f82c199a780929cb2cf7ad554f316cb1ee.1920x1080.jpg?t=1436473512, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/274940/ss_8e03762eef68bb02d3aef0a59ed761018140e117.1920x1080.jpg?t=1436473512, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/274940/ss_9b5f173c796cf3ea6ed5282b4aab05d976bca76c.1920x1080.jpg?t=1436473512, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/274940/ss_dd810a298a5955d1e9a9c7379e958c9ea90f981e.1920x1080.jpg?t=1436473512, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/274940/ss_acd21d321a28d705524ae0e2f5ff420dd16a7f97.1920x1080.jpg?t=1436473512, https://steamcommunity.com/linkfilter/?url=http://cdn.akamai.steamstatic.com/steam/apps/274940/ss_3579b6b41fa4a39bad4242394b6a8849111e8689.1920x1080.jpg?t=1436473512]
release date: Nov 3, 2014
metascore: 65/100
details: [Single-player, Multi-player, Steam Achievements, Full controller support, Steam Trading Cards, Captions available, Steam Cloud, Valve Anti-Cheat enabled, Stats, Steam Leaderboards, Includes level editor]
tags: [Action, Multiplayer, Gore, Team-Based, Horror, Survival, Underwater, PvP, FPS, Shooter, Co-op, Indie, Atmospheric, Hunting, Simulation, First-Person, Survival Horror, Exploration, Adventure, Singleplayer]
=============<274940-extra>=============
```
