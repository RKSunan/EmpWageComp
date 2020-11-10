import java.util.Random;
class EmpWageComputation{
public static void main(String args[]) {
System.out.println("Day   Wage       TotalWage");
double sum=0;
double totalwage[]=new double[20];
for (int i=0;i<20;i++){
Random rand = new Random();
int rand_int1 =  rand.nextInt(2);
if (rand_int1 == 1){
 int rand_int2 =  rand.nextInt(2);
if (rand_int2 == 1){
double emp_wage=20*8;
totalwage[i]=sum + emp_wage;
sum=totalwage[i];
System.out.println(  i  + "   "   + emp_wage+"      "+totalwage[i] );
}
else{
float emp_wage = 20*4;
totalwage[i]=sum + emp_wage;
sum=totalwage[i];
System.out.println(  i  + "   "   + emp_wage+"    "+totalwage[i] );
}
}
else
totalwage[i]=sum;
System.out.println(i + "      " + 0 +"    " + totalwage[i]);
}
System.out.println ("The month wage of the employee is "+ sum );
}
}
