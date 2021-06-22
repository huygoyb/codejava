package lad2.ex1;

public class Student {
    public int id;
    private String name;
    private boolean gender;

    public Student(){
        this.id= -1;
        this.name="noname";
        this.gender= true;
    }
    public Student(int id, String name,boolean gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int value){
        this.id=value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public  void printInfo(){
        System.out.println("_______________________________");
        System.out.println("| ID |       Name      | Male |");
        System.out.printf("| %d | %s | %b |\n",this.id,this.name,this.gender);
    }
}
