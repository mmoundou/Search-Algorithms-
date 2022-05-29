
public class TreeDemo {

    private NodeDemo head;

    public TreeDemo() {
        head = new NodeDemo();
    }

    public void addId(int id) {
        head.addChild(id);
    }

    public void addIdArray(int[] idArray) {
        head.addChildArray(idArray);
    }

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
