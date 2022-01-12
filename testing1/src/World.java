import org.jetbrains.annotations.NotNull;

public class World {

    String name;
    boolean sender;
    Obj obj;
    boolean instanced = false;
    int[][] space;

    World(String name, int x, int y){
        this.name = name;
        this.space = this.create(x, y);
        int frames = 0;
        System.out.println();
    }

    void start(){
        for (int[] ints : this.space) {
            for (int j = 0; j < this.space.length; j++) {
                System.out.println(ints[j]);
            }
        }
    }

    boolean findObj(){
        if(this.obj != null){ System.out.println(obj.name+" "+"exists within"+" "+this.name); return true;}
        System.out.println("No object exists within"+" "+this.name);
        return false;
    }
    boolean findWorld(@NotNull World x){
        System.out.println(x.name+" = "+x.sender);
        return x.sender;
    }

    private int[][] create(int x, int y){
        int i, j;
        int[][] t = new int[x][y];
        for(i = 0; i<x; i++){
            for(j = 0; j<y; j++){
                t[i][j] = 0;
            }
        }
        this.sender = true;
        return t;
    }
}
