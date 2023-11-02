let name = 'Ashish'

let myFavouriteBooks = ['Life is What You Make It', 'Animal Farm', 'The Old Man And The Sea']
let skills = ['Java', 'Javascript', 'CSS', 'HTML']
let batches = []

// console.log(myFavouriteBooks)
console.log('Printing the skills')
console.log(skills)

// Push adds value at the end of the array
console.log('Adding one more skill')
skills.push('REST', 'Microservices')
console.log(skills)

// Popping works on the last element in the array
batches.push('Natwest Reskilling Program', 'Natwest Fullstack Program')
console.log('Popping the value')
console.log('Popped Value Is ' + skills.pop())  
console.log(skills)

// Shifting works on the first element in the array
console.log('Shift method in the array')
console.log('Shifted Value Is ' + skills.shift())  
console.log(skills)

// Unshift addes values to the start of the array
console.log('unshift method in the array')
skills.unshift('RWD')
console.log(skills)