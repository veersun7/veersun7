
// check for strict equality between two strings
const compare = (str1, str2) => {
    return (str1 === str2) // true or false
}

// find the length of the string: strLength()
const strLength = (str) => {
    return str.length
}

const reverse = (str) => {
    return str.split('').reverse().join('')
}

// export functions in  a js module so that it can be accessed
// outside the module

module.exports = { compare, strLength, reverse }