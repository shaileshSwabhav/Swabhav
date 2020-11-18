"use strict";
exports.__esModule = true;
var std = [];
function printInfo(students) {
    for (var _i = 0, students_1 = students; _i < students_1.length; _i++) {
        var s = students_1[_i];
        std.push({
            id: s.id,
            name: s.name
        });
    }
    console.log(std);
}
printInfo([
    {
        id: 101,
        name: "sam",
        cgpa: 7.1
    },
    {
        id: 102,
        name: "tom"
    },
    {
        id: 103,
        name: "ben",
        cgpa: 6.2
    },
]);
