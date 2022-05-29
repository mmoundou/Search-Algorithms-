import static org.junit.jupiter.api.Assertions.*;

class TreeDemoTest {

    TreeDemo myTree;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        myTree = new TreeDemo();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        myTree = null;
    }

    @org.junit.jupiter.api.Test
    void getId() {
        assertEquals(-1, myTree.getId());
    }

    /*@org.junit.jupiter.api.Test
    void getLc() {
        assertEquals(null, myTree.getLc());
    }

    @org.junit.jupiter.api.Test
    void getRc() {
        assertEquals(null, myTree.getRc());
    }*/

    @org.junit.jupiter.api.Test
    void locate() {
        assertEquals(true, myTree.locate(3));
    }

    /* @org.junit.jupiter.api.Test
    void setId() {

        myTree.setId(0);
        assertEquals(-1, myTree.getId());

    }

    @org.junit.jupiter.api.Test
    void setLc() {

        myTree.setLc(null);
        assertEquals(null, myTree.getLc());

    }

    @org.junit.jupiter.api.Test
    void setRc() {

        myTree.setRc(null);
        assertEquals(null, myTree.getRc());

    } */

}