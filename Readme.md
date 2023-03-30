 
# Fontamenti di Informatica
## - esercizi d'esame -


## Gennaio 2023

### Esercizio 1 [risolto]
Scrivere un programma di tipo client server composto da tre nodi.<br/>
NODO 1: Client;<br />
NODO 2: Client+server;<br />
NODO 3: SERVER.<br />
Il nodo1 deve inviare al server del nodo2 tre interi distinti e per ogni messaggio inviato ricevera' una notifica di avvenuta ricezione.
Il server del nodo2 calcolera' la media dei tre valori ricevuti che tramite il client del nodo2 verra' inviata al server del nodo3 che segnalera' la sua avvenuta ricezione.

### Esercizio 2 [risolto]
Scrivere un programma che crei una lista di oggetti.
Inserire in tale lista (come input da tastiera) tre oggetti distinti della classe libro che contengano le seguenti variabili: titolo del libro, autore e anno di pubblicazione.
Una volta inseriti i tre oggetti, stampare a video solo il titolo del libro e l'anno di pubblicazione di tutti e tre gli oggetti inseriti ordinati in modo crescente per anno di pubblicazione.

### Esercizio 3
Domanda di carattere teorico: Collection Frameworks.<br />
Accesso a una Collection tramite un iterator.<br />
Includere degli esempi.

#################


## Novembre 2022

### Esercizio 1 [risolto]
data una lista non ordinata di un numero indefinito di elementi di tipo intero scrivere un programma che  ordini tale lista secondo l'algoritmo "selection sort". Al termine dell'ordinamento il programma deve restituire a video:<br />
A) il numero di elementi della lista<br/>
B) l'indice dell'elemento della lista con valore massimo (ovvero uno degli indici possibili se esistono più elementi con lo stesso valore)<br/>
C) l'indice dell'elemento della lista con valore minimo (ovvero uni degli indici possibili se esistono più elementi con lo stesso calore)<br/>
D) il numero dei passi compiuti dall'algoritmo per terminare<br/>


### Esercizio 2 [risolto]
scrivere un programma che permetta all'utente di inserire tre oggetti della classe animale.<br/>
Tale classe deve avere i seguenti membri: nome_scientifico, nome_comune, eta, peso.<br/>
il programma deve permettere di visualizzare i dati degli oggetti animale a vide secondo le seguenti scelte:<br/>
a) nome_scientifico decrescente<br/>
b) nome_comune crescente<br/>
c)peso crescente o decrescente


### Esercizio 3
GENERIC: definizione, l'uso, le limitazioni, la sicurezza di tipo.<br/>
spiegare l'uso do carattere jolly. includere degli esempi

#################


## Ottobre 2022

### Esercizio 1 [risolto]
Scrivere un programma che effettui le seguenti operazioni:<br/>
somma dei valori contenuti in un HashMap<br/>
Calcolo della media dei valori contenuti in una HashMap<br/>
Restituire il valore massimo delle chiavi HashMap.<br/>
Tali operazioni dovranno essere eseguite da una classe denominata “GenericHashMap” che faccia uso del costrutto Generic.<br/> 
Le HashMap gestite da tale classe dovranno essere del tipo HashMap<Integer,Integer>, HashMap<Integer,Long>, HashMap<Integer,Double>, HashMap<Integer,Float>

### Esercizio 2
Scrivere un programma che permetta di inserire tre oggetti della classe Studente. Tale classe deve avere i seguenti membri: Nome, Matricola, Eta’, lista esami sostenuti con relativo voto (uno o piu’ elementi). Il programma deve permettere di visualizzare i dati degli oggetti studenti a video secondo le seguenti scelte:<br/>
a) Matricola decrescente<br/>
b) Eta’ crescente<br/>
c) Media degli esami più alta

### Esercizio 3 [risolto]
Scrivere un programma che crei un file di testo ad accesso sequenziale. <br/>
Scrivere nel file (come input da tastiera) nome e cognome di tre persone, chiudere il file. Aprire il file in lettura e stampare a video solo i cognomi salvati nel file.



## Aprile 2022
### Esercizio 1 [risolto]
Scrivere un programma che implementi un server che risponde sulla porta: 3333 e un client.<br/>
Il client deve richiedere al server un numero randomico.<br/>
Il server ogni volta che riceverà una richiesta da un client stamperà a video una stringa composta dall’ip e porta del client che ha fatto la richiesta ed il numero randomico inviato.<br/>
il client stamperà a video il messaggio di benvenuto ricevuto dal server contenente il valore randomico generato.

### Esercizio 2
Scrivere un programma che crei un HashSet di oggetti.<br/>
Inserire in tale Collection (come input da tastiera) n (dove il numero n e’ scelto dall’utente) oggetti distinti della classe Film che contengano le seguenti variabili:<br/>
titolo del film, regista e anno di pubblicazione.<br/>
Una volta inseriti gli n oggetti stampare a video, partendo dall Collection istanziata, solo il titolo del film e l’anno di pubblicazione di tutti gli n oggetto inseriti ordinati per titolo in ordine alfabetico.

### Esercizio 3
Scrivere un programma che accetti in ingresso un numero compreso tra 734 e 57892 e verifichi se il numero inserito e’ o meni un numero primo


## ESAME  (non ho riferimenti temporali)

### Esercizio 1 [risolto]
Scrivere un programma che generi in maniera randomica 1500 numeri interi compresi tra 0 e 100.<br/>
Tali numeri devono essere inclusi in una Collection di tipo HashSet.<br/>
Una volta completato tale compito il programma deve suddividere questi 1500 numeri in due liste, una di numeri pari ordinata in maniera crescente ed una di numeri dispari ordinata in maniera decrescente. Da tali liste devono essere eliminati i numeri ripetuti.<br/>
Completata tale suddivisione devono essere stampati a video sia l'insieme originale (HashSet) che le due liste ottenute.

### Esercizio 2
Scrivere un programma che permetta di gestire una biblioteca. tale programma deve poter far eseguire all'utente bibliotecario, da menu, le seguenti funzioni:<br/>
a) inserimento di un libro, che abbiamo almeno le seguenti variabili: titolo del libro, autore e anno di pubblicazione,  codice identificativo univoco,in una struttura dati di tipo Collection a scelta del programmatore<br/>
b) visualizzazione dei libri inseriti in ordine cronologico di inserimento<br/>
c) modifica dei dati di un libro presente nella struttura dati<br/>
d) eliminazione di un libro dalla collection.

### Esercizio 3 [risolto]
Scrivere un programma che implementi un server ed un client. <br/>
Il client deve richiedere sulla porta "3456" la data corrente al server.<br/>
Il server ogni volta che riceverà una richiesta da un client stamperà a video l'ip di chi ha fatto la richiesta. Il client stamperà a video il messaggio di benvenuto e la data ricevuti dal server.


#################

## Dicembre 2021
### Esercizio 1
Scrivere un programma che crei un HashSet di oggetti. Inserire in tale Collection (come input da tastiera) n (dove il numero n è scelto dall'utente) oggetti distinti della classe Libro che contengano le seguenti variabili: titolo del libro, autore e anno di pubblicazione. Una volta inseriti i tre oggetti stampare a video solo il titolo del libro e l'anno di pubblicazione di tutti e tre gli oggetti inseriti ordinati per anno di pubblicazione.


### Esercizio 2
Scrivere un programma che implementi la classe email. Definire tutti i membri che devono essere presenti per descrivere una normale email (mittente, oggetto, testo etc.). Si consideri nel programma una lista di queste email (la lista degli oggetti email può essere istanziata direttamente all'interno del programma), Implementare una funzione che restituisca a video le email che contengono una specifica parola inserita dall'utente a video nel corpo del testo o uno specifico destinatario.


### Esercizio 3 [risolto]
Scrivere un programma che crei un file di testo ad accesso sequenziale. Scrivere nel file (come input da tastiera) A) titolo canzone, B ) anno di pubblicazione, C ) nome cantante, di 50 canzoni (I dati delle canzoni possono essere istanziate direttamente all'interno del programma). Chiudere il file. Aprire il file in lettura e stampare a video solo i dati, letti dal file, relativi alle canzoni che hanno un anno di pubblicazione pari ordinati in ordine lessicografico crescente rispetto al titolo.



## Febbraio 2021

### Esercizio 1
Scrivere un programma che crei un file di testo ad accesso sequenziale. Scrivere nel file: Titolo e numero di pagine di 30 oggetti di tipo libro contenuti in un array, i valori delle variabili devono essere inseriti negli oggetti come input da tastiera. Chiudere il file. Aprire il file in lettura e stampare a video solo i titoli dei libri che hanno più di 100 pagine.


### Esercizio 2
Scrivere un programma che permetta all'utente di inserire 20 oggetti della classe animale. Tale classe deve avere i seguenti membri: Nome_scientifico, Nome_comune, età, peso. Il programma deve permettere di visualizzare i dati degli oggetti animale a video secondo le seguenti scelte: a) Nome_scientifico decrescente, b) Nome_comune crescente, c) peso sia crescente che decrescente. I 20 oggetti devono essere gestiti tramite una Collection a scelta dello studente.


### Esercizio 3
Scrivere un programma che accetti in ingresso una stringa composta solo da caratteri zero ed uno. Nel caso siano presenti altri caratteri il programma dovrà restituire errore. Se l'inserimento della stringa è avvenuto correttamente il programma deve effettuare la conversione del numero binario rappresentato dalla stringa in numerazione decimale.



## Dicembre 2020
### Esercizio 1
data la seguente espressione booleana: (a and b) or not (c or b). Stampare la tabella di verità e il risultato.


### Esercizio 2
creare un programma che permetta all'utente di scegliere le operazioni da fare in una libreria, tra cui:
aggiungere un libro contenente titolo, autore e data
Visualizzare la lista dei libri in ordine cronologico di inserimento
Visualizzare la lista dei libri in ordine crescente e decrescente
Rimuovere un libro
La scelta dell'utente deve avvenire tramite menu e il libro inserito deve avere un ID univoco.
(In soldoni)


### Esercizio 3
Creare un programma client/server. Il server deve usare la porta "1234". All'avvio del server, si deve caricare la libreria dell'esercizio 2 e deve essere aggiunto alla classe libro lo stato (disponibile o meno). Il client potrà collegarsi al server e richiedere, tramite menu, solo 2 opzioni:
Visualizzare la lista totale di libri.
Visualizzare tutti i libri con stato disponibile.


## Giugno 2017
### Esercizio 1
Creare un menu che dia la possibilità di 3 scelte, ogni scelta ha un sotto menu da 4 scelte. il menu deve usare uno switch, i sottomenu devono essere if else if. L'utente deve poter tornare al menu principale. ogni sotto menu deve lanciare un suo metodo distinto (lol 12 metodi!) nella classe Action che stampa a video il nome del menu principale + il nome del metodo.


### Esercizio 2
creare un programma che risolve un'equazione data dal prof. l'utente può inserire 3 valori che compaiono nell'equazione e che devono essere dispari e inoltre uno negativo.


### Esercizio 3
Creare un programma che gestisca un server e un client. Il client deve chiedere la data al server su una porta xy (che ora non ricordo). Il server deve rispondere con un messaggio di benvenuto, e fornire quanto richiesto.


## Marzo 2017

### Esercizio 1
Riguardava la gestione delle stringhe: data una stringa dell'argomento main, si doveva controllare se presenti le lettere "x, y, w", se era presente qualche lettera maiuscola trasformarla in minuscola, contare il numero delle parole totali e delle parole senza lo spazio.


### Esercizio 2
Da una classe veicolo, estendere due classi automobili e motocicletta. Ognuna aveva tipo_veicolo, targa , marca, modello. Sovrascrivere il metodo toString, per farsi tornare tutte le caratteristiche. Fare un altra classe garage, dalla quale inserire un veicolo nel parcheggio e farsi ritornare la posizione in cui è stato inserito, estrarre un veicolo e far tornare marca modello targa, e contare quanti veicoli ci sono nel garage.


### Esercizio 3
Data un hashmap calcolare la somma dei valori interni, la media e il numero massimo della chiave

