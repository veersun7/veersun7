
// Javascript file named index.js
/**
 * We will be creating some basic JS code and learning how to run it from the nodejs 
 * environment
 * 
 * Javascript filess will have a .js extention, examples index.js, script.js
 * 
 * To execute a .js file in the node runtime we write the following command
 * node <file-name>.js
 */

console.log('Hello world from JS')

// Declaring variables
// Variables are containers that allows us to store data
// Using the let keyword
let firstName = 'Ashish'
let lastName = 'Panicker'

// Using the var keyword
// Usage of var keyword is strictly discouraged
var email = 'ashish.s'

// Using the const keyword
// const is used to create constant variable
const workHours = 8

// Using nothing
// This approach is not recommended
// gender = 'male'
let gender = 'Male'

console.log('Fullname is ' + firstName + ' ' + lastName)

let fullName = 'Fullname is ' + firstName + ' ' + lastName
console.log(fullName)

// Operators
// Arithematic Operators
console.log('Arithematic Operators')
console.log(5 + 2)
console.log(5 - 2)
console.log(5 * 2)
console.log(5 / 2)
console.log(5 ** 2) // exponent
console.log(5 % 2)  // modulus -> gived remainder
// console.log(++5)
// console.log(--5)

// Assignment Operators
let n = 10
n = n + 5
console.log(n)
// Comaprison Operators
console.log(5 == 5)
// Logical Operators
// Conditional Operators

// datatypes
// String, Number, Booleans
// Ternary expression
// expression ? True part : False part

console.log(age >= 18 ? "Eligible to vote" : "Not Eligible to vote")

if (age >= 18) {
    console.log("Eligible to vote")
} else {
    console.log("not Eligible to vote")
}
