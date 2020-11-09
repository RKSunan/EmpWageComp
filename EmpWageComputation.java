import java.util.Random;
class EmpWageComputation{
  public static void main(String args[]) {
Random rand = new Random();
int rand_int1 =  rand.nextInt(2);
if (rand_int1 == 1){
System.out.println("Employee Present");
}
else
System.out.println("Employee Absent");
}
}


