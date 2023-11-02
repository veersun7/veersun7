const { compare, strLength, reverse } = require('./src/strings')

console.log('welcome from node js ....')

let str1 = 'Welcome'
let str2 = ''

let length = strLength(str1)
// ` mys custom string ${js experssions}`
console.log(`The length of the string ${str1} is ${length}`)
// console.log('The length of the string ' + str1 + 'is ' + length)

// 'hello' and 'Hello'
str1 = 'hello'
str2 = 'Hello'
let comparisonResult = compare(str1, str2)
console.log(`Comparing ${str1} and ${str2} === ${comparisonResult}`)

str1 = 'Red'
console.log(reverse(str1))