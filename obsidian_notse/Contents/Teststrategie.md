# Learning Goal List
- [[#Testing Strategy and Planning]]
	- [[#Elements of a Testing Strategy|You know the elements of a testing strategy]]
	- [[#Concrete / Abstract Testing Methods|You can explain the difference between abstract and concrete testing methods ]]
	- [[#Functional / Non-Functional Tests|You know the differences between function and non-functional test-cases]]
		- [[#Functional Tests]]
		- [[#Non Functional Tests]]
	- [[#Test-Methods|You can explain test-methods]]
- [[#Aufgaben]]
	- [[#Aufgabe 1]]
	- [[#Aufgabe 2]]
	- [[#Aufgabe 3]]


# Testing Strategy and Planning
## Elements of a Testing Strategy
A testing Strategy describes the way you test you application. For this you must create a test concept in which you define the most important elements for testing. Here are some simple factors of a testing strategy:
- Test-objects with a small description of how the Software looks
	- Generally these are the things that are to be tested.
	- Such objects are:
		- Functions
		- HTML components
		- CMD prompts
		- SQL scripts
		- etc.
- List of elements of the SW that need testing
	- Now that we know what we want to test we write exact test cases for each of the objects.
	- One can generally use 2 types of tests:
		- [[#Functional Tests]]
			- [[#Abstract Testing Methods]]
			- [[#Concrete Testing Methods]]
		- [[#Non-Functional Tests]] (will not be looked at in-depth in this module)
- Choosing a testing method
	- After you know what kind of tests you want to conduct you must decide what testing method is preferred for your application.
	- There generally are 2 types of testing methods:
		- [[#Whitebox Testing]]
		- [[#Blackbox Testing]]
		- [[#Automated Testing]]
- Which testing infrastructure will be used
	- Now that we know what kind of testing we want to conduct, we can better decide what testing-tools will be most useful to us.
	- Will be looked at in more detail in latter modules.

## Concrete / Abstract Testing Methods
### Concrete Testing Methods
We use concrete in / outputs. For example we know if the function receives 5 as an input we expect it to output 12 and it is correct if that's true.
### Abstract Testing Methods
We don't have any concrete values that we can test for, but we test for with boolean and the generally utilize comparators (<, !=, >=, etc.).

## Functional / Non-Functional Tests
### Functional Tests
Describes tests of the functions of the SW (what the SW does). 
### Non-Functional Tests
Describes tests of the performance of the SW.

## Test-Methods
### Whitebox Testing
Generally done with Unit-Tests. The testing party can see the code and can explicitly test each function. 
### Blackbox Testing
Generally done when the code is inaccessible (e.g. already compiled). It's generally done by a designated testing team. 
### Automated Testing
Will be looked at in future modules.

# Aufgaben
## Aufgabe 1
- Abstract test cases:

| Condition                 | Discount |
| ------------------------- | -------- |
| Price < 15'000            | 0%       |
| 15'000 <= Price <= 20'000 | 5%       |
| 20'000 < Price <= 25'000  | 7%       |
| 25'000 < Price            | 8.5%     |
- Concrete test cases:

| Price   | Discount |
| ------- | -------- |
| 14'550  | 0%       |
| 16'750  | 5%       |
| 22'220  | 7%       |
| 100'000 | 8.5%     |
## Aufgabe 2
Website: [Mobility](https://www.mobility.ch/en/private-customers)

| ID  | Description                                           | Expected Result                                                                          |
| --- | ----------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| 0   | You can visit the site                                | The website loads up the starting page                                                   |
| 1   | You can create an account                             | When clicking 'Become customer' button you can create an account                         |
| 2   | 'Become Customer' no longer shows up after signing up | After you sign up the 'Become Customer' button should disappear and no longer be visible |
| 3   | You can log into a created account                    | After you create an account you should be able to log into it                            |
| 4   | You should be able to rent a car                      | Once you have an account you should be able to rent a car                                |

## Aufgabe 3
- Blackbox:

| ID  | Beschreibung      | Erwartetes Resultat                                                                   |
| --- | ----------------- | ------------------------------------------------------------------------------------- |
| 0   | Account erstellen | Account wird erstellt                                                                 |
| 1   | Geld ablegen      | Geld wird auf meinen Account abgelegt und gespeichert                                 |
| 2   | Geld abheben      | Geld wird von meinem Account abgehoben                                                |
| 3   | Währungstausch    | Währung wird korrekt umgerechnet                                                      |
| 4   | Fehler ausheben   | Falls während dem Ablegen/Abheben von Geld ein Fehler passiert ist das Geld noch dort |

- Whitebox:

| ID  | Beschreibung    | Erwartetes Resultat                                 |
| --- | --------------- | --------------------------------------------------- |
| 0   | createAccount() | Account wird mit angegebenen Daten correct erstellt |
| 1   | deposit()       | Geld wird correct eingezahlt                        |
| 2   | withdraw()      | Geld wird correct ausgezahlt                        |
| 3   | transfer()      | Geld wird correct überwiesen                        |
| 4   | getStatement()  | Kontoauszug wird richtig generiert.                 |
