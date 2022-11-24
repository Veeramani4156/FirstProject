class student{
    private String name = "veeramani";
    private int age = 22;
    private int rollnum = 175157;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getRollnum(){
        return rollnum;
    }
    public void setRollnum(int rollnum){
        this.rollnum = rollnum;
    }
}
public class vm {
    public static void main(String[] args) {
        student s1 = new student();
        //s1.setName("veeramani");
        //s1.setAge(23);
        //s1.setRollnum(2269949);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getRollnum());

    }

}