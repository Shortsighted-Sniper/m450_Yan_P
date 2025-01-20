# Learning Goal List
- [[#Testing Models|You know the the software development models and can describe them]]
	- [[#V-Model]]
	- [[#Scrum-Model]]
- [[#You know the tests present in the software development models above]]
	- [[#Component Test]]
	- [[#Integration Test]]
	- [[#System Test]]
	- [[#Acceptance Test]]


# Testing Models
## V-Model
The **==V-Model==** is an extension of the standard [Waterfall model](https://en.wikipedia.org/wiki/Waterfall_model). While in the [Waterfall model](https://en.wikipedia.org/wiki/Waterfall_model) testing comes close to the end of the project, in the **==V-Model==** testing is done during development. Here is an image example of a **==V-Model==**:
![[peco-v-modell.png]]
As you can see after a feature / component is implemented you immediately test it and and if there is an error you correct it.

## Scrum-Model
**==Scrum==** is an iterative software development process. Here is an example image:
![[scrum_flow.jpg]]
In this method the tests will be written when a feature / component are complete. Due to the iterative nature of **==Scrum==** automated tests are very important, since they will have to be run very frequently. 


# Test Kinds
## Component Test
Tests if every small piece of the application functions correctly. It's mostly represented by Unit Tests.

## Integration Test
Tests if a group of components is integrated correctly.

## System Test
Tests if the whole application meets the requirements.

## Acceptance Test
Tests if the whole application is accepted by the customer.