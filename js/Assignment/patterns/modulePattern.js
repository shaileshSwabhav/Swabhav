var person = (function () {
    var firstName = "Sam";
    var lastName = "Thomas";

    return {
        getFirstName: function() {
            return firstName;
        },
        getLastName: function() {
            return lastName;
        },
        setFirstName: function(name) {
            firstName = name;
        },
        setLastName: function(name) {
            lastName = name;
        }
    }

}) ();

console.log(person.getFirstName());
console.log(person.getLastName());

person.setFirstName("Tom");
person.setLastName("Domingo");

console.log(person.getFirstName());
console.log(person.getLastName());
