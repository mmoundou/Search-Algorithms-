
/**
 * TreeDemo models a Tree API that serves as storage structure for a state's license plates.
 * The API allows for data structures of any size, and stores the plates
 * in ascending order (where each plate number is greater than the one that
 * precedes it and smaller than the one that follows it).
 *
 * @author Matthieu Moundou
 *
 */

public class TreeDemo {

    private NodeDemo head;

    // Default constructor, implemented for test purposes
    public TreeDemo() {
        head = new NodeDemo();
    }

    public TreeDemo(int id) {
        head = new NodeDemo(id);
    }

    public TreeDemo(int[] idArray) {

        int[] arr = new int[idArray.length - 1];

        for(int index = 1; index < idArray.length; index++)
            arr[index - 1] = idArray[index];

        head = new NodeDemo(idArray[0]);
        head.addChildArray(arr);

    }

    /**
     * addId takes in an integer parameter representing a license plate number,
     * and loads it into the Tree's data structure.
     *
     * @param id - an integer value representing a license plate.
     *
     * */

    public void addId(int id) {
        if(!locate(id))
            head.addChild(id);
    }

    /**
     * addIdArray takes in a list of integer values (in the form of an array)
     * representing a license plate numbers, and loads them into the Tree's data structure.
     *
     * @param idArray - an integer array representing a set of license plates.
     *
     * */

    public void addIdArray(int[] idArray) {
        head.addChildArray(idArray);

    }

    /**
     * locate takes in an integer value, searches the data structure for that value,
     * and returns a boolean value indicating whether the value was found or not.
     *
     * @param id - an integer value representing the search value.
     * @return - boolean value indicating that the search was successful or unsuccessful
     *
     */

    public boolean locate(int id) {

        NodeDemo tracker = head;

        while(tracker != null) {

            if (tracker.getId() == id)
                return true;
            else if (tracker.getId() > id)
                tracker = tracker.lc;
            else if (tracker.getId() < id)
                tracker = tracker.rc;

        }

        return false;

    }


    private class NodeDemo {

        int id;
        NodeDemo lc;
        NodeDemo rc;

        NodeDemo() {
            id = 1;
            lc = rc = null;
        }

        NodeDemo(int id) {
            this.id = id;
        }

        int getId() {
            return id;
        }

        NodeDemo getLc() {
            return lc;
        }

        NodeDemo getRc() {
            return rc;
        }

        void addChild(int id) {

            NodeDemo tracker = head;
            NodeDemo lastNodeTracker = tracker;

            while(tracker != null) {

                if(id < tracker.getId()) {
                    lastNodeTracker = tracker;
                    tracker = tracker.getLc();
                }
                else if(id > tracker.getId()) {
                    lastNodeTracker = tracker;
                    tracker = tracker.getRc();
                }

            }

            if(id < lastNodeTracker.getId())
                lastNodeTracker.setLc(new NodeDemo(id));
            else if(id > lastNodeTracker.getId())
                lastNodeTracker.setRc(new NodeDemo(id));

        }

        void addChildArray(int[] childArray) {

            for(int index = 0; index < childArray.length; index++) {

                int id = childArray[index];
                NodeDemo tracker = head;
                NodeDemo lastNodeTracker = tracker;

                while(tracker != null) {

                    if(id < tracker.getId()) {
                        lastNodeTracker = tracker;
                        tracker = tracker.getLc();
                    }
                    else if(id > tracker.getId()) {
                        lastNodeTracker = tracker;
                        tracker = tracker.getRc();
                    }

                }

                if(id < lastNodeTracker.getId())
                    lastNodeTracker.setLc(new NodeDemo(id));
                else if(id > lastNodeTracker.getId())
                    lastNodeTracker.setRc(new NodeDemo(id));

            }

        }

        private void setLc(NodeDemo lc) {
            this.lc = lc;
        }

        private void setRc(NodeDemo rc) {
            this.rc = rc;
        }

    }

}
