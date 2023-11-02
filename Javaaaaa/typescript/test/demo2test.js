
const assert = require('chai').assert;
const add = require("../src/js/demo2").add
const strconcat = require("../src/js/demo2").strconcat
const addelement = require("../src/js/demo2").addelement
const removeelement = require("../src/js/demo2").removeelement
const add1 = require("../src/js/demo2").add1
const biggest = require("../src/js/demo2").biggest
const rangesum = require("../src/js/demo2").rangesum
const checkage = require("../src/js/demo2").checkage
const returnempname = require("../src/js/demo2").returnempname
const returnrecord = require("../src/js/demo2").returnrecord
const returnnamejson = require("../src/js/demo2").returnnamejson
const returnrecordjson = require("../src/js/demo2").returnrecordjson


describe ("testing 10th August",()=>{

    it("add testing",()=>{
        let actual = add(10,20);
        let expected = 30;
        assert.equal(actual,expected);
    });

    it("concat two strings",()=>{
        let actual = strconcat("hi ","how are you");
        let expected = "hi how are you"
        assert.equal(actual,expected);
    });

    it("concat two strings with variable",()=>{
        let v1 = "good";
        let v2 = "morning";
        let actual = strconcat(v1,v2);
        let expected = v1+v2
        assert.equal(actual,expected);
    });

    it("add an element array", ()=>{
        let actual = addelement([10,20],30);
        assert.isArray(actual)
        assert.equal(actual.length,3)
        assert.equal(actual[2],30);

})

it("remove an element", ()=>{
    let actual = removeelement([10,20,30]);
    assert.isArray(actual)
    assert.notEqual(actual[2],20)
    assert.equal(actual.length,2);
});

it("add with lambda",()=>{
    let actual = add1(10,20)
    let expected = 30
    assert.equal(actual,expected)
})

it("biggest of 3 numbers",()=>{
    let actual = biggest (80,60,40)
    let expected = 80
    assert.equal(actual,expected)

})

it("sum of range",()=>{
    let actual = rangesum(2,5)
    let expected = 14
    assert.equal(actual,expected)
    })


    it("check old age",()=>{
        let actual = checkage(70)
        let expected = true
        assert.equal(actual,expected)
    })

    it("check not old age",()=>{
        let actual = checkage(45)
        let expected = false
        assert.equal(actual,expected)
    })

    it("get employee name",()=>{
        let actual = returnempname(['s001','Diana',25000])
        let expected = "Diana"
        assert.equal(actual,expected)

    })

    it("get record with tax",()=>{
        let actual = returnrecord(['s001','Diana',25000])
        let expected = ['s001', 'Diana',25000,500]
        assert.deepEqual(actual,expected)

    })

    it("get name json",()=>{
        let actual = returnnamejson({sid:'s001',name:'john',salary:30000})
        let expected = "john"
        assert.equal(actual,expected)
    })

    it("get record json",()=>{
        let actual = returnrecordjson({sid:'s001',name:'john',salary:30000})
        let expected = {sid: "s001", name: "john", salary: 30000, tax: 600}
        assert.deepEqual(actual,expected)
    })

});