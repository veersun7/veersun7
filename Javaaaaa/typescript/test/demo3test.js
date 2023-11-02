const assert = require("chai").assert
const enumdemo = require("../src/js/demo3").enumdemo
const addunion = require("../src/js/demo3").addunion
const caltax = require("../src/js/demo3").caltax

describe ("testing 11th August",()=>{
    it ("enum demo",()=>{
        let actual = enumdemo(1)
        let expected = "red"
        assert.equal(actual,expected)

    })

    it ("add union 2 numbers", ()=>{
        let actual = addunion(6,7)
        let expected = 13
        assert.equal(actual,expected)
    })

    it ("add union 2 string", ()=>{
        let actual = addunion("6","7")
        let expected = 13
        assert.equal(actual,expected)
    })

    it ("add union 1 number 1 string", ()=>{
        try {
        let actual = addunion("6",7)
        let expected = 13
        assert.fail()
        }catch (err){
            assert.equal(err.message,"Data type mismatch")
        }
    })

    it("interface test",()=>{
        let actual = caltax({sid: "s001", name:"Diana",salary:30000})
        let expected = {sid:"s001", name: "Diana",salary:30000,tax:600 }
        assert.deepEqual(actual,expected)
    })


})