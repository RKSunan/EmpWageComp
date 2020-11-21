import java.util.Random;
interface Employee{
public void compwage();
}
class EmpComputation implements Employee{
int wage;
int wh;
int wd;
EmpComputation(int wage, int wh, int wd){
this.wage=wage;
this.wh=wh;
this.wd=wd;
}
//public void compwage();
//}
//class EmpComputation implements Employee{
public  void compwage() {
double sum=0;
int hour=0;
int totalhour[]=new int[30];
double totalwage[]=new double[30];
System.out.println("Day \t Wage \tTotalWage \tTotalhour");
for (int i=1;i<=this.wd;i++){
Random rand = new Random();
int attend =  rand.nextInt(2);
switch(attend){
case 1:
	int rand_int2 =  rand.nextInt(2);
	if (rand_int2 == 1){
	double emp_wage=this.wage*this.wh;
	totalwage[i]=sum + emp_wage;
	sum=totalwage[i];
	totalhour[i]=this.wh+hour;
	hour=totalhour[i];
	System.out.println(i+"      "+ emp_wage+"        "+totalwage[i] +"       "+ totalhour[i]);
	}
	else{
float emp_wage = this.wd*(this.wh/2);
totalwage[i]=sum + emp_wage;
sum=totalwage[i];
totalhour[i]=(this.wh/2)+hour;
hour=totalhour[i];
System.out.println(  i  + "      "   + emp_wage+"        "+totalwage[i]+ "       "+ totalhour[i] );
}
break;
case 0:
totalwage[i]=sum;
totalhour[i]=hour;
System.out.println(i + "      " + 0 +"            " + totalwage[i]+"       "+ totalhour[i]);
}
}
System.out.println ("The month wage of the employee is "+ sum );
System.out.println ("The total working hours of the employee is"+ hour );
}
}
class EmpWageComputation{
public static void main(String args[] ) 
{
//System.out.println("Day \t Wage \tTotalWage \tTotalhour");
EmpComputation comp1=new EmpComputation(25,8,25);
EmpComputation comp2=new EmpComputation(30,7,20);
System.out.println("Details of First Comapany: \n");
comp1.compwage();
System.out.println("Details of second Company:\n");
comp2.compwage();
}
}
