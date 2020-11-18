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
    return Employee;
}());
exports.Employee = Employee;
