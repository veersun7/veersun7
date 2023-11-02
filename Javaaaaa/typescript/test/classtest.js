
const assert = require("chai").assert
const Circle = require("../src/js/democlass").Circle

describe("Testing Classes",()=>{
    it("test circle",()=>{
        let obj = new Circle();
        obj.setData(4);
        obj.calArea();
        let actual = obj.getArea();
        let expected = 3.14*(4*4)
        assert.equal(actual,expected)

    })

})