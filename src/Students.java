public class Students {
    String name;
    int count;
    public Students(String name){
        this.name=name;
        count+=1;
    }

    // uses objects so non-static
    public String getName(){
        return name;
    }

    public int getCount(){
        return count;
    }
}
