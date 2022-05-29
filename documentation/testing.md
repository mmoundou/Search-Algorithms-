# **Testing the Algorithm**

What are the ways in which a search algorithm might fail? A question I am quite capable of answering, since I have had
many nightmarish nights over this topic. Whether it be because of a recursive algorithm I know longer knew 2 days from 
the time I wrote it, or clobbered memory in C...yeah, I know all too well the ways in which a search algorith can fail. 

For one, 
we might get a nullpointerexception 
we might get a true when the value is not in our tree
we might get a false when the value *is* in our tree
we might get a stackoverflow error
the search method might not be responsive (this is usually do to how the search algorithm is implemented by the API 
and how it interacts with the internal data structure)
