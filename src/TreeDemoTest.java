
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
    void addId() {

        int id1 = 18, id2 = 0;
        myTree.addId(id1);
        assertEquals(true, myTree.locate(id1));
        myTree.addId(id2);
        assertEquals(true, myTree.locate(id2));

    }

    @org.junit.jupiter.api.Test
    void addIdArray() {

        int[] idArray = {11, 12, 13, 14, 15};

        myTree.addIdArray(idArray);

        for(int index = 0; index < idArray.length; index++)
            assertEquals(true, myTree.locate(idArray[index]));

    }

    @org.junit.jupiter.api.Test
    void locate() {
        assertEquals(false, myTree.locate(3));
    }

}