![Binary Search Tree](../tree_illustration.png)

Let the tree above serve as storage for a state's license plates,
so that we can query the tree to locate specific plate numbers;
we would traverse the plates in the tree, and compare each plate's number to the number we're looking for.
Upon successfully locating the desired number, we would stop our search; otherwise, we would continue our search, until
the desired value was found, or we'd reached the end of the tree.

Assumption: Our tree does not allow for duplicate values; no two cars exist with the same plate number, after all. 