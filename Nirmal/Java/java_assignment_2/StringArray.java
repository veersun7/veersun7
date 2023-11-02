public class StringArray {
    public static void main(String[] args) {
        String[] countrys = new String[6];
        countrys[0] = "America";
        countrys[1] = "China";
        countrys[2] = "India";
        countrys[3] = "India";
        countrys[4] = "Newzealand";
        countrys[5] = "Japan";
        int arrayLength = countrys.length;
        String country = "India";
        for (int i = 0; i < arrayLength; i++) {
            if (countrys[i].equals(country)) {
                System.out.println("Index an array element " + country + " is " + i + " in a String array");
            }
        }
    }
}