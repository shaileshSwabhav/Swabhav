class Person {
    name: string
    id: number

    constructor(name: string, id: number) {
        this.name = name;
        this.id = id;
    }

    display = () => console.log(`Person name ${this.name} and ID is ${this.id}`);
    
}

let person1 = new Person("shailesh", 101);
person1.display();