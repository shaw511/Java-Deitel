public class PayrollSystemTest {
   public static void main(String[] args) {
      // create subclass objects                                          
      SalariedEmployee salariedEmployee =                                 
         new SalariedEmployee("John", "Smith", 111111111, 800.00);     
      CommissionEmployee commissionEmployee =                             
         new CommissionEmployee(                                          
         "Sue", "Jones", 333333333, 10000, .06);                      
      BasePlusCommissionEmployee basePlusCommissionEmployee =             
         new BasePlusCommissionEmployee(                                  
         "Bob", "Lewis", 444444444, 5000, .04, 300);                  

      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n", 
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings());

      // create four-element Employee array
      Employee[] employees = new Employee[3]; 

      // initialize array with Employees        
      employees[0] = salariedEmployee;             
      employees[1] = commissionEmployee;        
      employees[2] = basePlusCommissionEmployee;

      System.out.printf("Employees processed polymorphically:%n%n");

      // generically process each element in array employees
      for (Employee currentEmployee : employees) {
         System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } 

         System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());
      } 

      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++) {      
         System.out.printf("Employee %d is a %s%n", j,  
            employees[j].getClass().getName());         
      }                                                 
   } 
} 