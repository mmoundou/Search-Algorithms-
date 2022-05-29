
#Motivation#

Most programming languages have pre-defined search algorithms; 
leveraging them allows for more efficient software development with the added peace 
that they have been thoroughly tested for reliability and compatibility. 
Sometimes, however, they fall short of integrating into custom engineering solutions, 
so I figured designing a search algorithm of my own would be a cool enterprise. 

-insert tree image here- 

Let's say we have a tree, and we would like to search the tree for a specific value: 
First, we need to ensure that the tree exists (it could be a null value). 
Then we would query the nodes in the tree, and compare each node's value to the desired value Assumption: 
there are no duplicate values in the tree. A typical query would be of type "myTree.next.value".
Now, that depends on a couple of factors: 
The tree is not null We already have a reference to the tree's head The desired value is not located in the tree's head 
The tree's head has descendants. 
