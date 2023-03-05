package class12;

public class Task6 {
    /*
    Create 2D array of countries: north america countries, south america countries,
     europe countries, asian countries, african countries.
     Then print all values from that array using 2 different loops and
     calculate how many total countries been stored.
     */
    public static void main(String[] args) {
        String[][] countries={ {"USA","Mexico","Canada" },
                               {"Brazil","Peru","Colombia","Chile"},
                               {"Germany","France","Spain"},
                               {"Cina","India","Japan","Russia"},
                               {"Egypt","Nigeria","Ethiopia"},
        };
        int counter=0;
        for (int i = 0; i <countries.length ; i++) {
            for (int j = 0; j <countries[i].length ; j++) {
                System.out.print(countries[i][j]+" ");
                counter++;
            }
            System.out.println();
        }
        // Using enhanced for loop
        for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s + " ");
                counter++;
            }
            System.out.println();
        }
        System.out.println("Total countries "+counter);
    }


}
