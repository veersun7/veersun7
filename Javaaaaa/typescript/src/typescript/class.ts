// class represents a entity
// Entity is a fact. Ex: emp details, student details
// Entity is also a transaction. Ex: money deposited, student pays a fees, student takes a test
// A class contains data of the entity and behaviour of the entity.

class Circle{
    radius : number;
    area : number;
    // A lamda expression is created to take the value of radius

    setData = (r:number):void=>{
    this.radius=r;

    }

    calArea = ():void=>{
        this.area = 3.14 * (this.radius * this.radius)

    }

    getArea = ():number=>{
        return this.area
    }

}