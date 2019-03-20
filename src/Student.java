public class Student {
    private String Name;
    private int Age;
    private int Grade;
    private double AverageMark;
    private boolean Stypendia;

    Student( String name,int age,int grade,double averageMark,boolean stypendia) {
        this.Name = name;
        this.Age = age;
        this.Grade = grade;
        this.AverageMark = averageMark;
        this.Stypendia = stypendia;
    }
    @Override
    public String toString () {
        return "Name: " + Name + " | age: " + Age + " | grade:"+Grade+" | average mark=" + AverageMark + " | stupendia-" + Stypendia;

    }

    public String getName(){
        return Name;
    }
    public boolean getStypendia(){
        return Stypendia;
    }

    public double getAverageMark() {
        return AverageMark;
    }

    public int getAge(){
        return Age;
    }
    public int getGrade(){
        return getGrade();
    }
}
