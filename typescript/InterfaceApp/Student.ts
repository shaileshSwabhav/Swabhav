import {IStudent} from "./interface"

let std=[];

function printInfo(students: IStudent[]) {
    for(let s of students) {
        std.push({
            id: s.id,
            name: s.name,
        })
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
        name: "tom",
    },    
    {
        id: 103,
        name: "ben",
        cgpa: 6.2
    },
])
