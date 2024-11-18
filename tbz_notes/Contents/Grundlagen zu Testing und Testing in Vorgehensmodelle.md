# Learning Goal List
- [[#Grundlagen zu Testing]]
	- [[#Reasons to test an application|You can name reasons to test an application]]
	- [[#Error / Deficiency|You understand the difference between an Error and a Deficiency]]
		- [[#Error]]
		- [[#Deficiency]]
	- [[#Error Masking|You can explain the concept of error masking]]
	- [[#You can explain why you can't completely test an application]]
	- [[#You can name good criteria for testing]]
	- [[#You know the SW-Model and can describe it]]
	- [[#You know the kinds of tests in the SW-Model and can assign them]]
- [[#Testing im Vorgehensmodell]]
	- [[#Testing Models|You know the the software development models and can describe them]]
		- [[#V-Model]]
		- [[#Scrum-Model]]
	- [[#You know the tests present in the software development models above]]
		- [[#Component Test]]
		- [[#Integration Test]]
		- [[#System Test]]
		- [[#Acceptance Test]]
- [[#Aufgaben]]
	- [[#Aufgabe 1]]
	- [[#Aufgabe 2]]
	- [[#Aufgabe 3]]
	- [[#Aufgabe 3+]]


# Grundlagen zu Testing
## Reasons to test an application
Generally applications are tested to ensure the desired quality is met. Examples for high quality are:
- Every function works properly [[#Error|Errors]] or [[#Deficiency|Deficiencies]]
- The application itself works fast and doesn't overload the machine
- Application has the desired level of security

## Error / Deficiency
When testing an application there are generally two terms that are used then referring to an incorrect behavior of an application. These terms are _[[#Error]]_ and _[[#Deficiency]]_.
### Error
A behavior is described as an **==Error==** when some function of an application works incorrectly. Here as some examples:
- A check returns _**false**_ when _**true**_ was expected
- A html element is not rendered when it is supposed to be
- A calculation returns a incorrect value
### Deficiency
A behavior is described as a **==Deficiency==** when some function of the application works correctly, but it still doesn't meet the expectations. Here are some examples:
- A calculation returns a correct result, but the GUI displays it incorrectly
- A calculation is correct, but it takes too long
- An HTML element is rendered correctly but it shows up too many times

## Error Masking
One speaks of **==Error Masking==** when an [[#Error]]/[[#Deficiency]] is hidden (_masked_) by another part of the application. Such errors aren't immediately visible and can be spotted only when the masking part of the application is fixed. 

An Error can also happen way later as an example due to incorrect saving / corruption of data that will be used later.

## You can explain why you can't completely test an application
It is pretty much impossible to fully test for every possible error and edge case, due to there being a pretty much infinite amount of them. What can be done is to generalize the possible inputs and make the most amount of positive / negative test based on those options.

Because it's impossible fully test a program, one should generally tests the functions of the program that would cause the most damage if they were to function incorrectly.

## You can name good criteria for testing
The criteria for a good test is the following:
- It must test something that is prone to errors
- Tests should test different functions to avoid redundancy 
- Tests should be independent
- A single test case should test as much code as possible


# Testing im Vorgehensmodell
## Testing Models
### V-Model
The **==V-Model==** is an extension of the standard [Waterfall model](https://en.wikipedia.org/wiki/Waterfall_model). While in the [Waterfall model](https://en.wikipedia.org/wiki/Waterfall_model) testing comes close to the end of the project, in the **==V-Model==** testing is done during development. Here is an image example of a **==V-Model==**:
![[peco-v-modell.png]]
As you can see after a feature / component is implemented you immediately test it and and if there is an error you correct it.

### Scrum-Model
**==Scrum==** is an iterative software development process. Here is an example image:
![[scrum_flow.jpg]]
In this method the tests will be written when a feature / component are complete. Due to the iterative nature of **==Scrum==** automated tests are very important, since they will have to be run very frequently. 

## Test Kinds
### Component Test
Tests if every small piece of the application functions correctly. It's mostly represented by Unit Tests.
### Integration Test
Tests if a group of components is integrated correctly.
### System Test
Tests if the whole application meets the requirements.
### Acceptance Test
Tests if the whole application is accepted by the customer.


# Aufgaben
## Aufgabe 1
- Unit-Tests:
	- Das sind kleinere Tests die geschrieben werden um eine einzelne Funktion zu testen. Es braucht meistens mehrere Unit-Tests um die ganze Funktionalität einer Funktion abzudecken. In der Praxis benutze ich sie ganz oft weil sie vor jeden Code-submit gerunnt werden und es so sichergestellt wird, dass alles correct lauft. Diese Tests lasse ich oftmals während dem coden und vor dem Submit laufen.
- Screenshot-Tests:
	- Ähnlich zu den Unit-Tests, aber statt eine Funktion zu testen, testen sie ob die finale Seite richtig aussieht. Sie werden normalerweise nicht während dem coden gerunnt, sondern als des Presubmit-Test.
- Presubmit-Test:
	- Vor dem man ein Change in die Codebase submittet, wird dieser Test ausgeführt. In diesem Test werden alle Tests ausgeführt, die mit dem abgeänderten Code etwas zu tun haben. Das soll sicherstellen dass nichts kaputtgegangen ist und die Funktion die man erstellt / updated hat richtig lauft. Während diesem schritt gehen meistens mehrere Screenshot-Tests kaputt und man muss die Screenshots updaten. Dieser Test wird nur gerade vor dem Submit gemacht.

## Aufgabe 2
- SW-Fehler:
	- Der Passwort aller User ist nicht Korrekt gespeichert und das führt dazu, dass alle Passwörter durch ein Default-Passwort ersetzt werden.
- SW-Mangel:
	- Ein Suchfeld wird auf einer Webseite 2 Mal gerendert. Es funktioniert correct und man kann die Wahren suchen.
- Hohe Schaden bei SW-Fehler:
	- Wegen dem Fehler aus dem 'SW-Fehler' Beispiel können die User nicht einlogen und deswegen können sie nicht die App benutzen.

## Aufgabe 3

