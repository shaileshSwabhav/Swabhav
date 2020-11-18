"use strict";
exports.__esModule = true;
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(empName, empId) {
        var _this = this;
        this.display = function () { return console.log("Employee Name is " + _this.empName + " and employee ID is " + _this.empId); };
        this.empName = empName;
        this.empId = empId;
    }
    Object.defineProperty(Employee.prototype, "EmpName", {
        get: function () {
            return this.empName;
        },
        set: function (empName) {
            this.empName = empName;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "EmpId", {
        get: function () {
            return this.empId;
        },
        set: function (empId) {
            this.empId = empId;
        },
        enumerable: false,
        configurable: true
    });
    return Employee;
}());
exports.Employee = Employee;
