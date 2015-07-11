## SteamAPI - {under development}

Java API for [*Steam*](http://store.steampowered.com/), the online gaming platform

**How to use:**
```java
SteamAPI steam = new SteamAPI();

String gameTitle = "depth";
int upperLimit = 5; // upper limit for the number of search results to be retrieved
SearchMode searchMode = SearchMode.RELEVANCE; // see "SearchMode.java" for other search modes

// search games
Games games = steam.searchGame(gameTitle, upperLimit, searchMode);
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
price: 39,00 TL
discounted price: 13,26 TL (-66%)
platforms: [win]
review summary: Very Positive (86% of the 4,371 user reviews for this game are positive.)
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
review summary: Very Positive (93% of the 399,456 user reviews for this game are positive.)
added on: 9 Jul, 2013
image url: http://cdn.akamai.steamstatic.com/steam/apps/570/capsule_sm_120.jpg?t=1434653483
=============<570>=============
=============<346110>=============
title: ARK: Survival Evolved
price: 49,00 TL
platforms: [win, mac, linux, steamplay]
review summary: Mostly Positive (73% of the 20,051 user reviews for this game are positive.)
added on: 2 Jun, 2015
image url: http://cdn.akamai.steamstatic.com/steam/apps/346110/capsule_sm_120.jpg?t=1436434436
=============<346110>=============
=============<292030>=============
title: The Witcher® 3: Wild Hunt
price: 89,00 TL
platforms: [win]
review summary: Very Positive (93% of the 16,084 user reviews for this game are positive.)
added on: 18 May, 2015
image url: http://cdn.akamai.steamstatic.com/steam/apps/292030/capsule_sm_120.jpg?t=1436350247
=============<292030>=============
=============<274940-extra>=============
description: Play as a shark or a diver in a dark aquatic world and overcome your enemies by employing cunning, teamwork, and stealth. Depth blends tension and visceral action as you team up against AI or be matched with other players in heart pounding combat.
header image url: http://cdn.akamai.steamstatic.com/steam/apps/274940/header.jpg?t=1436473512
release date: 3 Nov, 2014
metascore: 65/100
details: [Single-player, Multi-player, Steam Achievements, Full controller support, Steam Trading Cards, Captions available, Steam Cloud, Valve Anti-Cheat enabled, Stats, Steam Leaderboards, Includes level editor]
tags: [Action, Multiplayer, Gore, Team-Based, Horror, Survival, Underwater, PvP, FPS, Shooter, Co-op, Indie, Atmospheric, Hunting, Simulation, First-Person, Survival Horror, Exploration, Adventure, Singleplayer]
=============<274940-extra>=============
```
