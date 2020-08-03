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

Person.prototype.age;
Person.prototype.setAge = function(currentAge) {
    age = currentAge;
}
Person.prototype.getAge = function() {
    return age;
}

var person1 = new Person("Sam", "Thomas");
console.log(person1.firstName);
console.log(person1.lastName);
person1.setAge(10);
console.log(person1.getAge());

var person2 = new Person("Tom", "McGil");
console.log(person2.firstName);
console.log(person2.lastName);
person2.setAge(20);
console.log(person2.getAge());