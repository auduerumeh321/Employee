



class Application{

public static void main(String[]arg){

Employee employee=new Employee();

employee.name="Brandon";
employee.age= 50;
employee.salary=40000;

if (employee.age >= 20 && employee.age <= 40){

   employee.tax = employee.salary * 15/100;
   employee.salaryAfterTax = employee.salary - employee.tax;

}else if (employee.age >= 41 && employee.age <= 49){ 

   employee.tax = employee.salary * 10/100;
  employee.salaryAfterTax= employee.salary - employee.tax;


}else if (employee.age >= 50){

 employee.tax = employee.salary * 5/100;
 employee.salaryAfterTax = employee.salary - employee.tax;

}




System.out.println("you salary is:" + employee.salary);
System.out.println("your tax is :" + employee.salary);
System.out.println("your salaryAfter Tax is:" + employee.salary); 

}//end of main
}//end of application class


