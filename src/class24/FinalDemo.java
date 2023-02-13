package class24;

public final class FinalDemo {
    public static void main(String[] args) {
        final int num;// we have created a constant variable
        num=20;
      //num=30; not possible because variable is declared final
    }
  final void noOneShouldOverrideIt(){
        System.out.println("This method should never overridden otherwise it might break the code base");
    }
}
/*class Nelson extends FinalDemo{
    *//*void noOneShouldOverrideIt(){ // we can not override this method as it is declared as final
        System.out.println("Let me do it");
    }*//*
}*/
