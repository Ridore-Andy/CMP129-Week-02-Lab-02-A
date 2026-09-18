public class Person 
{
    //setting attributes
    private String name;
    private int age;
    private String email;
    
    //get and set name
    public String getName(String name)
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    //get and set age
     public int getAge(int age) 
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    //get and set email
     public String getEmail(String email)
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    //display person info
    public void displayInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Email: "+email);
    }
}
