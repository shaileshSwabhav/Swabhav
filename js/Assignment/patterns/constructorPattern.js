function Person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    
    this.getFirstName = function() {
        return this.firstName;
    }
    this.getLastName = function() {
        return this.lastName;
    }
}

var person1 = new Person("Sam", "Thomas");
console.log(person1.firstName);
console.log(person1.lastName);
