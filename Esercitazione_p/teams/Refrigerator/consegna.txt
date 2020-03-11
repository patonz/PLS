/*
Creare un programma in grado di gestire una spesa in modo automatico, andando a riempire un frigorifero virtuale
 - un frigorifero ha la capienza minima di 3 ripiani da 4 elementi + 1 da 5 elementi SOLO congelatore.
 - ogni elemento acquistato surgelato, DEVE essere riposto nel congelatore
 - un elemento ha come minimo nome, data di scadenza, surgelato (si/no)
        *per semplicità, la data viene espressa con un numero intero --> 11/03/2020  20200311 (anno-mese-giorno)*

Il programma deve caricare una serie di elementi di base, e dare la possibilità di caricarne una lista (la nostra spesa) da tastiera

Il programma deve prevedere un modo per buttare via gli elementi scaduti, operazione che viene fatta subito prima di caricare la nostra spesa personale

Stampare a video tutti gli elementi divisi per ripiano, incluso il congelatore.



EXPERT ZONE:
il frigorifero ha diversi scomparti, prevederne uno per le bottiglie, ortaggi, lunga conservazione o freschi.
il tipo di elemento definisce la priorità di collocamento nel frigorifero:
     una bottiglia può essere riposta nei classici ripiani ma predilige lo sportello apposito
*/