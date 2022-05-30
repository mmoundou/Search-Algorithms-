# **Testing the Algorithm**

What are the ways in which a Binary Search algorithm might fail? I feel quite capable in answering that question, since I have
braced through many nightmarish situations over this topic. I guess what doesn't kill you truly makes you stronger--
after giving you many sleepless nights that is. Jokes aside, understanding what could go wrong when implementing a 
search algorithm makes for an easier time writing the code modules
that implement them. Even better: having such understanding helps us write better unit tests. Here are the following ways
in which our Binary Search algorithm could fail:

    - It might return a NullPointerException
    - It might indicate successful or unsuccessful search when that is not the case 
    - It might cause a StackOverflow error
    - It might cause the program to become unresponsive

Thus, the following could comprise the skeleton of our unit tests:

    - Pass a null value to the implementing function; check that null pointer is handled appropriately
    - Pass values to our tree, and ensure consistency between search result and expected result 
    - Check for cases that might cause StackOverflow errors or unresponsiveness; ensure that both cases
    are appropriately handled by the program

[This](../src/TreeDemoTest.java) is what our test guidelines would look like in live code.

[Final Words](final_words.md)