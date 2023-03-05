package HomeWorkDay23;

public class ComputerTester {
    public static void main(String[] args) {
        Computer [] computers={new Apple(),new Dell(), new Lenovo(),new HP()};

        for(Computer computer:computers){
          computer.playMusic();
          computer.starts();

        }
    }
}
