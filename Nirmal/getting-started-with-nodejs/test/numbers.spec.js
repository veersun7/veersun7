const { isEven, isOdd } = require('../src/numbers')
const expect = require('chai').expect

describe('testing the numbers.js', () => {

    describe('check the isEven function', function () {

        it('test isEven with an even number and expect it to be true', () => {
            expect(isEven(4)).to.be.true
        })
        it('test isEven with an od number and expect it to be false', () => {
            expect(isEven(5)).to.be.false
        })
    })

    describe('check the isOdd function', function () {

        it('test isOdd with an even number and expect it to be false', () => {
            expect(isOdd(4)).to.be.false
        })
        it('test isOdd with an od number and expect it to be true', () => {
            expect(isOdd(5)).to.be.true
        })
    })
})