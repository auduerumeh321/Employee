
class Test{
public static void main (String[]args){
Employee employee=new Employee();
employee.name="john";
employee.age=30;
employee.salary=40000;


if (employee.age>=20 && employee.age <=40){
 employee.tax=employee.salary * 15/100;
 employee.salaryAfterTax=employee.salary-employee.tax;


}else if (employee.age >=41 && employee.age <= 49){
  employee.tax=employee.salary *10/100;
  employee.salaryAfterTax=employee.salary-employee.tax;




}else if (employee .age  >=50){
  employee.tax=employee.salary * 5/100;
  employee.salaryAfterTax=employee.salary-employee.tax;

}

System .out.println("your salary is:"+employee.salary);
System.out.println("your tax is :"+ employee.tax);
System .out.println("your salaryAfterTax is:"+ employee.salary);

}//end of main 
}// end of Test class
   

