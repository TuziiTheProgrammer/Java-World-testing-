public class Obj{

    String name;
    World parent;
    int Body;
    String type;
    boolean Added = false;

    Obj(String name, int Body, World parent){
        this.name = name;
        this.Body = Body;
        if(this.Body % 2 == 0)this.type = "Cube";
        if(parent.instanced == false){this.addTo(parent);}
    }

    private void addTo(World x){
        x.obj = this;
        this.parent = x;
        x.space[0][0] = this.Body;
    }

    int Position(int x, int y){
        int pos = 0;
        for (int i = 0; i < this.parent.space.length; i++){
            for (int j = 0; j < this.parent.space.length; j++){
                if(this.parent.space[i][j] == this.Body){
                    System.out.println(i+","+j);
                }
            }
        }
        for(int i = 0; i < this.parent.space.length; i++){
            for(int j = 0; j < this.parent.space.length; j++){
                
            }
        }
        if(x > this.parent.space.length & y > this.parent.space.length){
            System.out.println("Error");
        }else{ this.parent.space[x][y] = this.Body; this.Added = true;}
        return pos;
    }

}
