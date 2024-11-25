class Constructor{
    private String name;
    private int id;
    private int salary;
    public Constructor(){
        System.out.println("Welcome........");
    }
    public Constructor(String myname,int myid,int mysalary){
        name=myname;
        id=myid;
        salary=mysalary;
        System.out.println("my name is:"+name+"\nmy id is:"+id+"\nmy salary is:"+salary);
    }
    public void setname(String name){
        this.name=name;
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
    public void setsalary(int salary){
        this.salary=salary;
    }
    public int getsalary(){
        return salary;
    }
}
public class ConstructorOverload{
    public static void main(String[] args) {
        Constructor y=new Constructor();
        Constructor y1=new Constructor("tanmay sanjay gaidhani",113,234235);
    }
}