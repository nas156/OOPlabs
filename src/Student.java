public class Student {
    private String name;
    private int age;
    private int grade;
    private double averageMark;
    private boolean stypendia;

    Student( String name,int age,int grade,double averageMark,boolean stypendia) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.averageMark = averageMark;
        this.stypendia = stypendia;
    }
    @Override
    public String toString () {
        return "Name: " + name + " | age: " + age + " | grade:"+grade+" | average mark=" + averageMark + " | stupendia-" + stypendia;

    }

    public String getName(){
        return name;
    }
    public boolean getStypendia(){
        return stypendia;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public int getAge(){
        return age;
    }
    public int getGrade(){
        return grade;
    }
}
