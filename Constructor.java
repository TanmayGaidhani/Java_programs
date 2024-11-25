class tanmay{
    private int id;
    private String name;
    public tanmay(String myname,int myid){
        System.out.println("Welcome! In java program");
        name=myname;
        id=myid;
        System.out.println("my name is:"+name);
        System.out.println("my id is:"+id);
    }
    public tanmay(int i,int j){
        System.out.println("Addition of two number is"+(i+j));
    }
    public void setname(String myname){
        name=myname;
    }
    public String getname(){
        return name;
    }
    public void setid(int id){
        this.id=id;
    }
    public int getid(){
        return id;
    }
}
public class Constructor{
    public static void main(String[] args) {
        tanmay tan=new tanmay("Tanmay Sanjay Gaidhani",112);
        tanmay tana=new tanmay(1,2);
    }
}