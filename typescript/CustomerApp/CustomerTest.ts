import {Customer, Address} from "./Customer";

let cust1 = new Customer(101, "Sam");

console.log("ID: " + cust1.customerID);
console.log("Name: " + cust1.customerName);

cust1.customerName = "Tom"
console.log("New Name: " + cust1.customerName);

cust1.customerID = 102;
console.log("New ID: " + cust1.customerID);

let add1 = new Address('Mumbai');
console.log('Address: ' + add1.address);

