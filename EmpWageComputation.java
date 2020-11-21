import java.util.Random;
class EmpWageComputation{
public  void compwage(int wage, int wh, int wd) {
double sum=0;
int hour=0;
int totalhour[]=new int[30];
double totalwage[]=new double[30];
for (int i=0;i<wd;i++){
if ( !totalhour.equals(wh) && i!=wd )
{
Random rand = new Random();
int rand_int1 =  rand.nextInt(2);
if (rand_int1 == 1){
 int rand_int2 =  rand.nextInt(2);
if (rand_int2 == 1){
double emp_wage=wage*wh;
totalwage[i]=sum + emp_wage;
sum=totalwage[i];
totalhour[i]=wh+hour;
hour=totalhour[i];
System.out.println(i+"      "+ emp_wage+"        "+totalwage[i] +"       "+ totalhour[i]);
}
else{
float emp_wage = wd*(wh/2);
totalwage[i]=sum + emp_wage;
sum=totalwage[i];
totalhour[i]=(wh/2)+hour;
hour=totalhour[i];
System.out.println(  i  + "      "   + emp_wage+"        "+totalwage[i]+ "       "+ totalhour[i] );
}
}
else
totalwage[i]=sum;
totalhour[i]=hour;
System.out.println(i + "      " + 0 +"            " + totalwage[i]+"       "+ totalhour[i]);
}
}
System.out.println ("The month wage of the employee is "+ sum );
System.out.println ("The total working hours of the employee is "+ hour );
}
public static void main(String args[]) 
{
System.out.println("Day \t Wage \tTotalWage \tTotalhour");
EmpWageComputation comp1=new EmpWageComputation();
comp1.compwage(30,10,23);
}
}

