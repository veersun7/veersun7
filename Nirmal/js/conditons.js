// accept the name and age of an applicant
// if the applicant is an adult then his/her application must be accepted for voting
// otherwise his/her application must be rejected

let name = 'Ashish'
let age = 17

// age >= 18    means the applicant is an adult
// age < 18     means the applicant is a minor

if (age >= 18) {
    // if the applicant is an adult then execute this code
    console.log('Hello, ' + name + '. You are eligible to vote.')
} else {
    // if the applicant is a minor then execute this code
    console.log('Hello, ' + name + '. You are not eligible to vote.')
}

let hourOfTheDay = 1

// 1  -  5      Early morning
// 6  -  12     Good morning
// 12 -  15     Good Afternoon
// 15 -  20     Good Evening
// 20 -  23     Good night

// nested if
if (hourOfTheDay >= 1) { // true
    if (hourOfTheDay <= 5) { //true
        console.log('Early Morning')
    }
}

// if else
if (hourOfTheDay >= 1 && hourOfTheDay < 5) {
    console.log('Early Morning')
} else if (hourOfTheDay >= 5 && hourOfTheDay < 12) {
    console.log('Good Morning')
} else if (hourOfTheDay >= 12 && hourOfTheDay < 15) {
    console.log('Good Afternoon')
} else if (hourOfTheDay >= 15 && hourOfTheDay < 20) {
    console.log('Good Evening')
}else {
    console.log('Good Night')
}
