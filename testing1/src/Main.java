public class Main {
    public static void main(String []args){
       World world1 = new World("Orignial World", 5,5);
       Obj ob1 = new Obj("Andreas", 4, world1);
       ob1.Position(4,2);
       world1.start();
    }
}
