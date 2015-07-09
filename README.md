## SteamAPI - {under development}

Java API for [*Steam*](http://store.steampowered.com/), the online gaming platform

**How to use:**
```java
SteamAPI steam = new SteamAPI();
Games games = steam.searchGame("company of heroes");
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
=============<317850>=============
title: Company of Heroes 2 - Ardennes Assault
price: 59,00 TL
platforms: [win]
review summary: Mixed (66% of the 3 user reviews for this game are positive.)
added on: 17 Nov, 2014
image url: http://cdn.akamai.steamstatic.com/steam/apps/317850/capsule_sm_120.jpg?t=1436461290
=============<317850>=============
=============<260309>=============
title: Company of Heroes 2 - The Western Front Armies
platforms: [win]
added on: 23 Jun, 2014
image url: http://cdn.akamai.steamstatic.com/steam/apps/260309/capsule_sm_120.jpg?t=1436461300
=============<260309>=============
=============<4560,9340,20540>=============
title: Company of Heroes Complete Pack
price: 59,00 TL
platforms: [win]
review summary: Overwhelmingly Positive (95% of the 4,010 user reviews for this game are positive.)
added on: 13 Oct, 2009
image url: http://cdn.akamai.steamstatic.com/steam/subs/1529/capsule_sm_120.jpg?t=1355881757
=============<4560,9340,20540>=============
=============<231480,249082,249088>=============
title: Company of Heroes 2 - Victory at Stalingrad Bundle
price: 21,00 TL
platforms: [win]
review summary: Positive (86% of the 45 user reviews for this game are positive.)
added on: 12 Nov, 2013
image url: http://cdn.akamai.steamstatic.com/steam/subs/34424/capsule_sm_120.jpg?t=1414599464
=============<231480,249082,249088>=============
=============<231473,231481,231482>=============
title: Company of Heroes 2 - Soviet Skin: Four Color Belorussian Front Pack
price: 11,00 TL
platforms: [win]
review summary: Positive (100% of the 1 user reviews for this game are positive.)
added on: 27 Aug, 2013
image url: http://cdn.akamai.steamstatic.com/steam/subs/31102/capsule_sm_120.jpg?t=1417745824
=============<231473,231481,231482>=============
=============<231479,249081,249085,260301>=============
title: Company of Heroes 2 - Case Blue Bundle
price: 21,00 TL
platforms: [win]
review summary: Mostly Positive (75% of the 69 user reviews for this game are positive.)
added on: 7 Nov, 2013
image url: http://cdn.akamai.steamstatic.com/steam/subs/34423/capsule_sm_120.jpg?t=1414599466
=============<231479,249081,249085,260301>=============
=============<287371,287370>=============
title: Company of Heroes 2 - The Western Front Armies
price: 31,00 TL
platforms: [win]
review summary: Negative (0% of the 3 user reviews for this game are positive.)
added on: 23 Jun, 2014
image url: http://cdn.akamai.steamstatic.com/steam/subs/40569/capsule_sm_120.jpg?t=1436327190
=============<287371,287370>=============
=============<231477,231484,231485>=============
title: Company of Heroes 2 - German Skin: Four Color Disruptive Pattern Bundle
price: 11,00 TL
platforms: [win]
review summary: Mostly Negative (25% of the 4 user reviews for this game are positive.)
added on: 6 Aug, 2013
image url: http://cdn.akamai.steamstatic.com/steam/subs/29851/capsule_sm_120.jpg?t=1417817058
=============<231477,231484,231485>=============
=============<231470,231471,231475,231476>=============
title: Company of Heroes 2 - Heavy Bundle DLC
price: 10,00 TL
platforms: [win]
review summary: Negative (0% of the 4 user reviews for this game are positive.)
added on: 23 Jul, 2013
image url: http://cdn.akamai.steamstatic.com/steam/subs/29380/capsule_sm_120.jpg?t=1374598842
=============<231470,231471,231475,231476>=============
=============<323230>=============
title: Company of Heroes 2 - Ardennes Assault: Fox Company Rangers
price: 10,00 TL
platforms: [win]
review summary: Negative (0% of the 1 user reviews for this game are positive.)
added on: 17 Nov, 2014
image url: http://cdn.akamai.steamstatic.com/steam/apps/323230/capsule_sm_120.jpg?t=1436461270
=============<323230>=============
=============<9300>=============
title: Company of Heroes Singleplayer Demo
price: Free Demo
platforms: [win]
review summary: Mostly Positive (75% of the 8 user reviews for this game are positive.)
added on: 17 Jul, 2007
image url: http://cdn.akamai.steamstatic.com/steam/apps/9300/capsule_sm_120.jpg?t=0
=============<9300>=============
=============<260290>=============
title: Company of Heroes 2 - Southern Fronts Mission Pack
price: 10,00 TL
platforms: [win]
review summary: Positive (89% of the 28 user reviews for this game are positive.)
added on: 9 Dec, 2013
image url: http://cdn.akamai.steamstatic.com/steam/apps/260290/capsule_sm_120.jpg?t=1436461229
=============<260290>=============
=============<231480>=============
title: Company of Heroes 2 - Victory at Stalingrad Mission Pack
price: 18,00 TL
platforms: [win]
review summary: Positive (94% of the 17 user reviews for this game are positive.)
added on: 12 Nov, 2013
image url: http://cdn.akamai.steamstatic.com/steam/apps/231480/capsule_sm_120.jpg?t=1436461239
=============<231480>=============
=============<231479>=============
title: Company of Heroes 2 - Case Blue Mission Pack
price: 18,00 TL
platforms: [win]
review summary: Mostly Positive (70% of the 40 user reviews for this game are positive.)
added on: 24 Sep, 2013
image url: http://cdn.akamai.steamstatic.com/steam/apps/231479/capsule_sm_120.jpg?t=1436461261
=============<231479>=============
=============<12480>=============
title: 9th Company: Roots Of Terror
price: 18,00 TL
platforms: [win]
review summary: Mixed (53% of the 89 user reviews for this game are positive.)
added on: 3 Dec, 2009
image url: http://cdn.akamai.steamstatic.com/steam/apps/12480/capsule_sm_120.jpg?t=1381431887
=============<12480>=============
=============<11480>=============
title: Soldiers: Heroes of World War II
price: 10,00 TL
platforms: [win]
review summary: Mostly Positive (78% of the 99 user reviews for this game are positive.)
added on: 3 Jul, 2014
image url: http://cdn.akamai.steamstatic.com/steam/apps/11480/capsule_sm_120.jpg?t=1404820473
=============<11480>=============
=============<204860>=============
title: Men of War: Condemned Heroes
price: 18,00 TL
platforms: [win]
review summary: Mixed (60% of the 115 user reviews for this game are positive.)
added on: 12 Apr, 2012
image url: http://cdn.akamai.steamstatic.com/steam/apps/204860/capsule_sm_120.jpg?t=1410270681
=============<204860>=============
=============<64000>=============
title: Men of War: Assault Squad
price: 18,00 TL
platforms: [win]
review summary: Very Positive (91% of the 1,689 user reviews for this game are positive.)
added on: 24 Feb, 2011
image url: http://cdn.akamai.steamstatic.com/steam/apps/64000/capsule_sm_120.jpg?t=1396958668
=============<64000>=============
=============<215160>=============
title: The Book of Unwritten Tales
price: 31,00 TL
platforms: [win, mac, linux, steamplay]
review summary: Very Positive (91% of the 849 user reviews for this game are positive.)
added on: 31 Jul, 2012
image url: http://cdn.akamai.steamstatic.com/steam/apps/215160/capsule_sm_120.jpg?t=1424391754
=============<215160>=============
=============<203350>=============
title: King's Bounty: Warriors of the North
price: 24,00 TL
platforms: [win, mac, steamplay]
review summary: Very Positive (83% of the 402 user reviews for this game are positive.)
added on: 25 Oct, 2012
image url: http://cdn.akamai.steamstatic.com/steam/apps/203350/capsule_sm_120.jpg?t=1396547100
=============<203350>=============
```
