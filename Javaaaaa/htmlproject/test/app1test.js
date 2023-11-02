const assert = require('chai').assert
const h1 = require('../Src/js/app1').h1
const add = require('../Src/js/app1').add
const evenodd = require('../Src/js/evenorodd').evenodd
const numpyramid = require('../Src/js/evenorodd').numpyramid

describe("testing module app",()=>{
// it("testing h1",()=>{
// let actual = h1();
// let expected = "welcome to testing";
// assert.equal(actual ,expected);
// });

// it("testing add",()=>{
//   let actual = add(10,20);
//   let expected = 30;
//   assert.equal(actual ,expected);
// });


it ("Testing Even Number",()=>{
    let actual = evenodd(20);
    let expected = 'even';
    assert.equal(actual ,expected);

})

it ("Testing Odd Number",()=>{
    let actual = evenodd(21);
    let expected = 'odd';
    assert.equal(actual ,expected);

})

it ("Testing Not numeric value",()=>{
    let actual = evenodd("ebc");
    let expected = 'non numeric';
    assert.equal(actual ,expected);

})

it ("Testing negative Number",()=>{
    let actual = evenodd(-10);
    let expected = 'even';
    assert.equal(actual ,expected);

})
it ("Testing no value",()=>{
    let actual = evenodd(null);
    let expected = 'non numeric';
    assert.equal(actual ,expected);

})

it ("Testing numpyramid 3",()=>{
    let actual = numpyramid(3);
    let expected = '  * \n * * \n* * * \n';
    console.log(actual)
    
    assert.equal(actual ,expected);

})

});