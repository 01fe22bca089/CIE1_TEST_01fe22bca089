public class DevOpsEng extends Employee{
    float salary;
    float bonus;
    public float GiveBonus(float salary, float bonus)
    {
        return salary+bonus;
    }
    public static void main(String [] args)
    {
        DevOpsEng dev = new DevOpsEng();
        System.out.println("Bonus with salary: "+dev.GiveBonus(70000, 6000));
    }
}