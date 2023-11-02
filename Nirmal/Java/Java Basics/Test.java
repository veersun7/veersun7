public class Test {
    public static void main(String[] args) {
        Test testObj = new Test();
        testObj.testLoops1();
        testObj.testLoops2();
    }

    public void testLoops1() {
        String o = "";
        z: for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 2; y++) {
                if (x == 1)
                    break;
                if (x == 2 && y == 1)
                    break z;
                o = o + x + y;
            }
        }
        System.out.println(o);
    }

    public void testLoops2() {
        int x = 0;
        int y = 10;
        do {
            y--;
            ++x;
        } while (x < 5);
        System.out.print(x + "," + y);
    }
}