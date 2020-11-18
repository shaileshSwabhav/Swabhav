export class Employee {
    private empName: string;
    private empId: number;

    constructor(empName?: string, empId?: number) {
        this.empName = empName;
        this.empId = empId;
    }

    get EmpName(): string {
        return this.empName;
    }
    
    set EmpName(empName: string) {
        this.empName = empName;
    }

    get EmpId(): number {
        return this.empId;
    }
    
    set EmpId(empId: number) {
        this.empId = empId;
    }
    
    display = () => console.log(`Employee Name is ${this.empName} and employee ID is ${this.empId}`);
    
}