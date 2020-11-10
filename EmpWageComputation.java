import java.util.Random;
class EmpWageComputation{
public static void main(String args[]) {
System.out.println("Day   Wage");
for (int i=1;i<=20;i++){
Random rand = new Random();
int rand_int1 =  rand.nextInt(2);
if (rand_int1 == 1){
 int rand_int2 =  rand.nextInt(2);
if (rand_int2 == 1){
float emp_wage=20*8;
System.out.println(  i  + "   "   + emp_wage);
}
else{
float emp_wage = 20*4;
System.out.println(  i  + "   "   + emp_wage);
}}
else
System.out.println(i + "      " + 0);
}
}
}
