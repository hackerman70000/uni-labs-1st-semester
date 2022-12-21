APRO1, semestr 22Z, Bartłomiej ,nr albumu 324911, grupa 102, godz. 14:15

**Sprawozdanie z laboratorium nr 10**

1.
a) W przypadku poprawnego wczytania pliku wykonają się wszystkie instrunkcje w bloku "try", natomiast zostaną pominięte instrukcje w bloku "catch". Kod w klauzuli "finally" zostanie wykonany zawsze, bez względu na to czy wyjątek zostanie zgłoszony, czy nie. W tym bloku zagnieżdżona jest kolejna instrukcja "try-catch", w której plik zostanie zamknięty. 
Kolejność wykonania : blok "try" --> blok "finally" --> (wewn blku finally) br.close()

b) W przypadku błędnego wczytania pliku wykonają się wszystkie instrunkcje w bloku "try" do momentu wychwycenia błędu, i uruchomione zostaną instrukcje w bloku "catch". Kod w klauzuli "finally" zostanie wykonany (zawsze). W tym bloku zagnieżdżona jest kolejna instrukcja "try-catch", w której plik ma być zamknięty. W przypadku wychwycenia błędu uruchomiona zotanie metoda "e.printStackTrace();" służąca do diagnozowania błędów.

2.
Zastosowanie bloku "try with resources" zapewia zamknięcie zasobu.

3.


4.

