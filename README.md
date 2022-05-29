
#Motivation#

Most programming languages have pre-defined search algorithms; leveraging them allows for efficient software development and peace (as most of them 
have been thoroughly tested for reliability and compatibility). Sometimes, however, they are not suited for some custom API's, 
so I figured playing around designing a search algorithm of my own would be a cool enterprise. 

![Binary Search Tree](tree_illustration.png "Tree Illustration")

Let the tree above serve as storage for a state's license plates, so that we can query the tree to locate specific plate numbers; 
we would traverse the plates in the tree, and compare each plate's number to the number we're looking for. 

Assumption: Our tree does not allow for duplicate values; no two cars exist with the same plate number, after all. 
