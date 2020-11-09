var Person = /** @class */ (function () {
    function Person(name, id) {
        var _this = this;
        this.display = function () { return console.log("Person name " + _this.name + " and ID is " + _this.id); };
        this.name = name;
        this.id = id;
    }
    return Person;
}());
var person1 = new Person("shailesh", 101);
person1.display();
