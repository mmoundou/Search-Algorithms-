
import static org.junit.jupiter.api.Assertions.*;

class TreeDemoTest {

    TreeDemo myTree1, myTree2, myTree3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        int[] temp = {1, 2, 3, 4, 5};
        myTree1 = new TreeDemo();
        myTree2 = new TreeDemo(1234);
        myTree3 = new TreeDemo(temp);

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        myTree1 = myTree2 = myTree3 = null;
    }

    @org.junit.jupiter.api.Test
    void addId() {

        int id1 = 18, id2 = 0;
        myTree1.addId(id1);
        assertEquals(true, myTree1.locate(id1));
        myTree1.addId(id2);
        assertEquals(true, myTree1.locate(id2));

        myTree2.addId(72);
        myTree2.addId(73);
        myTree2.addId(74);

        myTree3.addId(100);
        myTree3.addId(101);
        myTree3.addId(102);

    }

    /*@org.junit.jupiter.api.Test
    void addIdArray() {

        int[] idArray = {11, 12, 13, 14, 15};

        for(int index = 0; index < idArray.length; index++)
            myTree1.addId(idArray[index]);

        for(int index = 0; index < idArray.length; index++)
            assertEquals(true, myTree1.locate(idArray[index]));

    }*/

    @org.junit.jupiter.api.Test
    void locate() {
        assertEquals(false, myTree1.locate(3));
    }

}