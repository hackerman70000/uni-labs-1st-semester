APRO1, semestr 22Z,Bartłomiej , nr albumu 324911, grupa 102, godz. 14:15

**Sprawozdanie z laboratorium nr 8**

1. Rozkład wartości powinien być podzielony dla dwóch zmiennych stosunkowo 2 : 1, im więcej wywołań prawdopodobieństwa tym ten stosunek jest dokładniejszy.

2. Zastosowanie tablicy nie jest konieczne i jest nieoptymalne. Można w zamian zastosować kolejke. 

3. Za każdym razem wywoływane są wartości bardzo zbliżone do innych wywołań. Klasa biblioteczna polecana do uzyskania liczb pseudolosowych to ThreadLocalRandom. Jej wywołanie zajmuje mniej czasu w środowiskach wspólbieżnych. Klasa ta bierze pod uwagę wątki, ponieważ wszystkie wątki w klasie Random mają wspólny seed (do generowania wartości), co jest przyczyną słabszej dyspozycji tej klasy w porównaniu do ThreadLocalRandom jeśli chodzi o aplikacje wielowątkowe.

4. Pogorszenie czasu wstawiania w celu polepszenia czasu wyszukiwania pasuje do wyszukiwarek, katalogów. 


