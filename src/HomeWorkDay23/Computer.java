package HomeWorkDay23;
 /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some,
     of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each
    object and execute available methods.
    */
public class Computer {
public void starts(){
 System.out.println("Turning on the computer");
}
public void playMusic(){
 System.out.println("Playing music.....");
}
}
class Apple extends Computer{
 @Override
 public void starts() {
  System.out.println("Turning on Apple computer");
 }

 @Override
 public void playMusic() {
  System.out.println("Playing music on iTunes");
 }
 public void appleTV(){
  System.out.println("Watching movies on Apple TV");
 }
}
class Lenovo extends Computer{
 @Override
 public void starts() {
  System.out.println("Turning on Lenovo computer");
 }

 @Override
 public void playMusic() {
  System.out.println("Playing music on Lenovo computer");
 }
}
class HP extends Computer{
 @Override
 public void starts() {
  System.out.println("Turning on HP computer");
 }

 @Override
 public void playMusic() {
  System.out.println("Playing music on HP computer");
 }
}
class Dell extends Computer{
 @Override
 public void starts() {
  System.out.println("Turning on Dell computer");
 }

 @Override
 public void playMusic() {
  System.out.println("Playing music on Dell computer");
 }
}