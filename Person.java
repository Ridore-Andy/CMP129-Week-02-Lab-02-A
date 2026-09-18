public class Person 
{
    String name;

    int age;

    String email;
    
    public String getName(String name)
    {
        return name;
    }
    
    private String setName(String name)
    {
        this.name = "bob";
        return name;
    }

     public int getAge(int age) 
    {
        return age;
    }


     public String getEmail(String email)
    {
        return email;
    }

    public static void displayInfo(String name, int age, String email)
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
    }
}
