# java-snake

0. Używać namespace'ów
1. Snake: kierunki na enumach
2. Snake: zamiana x,y na point. 
3. Snake: zamiana stałej tablicy na dynamiczną listę. 
4. Snake: move() -> SnakeMover
5. Game: rebnamt to GameFrane
6. Food: x,y -> position
7. Losowanie nowej pozycji jabłka - zamiast losowania "na ślepo", tworzymy w locie listę wszystkich punktów z board'a, ale nie wstawiamy do tej listy tych punktów gdzie jest wąż. Na końcu wybiera,y losowo jeden z tych punktów
8. Board: draw porozbijać na: drawFood, drawSnake, drawEndGame
9. Board: wyciągnąc logikę gry do innej klasy (np. Game)
10. Wszystkie stałe wartości zamienić na konfigurowalne i dynamiczne
