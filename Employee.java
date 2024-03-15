class Employee{
    String name = "Frank";
    float salary = 70000;
    int employeeid = 1234;
    public void DisplayDetails()
    {
        System.out.println("Name of the employee: " +name);
        System.out.println("Salary: "+salary);
        System.out.println("Employee Id: "+employeeid);
    }

    public static void main(String [] args){
        Employee emp = new Employee();
        emp.DisplayDetails();
    }
}






