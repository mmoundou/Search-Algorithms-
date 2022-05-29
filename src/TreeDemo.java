
public class TreeDemo {
    private NodeDemo head;

    public TreeDemo() {
        head = new NodeDemo();
    }

    public int getId() {
        return -1; //Stub
    }

    /*
        public void addElement(int id) {
        }
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
            lc = new NodeDemo(2);
            rc = new NodeDemo(3);
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

        /*void addChild(NodeDemo child) {
            NodeDemo tracker = this;
            NodeDemo lastNodeTracker = null;

            while(tracker != null) {

                if(child.getId() < this.getId()) {
                    lastNodeTracker = tracker;
                    tracker = this.getLc();
                }
                else if(child.getId() > this.getId()) {
                    lastNodeTracker = tracker;
                    tracker = this.getRc();
                }

            }

            if(child.getId() < lastNodeTracker.getId())
                lastNodeTracker.setLc(child);
            else if(child.getId() > lastNodeTracker.getId())
                lastNodeTracker.setRc(child);

        }*/
        private void setLc(NodeDemo lc) {
            //this.lc = lc;
            //lc = new NodeDemo(2);
        }

        private void setRc(NodeDemo rc) {
            //this.rc = rc;
            //rc = new NodeDemo(3);
        }

        /*
           public void setId(int id) {
             //Stub
           }
        */

    }

}
