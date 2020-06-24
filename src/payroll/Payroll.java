/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/** This code calculates the salary including bonus.
 * bonus is 10% of salary and applied to the employees whose salary is <=3000
 *  If salary is less than or equal to 3000,calculate a new salary with bonus.
 @author srinivsi
 */
public class Payroll 
{

   private double Salary;
   private double bonus;
   private String emp;
 
     /**constructor that takes the salary and employee name
      * 
      */
   Payroll(){}
   public Payroll(double Sal,String givenUser, double bonus)
        {
            Salary=Sal;
            emp=givenUser;
          
        }
   public double getSalary(){
   return Salary;
   }
   public void setSalary(double Salary){
    this.Salary=Salary;
   }
   public void setBonus(double bonus){
    this.bonus=bonus;
   }
   public double getBonus(){
   return (10/100)*Salary;
   }
  
   
}

      
     
    
    

