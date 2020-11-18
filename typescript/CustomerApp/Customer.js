"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Address = exports.Customer = void 0;
var Customer = /** @class */ (function () {
    function Customer(_id, _name) {
        this._id = _id;
        this._name = _name;
    }
    Object.defineProperty(Customer.prototype, "customerName", {
        get: function () {
            return this._name;
        },
        set: function (custName) {
            this._name = custName;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "customerID", {
        get: function () {
            return this._id;
        },
        set: function (custID) {
            this._id = custID;
        },
        enumerable: false,
        configurable: true
    });
    return Customer;
}());
exports.Customer = Customer;
var Address = /** @class */ (function () {
    function Address(_address) {
        this._address = _address;
    }
    Object.defineProperty(Address.prototype, "address", {
        get: function () {
            return this._address;
        },
        enumerable: false,
        configurable: true
    });
    return Address;
}());
exports.Address = Address;
