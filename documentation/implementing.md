# **Implementing the Algorithm**


As much I enjoy designing and documenting, I love coding even more. That's kind of a little lie, but my point is, 
It would not be fair to leave without showing the reader what they came here for: actual search algorithm code. 
So I will oblige, and post relevant snippets. Enjoy!


`public boolean locate(int id) {

        NodeDemo tracker = head;

        while(tracker != null) {

            if (tracker.getId() == id)

                return true;

            else if (tracker.getId() > id)

                tracker = tracker.lc;

            else

                tracker = tracker.rc;

        }

        return false;

    `}