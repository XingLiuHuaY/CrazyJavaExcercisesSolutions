public class Student{
    // ����̫���ˣ��鷳����д������ �ɸ��������������ѯ��
    private static final int STUDENT_NUM = 5;
    private String name;
    int age;
    String gender;
    public Student(){
    }
    public Student(String name,int age,String gender){
        setName(name);
        setAge(age);
        setGender(gender);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return this.gender;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void printInfo(){
        System.out.println("ѧ����Ϣ  ����:"+name+" �Ա�:"+gender+" ����:"+age);
    }
    public static void main(String[] args){
        
    }
    private static void (test2){
        Student[] students = new Student[5];
    }
    private static void test1(){
        Student stu1 = new Student();
        stu1.setAge(15);
        stu1.setName("С��");
        stu1.setGender("��");
        stu1.printInfo();
        Student stu2 = new Student("С��",12,"Ů");
        stu2.printInfo();
        System.out.println("ѧ��1��Ϣ  ����:"+stu1.getName()+" �Ա�:"+stu1.getGender()+" ����:"+stu1.getAge());
    }
}