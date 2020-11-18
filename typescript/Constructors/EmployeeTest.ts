import { Employee } from "./Employee"

let emp1 = new Employee();
emp1.display();

emp1.EmpName = "Sam";
console.log('Name: ' + emp1.EmpName);
emp1.display();

emp1.EmpId = 102;
console.log('ID: ' + emp1.EmpId);
emp1.display();

