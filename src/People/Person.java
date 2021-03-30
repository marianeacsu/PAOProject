package People;

public abstract class Person {
    private static int inc=0;
    private int id;
    private String lastName;
    private String firstName;
    private int age;


    public Person(String lastName,String firstName,int age){

        this.lastName=lastName;
        this.firstName=firstName;
        this.age=age;
    }

    {
        inc++;
        this.id=inc;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }




}
