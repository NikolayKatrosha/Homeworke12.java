package homework12;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.exit;

class CustomArrayListTest {

    CustomObject customList = new CustomObject();



    @Test
    public void testAdd() {
       Object number= 12;
        customList.add(number);
        if (!customList.get(0).equals(number)) {
            System.out.println("Error");
            exit(0);
        }
    }

    @Test
    public void testAddByIndex() {
        int loopTimes = (int) (Math.random() * 100);
        for (int i = 0; i < loopTimes; i++) {
            customList.add(i, String.valueOf(i));
        }

        Assertions.assertTrue(customList.size() == loopTimes);
    }

    @Test
    public void testGet() {
        Assertions.assertTrue(customList.size() == 0);
        int loopTimes = 20;
        String prefix = "item-";
        for (int i = 0; i < loopTimes; i++) {
            customList.add(prefix + i);
        }

        for (int i = 0; i < loopTimes; i++) {
            Assertions.assertTrue(customList.get(i).equals(prefix + i));
        }
    }

    @Test
    public void testSize() {
        int loopTime = (int) (Math.random() * 100);
        for (int i = 0; i < loopTime; i++) {
            customList.add("Apple-" + i);
        }

        Assertions.assertTrue(customList.size() == loopTime);
    }

    @Test
    public void testDestroy() {
        int loopTimes = (int) (Math.random() * 100);
        for (int i = 0; i < loopTimes; i++) {
            customList.add(String.valueOf(i));
        }

        Assertions.assertTrue(customList.size() == loopTimes);
        Assertions.assertFalse(customList.isEmpty());

        customList.clear();
        Assertions.assertTrue(customList.size() == 0);
        Assertions.assertTrue(customList.isEmpty());
    }

    @Test
    public void testRemove() {
        int loopTimes = (int) (Math.random() * 100);
        for (int i = 0; i < loopTimes; i++) {
            customList.add(String.valueOf(i));
        }

        Assertions.assertTrue(customList.size() == loopTimes);

        for (int i = 0; i < loopTimes; i++) {
            customList.delete();
        }

        Assertions.assertTrue(customList.size() == 0);
        Assertions.assertTrue(customList.isEmpty());
    }

}

