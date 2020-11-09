export class Customer {

    constructor(private _id, private _name) {}

    get customerName() {
        return this._name;
    }

    get customerID() {
        return this._id;
    }

    set customerName(custName) {
        this._name = custName;
    }

    set customerID(custID) {
        this._id = custID;
    }

}

export class Address {

    constructor(private _address) {}

    get address() {
        return this._address
    }
}