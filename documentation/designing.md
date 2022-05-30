# **Designing the Algorithm**


Before implementing our search algorithm, we must design it, measure it against system requirements, and test it for any
inconsistencies. This will help prevent issues that might be much harder to solve down the line (with the added benefit
of serving as documentation for our algorithm). 


## **Taking in Account the Data Structure Specifics**


Previously, we stated that our tree's internal structure would mimic the shape of a triangle. While seemingly trivial, 
such a detail allows us a preliminary idea of what traversing our tree would look like:

    - Query a node
    - Query a node's left child (if applicable)
    - Query a node's right child (if applicable) 

Something else worth considering would be whether our tree stores duplicate values: in the even that our
tree contains the value "2", and that an operation attempts to add the value "2" to said tree again, would the operation
successfully complete? There is no answer, because that would depend on what real-life system our 
tree's API is modeled after. If, for instance, our tree stores birthdays, duplicates would be inevitable, since millions
of people share the same birthday (looking at you, September babies!). If we are dealing with a license plate 
registration system, on the other hand, our tree would contain only unique values. Last, would the tree store values
in ascending order? Descending order? Or perhaps sequentially? These are all things to consider before moving forward.


## **Prototyping the Algorithm**  


For this section and onward, we will assume a tree that, additionally to having a triangular shape, does not allow for 
duplicate values and sorts its values in ascending order. The following would then be our proposed algorithm: 

    - Query head node 
    - If desired value is found, stop search; otherwise continue
    - Check for head node's children
    - If found, query children nodes; otherwise stop search

The nice thing about a sorted tree (either ascending or descending) is that is nicely works with binary search which 
makes for an elegant and efficient search. I wish I came up with binary search myself, but I know how to use it,
at least; that's almost the same thing, right? No? Okay. Refining our algorithm to implement a binary search, we get: 

    - Query head node
    - If desired value is found, stop search; otherwise continue
    - If search value lesser than head node value, proceed to the left; otherwise proceed to the right
    - Check for left/right children 
    - If found, query left/right children; otherwise stop search

An unexpected issue we might run into is that of deciding what to do in the case of a successful or unsuccessful search: 
given that a method will implement the above algorithm, and that another method will call the implementing method, what
value, if any, should we return to the caller? Should we return a true/false boolean value? If wrapping our tree's 
values in objects, should we return references to said objects (when successful) and null values
(when unsuccessful)? This again, would all depend on system requirements and architecture choices. 
What we can say, though, is that we'd have more freedom over this if the caller and algorithm-implementing method were 
built by the same engineering team than if they were each part of different engineering groups, interacting with one
another without necessarily sharing the same design philosophy. 


## **Wrapping Up**


Although we've tried to be as comprehensive as possible in our design choices, there are many more things that, 
generally (and specifically, depending on a client's own needs), 
must be accounted for when designing a search algorithm. This makes it important to understand the fundamentals 
of search algorithms--relying on pre-defined ones might be convenient, 
but there will likely come a time when one is required to build one of their own. 
Better get used to it now than later; no?



[prev.](introduction.md) | [next](testing.md)