
public class TreeDemo {
    private DemoNode head;
    private DemoNode lc;
    private DemoNode rc;


    public TreeDemo() {
        head = new DemoNode();
        lc = rc = null;
    }

    public int getId() {
        return -1; //Stub
    }

    public DemoNode getLc() {
        return null; //Stub
    }

    public DemoNode getRc() {
        return null; //stub
    }

    public boolean locate(int id) {
        return false; //Stub
    }
    private class DemoNode {
        int id;

        DemoNode() {
            id = -1;
        }

        DemoNode(int id) {
            this.id = id;
        }
    }
}
