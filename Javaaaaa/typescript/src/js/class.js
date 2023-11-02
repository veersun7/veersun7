// class represents a entity
// Entity is a fact. Ex: emp details, student details
// Entity is also a transaction. Ex: money deposited, student pays a fees, student takes a test
// A class contains data of the entity and behaviour of the entity.
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

module.exports ={
    Circle
}
