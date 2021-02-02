# projekt
* container **string name** **int empty_weight** **int max_net_load** **string cargo**
  * refrigerated food/medicine (reefer) **int[2] temperature range**
    * 20' standard, 2710 kg, 27770 kg, packaged food, chemicals, medicine, [-30C, 30C]
    * 40' standard, 4330 kg, 29670 kg, packaged food, chemicals, medicine, [-30C, 30C]
    * 40' high cube, 4620 kg, 29380 kg, packaged food, chemicals, medicine, [-35C, 30C]
    * 45' super freezer, 4850 kg, 27650 kg, food, chemicals, medicine, [-60C, 30C]
      * frozen tuna -60C
      * vaccines -60C
    * CA (controlled atmosphere) **int[2] oxygen range** **int[2] co2 range**
      * 40' CA, 4330 kg, 29670 kg, fresh fruit, fresh vegetables, [-30C, 30C], [2%, 21%], [2%, 12%]
  * insulated for bananas or dry ice storage, special insulation from external conditions (salt, humidity etc) **float thermal conductivity**
    * 20' standard, 2200 kg, 27800 kg, fishing bait, furniture, paper goods, electronics, 0,035 W/(m*K)
    * 40' standard, 3801 kg, 26200 kg, fishing bait, furniture, paper goods, electronics, 0,035 W/(m*K)
    * 40' high cube, 3900 kg, 26580 kg, fishing bait, furniture, paper goods, electronics, 0,035 W/(m*K)
  * bulk with lining or removable internal walls for lose cargo (bulk). typically bulk cargo is shipped as 'dry bulk', but not always **string loading solution**
    * 20' containertip, 3550 kg, 28000 kg, grain/salt/sand/ore/coal, lid
    * 20' flex top, 3560 kg, 28000 kg, grain/salt/sand, retractable lid
    * 20' open top, 3130 kg, 28055 kg, ore/coal open top
  * tank **int capacity**
    * 20' T1, 3600 kg, 32400 kg, wine/juice, 25000L
    * 40' T1, 6200 kg, 43600 kg, wine/juice, 44500L
    * 20' T4, 11315 kg, 23685 kg, non-hazardous edible/non-edible oils, 20000L
    * 20' T11, 3500 kg, 30500 kg, non-hazardous chemicals, 26000L
    * 20' T14, 3500 kg, 30500 kg, hazardous chemicals/acids, 26000L
    * 20' T50, 4500 kg, 29500 kg, LPG, ammonia, 24500L
    * 20' T75, 11600 kg, 22400 kg, cryogenic liquids, 20000L
  * dry bulk **string name** **int empty_weight** **int net_load** **string cargo type**
    * 20' standard, 2180 kg, 28300 kg, coal/packaged goods/etc. dry bulk
    * 40' standard, 2630 kg, 28870 kg, coal/packaged goods/etc. dry bulk
    * 40' high cube, 3810 kg, 28690 kg, coal/packaged goods/etc. dry bulk
    * 45' high cube, 4850 kg, 27650 kg, coal/packaged goods/etc.dry bulk
    * 20' open top, 2250 kg, 30480 kg, tires, construction prefabricated elements, oversized cargo
    * 40' open top, 3810 kg, 26670 kg, tires, construction prefabricated elements, oversized cargo
    * 40' open top high cube, 3940 kg, 32500 kg, tires, construction prefabricated elements, oversized cargo
    * 20' flatrack, 2500 kg, 21500 kg, vehicles, tanks, large items
    * 40' flatrack, 4200 kg, 40800 kg, vehicles, tanks, large items
