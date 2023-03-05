package HomeWorkDay11;

public class Task1 {
    public static void main(String[] args) {
        //1) Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        // Then your program should print name of the students that has A and B grade

        String[][] names = {{"Alex", "Brian", "Costa", "Peter"},
                            {"A",       "C",    "F",     "B"},

        };

        for (int i = 0; i < names[0].length; i++) {

            if (names[1][i].equals("A") || names[1][i].equals("B")) {
                System.out.println(names[0][i]);
            }
        }

    }
}