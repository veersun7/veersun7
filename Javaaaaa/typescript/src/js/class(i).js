let btn=document.querySelector("button#bt1")
btn.addEventListener("click",(event)=>{
event.preventDefault()
let r1=document.getElementById("r1").value
let obj = new Circle()
obj.setData(r1)
obj.calArea()
document.getElementById("out").value = obj.getArea()

})

var Circle = /** @class */ (function () {
    function Circle() {
        var _this = this;
        // A lamda expression is created to take the value of radius
        this.setData = function (r) {
            _this.radius = r;
        };
        this.calArea = function () {
            _this.area = 3.14 * (_this.radius * _this.radius);
        };
        this.getArea = function () {
            return _this.area;
        };
    }
    return Circle;
}());