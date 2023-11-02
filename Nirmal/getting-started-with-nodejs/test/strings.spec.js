// Import the chai expect library
const expect = require('chai').expect

// Importing the code to be tested
const { compare, reverse, strLength } = require('../src/strings')


describe('testing the strings.js', function () {
    describe('testing the strLength() method', function () {
        // writing my first test case to check the strLength method
        it('expect strLength("welcome") to be equal to 7', () => {
            let length = strLength('welcome')
            expect(length).to.equal(7)
        })
    })

    describe('testing the comapre() method', function () {
        // testing compare('Hello', 'Hello') and expceting it to be true
        it('expect compare("Hello", "Hello") to return true', () => {
            expect(compare("Hello", "Hello")).to.be.true
        })

        // testing compare('Hello', 'hello') and expceting it to be false
        it('expect compare("Hello", "hello") to return false', () => {
            expect(compare("Hello", "hello")).to.be.false
        })
    })

    describe('testing the reverse() method', function () {
        it('expect reverse("hello") to be equal olleh', () => {
            expect(reverse('Hello')).to.deep.equal('olleH')
        })
    })
})