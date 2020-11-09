export class Employee {
    empName: string
    empId: number

    constructor(empName: string, empId: number) {
        this.empName = empName;
        this.empId = empId;
    }

    display = () => console.log(`Employee Name is ${this.empName} and employee ID is ${this.empId}`);
    
}