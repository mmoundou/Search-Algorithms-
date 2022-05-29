
public class TreeDemo {
    private NodeDemo head;

    public TreeDemo() {
        head = new NodeDemo();
    }

    public int getId() {
        return -1; //Stub
    }

    public boolean locate(int id) {

        NodeDemo tracker = head;

        while(tracker != null) {

            if (head.getId() == id)
                return true;
            else if (head.getId() > id)
                tracker = head.lc;
            else if (head.getId() < id)
                tracker = head.rc;

        }

        return false;

    }

    private class NodeDemo {
        int id;
        NodeDemo lc, rc;

        NodeDemo() {
            id = -1;
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

        /*
                public void setId(int id) {
                    //Stub
                }

                public void setLc(NodeDemo lc) {
                    //Stub
                }

                public void setRc(NodeDemo rc) {
                    //Stub
                }
           */

    }

}
