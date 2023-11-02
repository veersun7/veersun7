// Create a list of fruits with their properties (name, color, pricePerKg)
// and convert it into a format so that for a given fruit name
// retrieval of its color and pricePerKg value is fast


// Write your code here

const fruitArray=[
    {name:'pineapple',color:'yellow',price:200},
    {name:'apple',color:'red',price:250},
    {name:'watermelon',color:'green',price:90},
    {name:'orange',color:'orange',price:85},
]
const convertToobj = (fruitArray1,keyfield)=>
fruitArray1.reduce((obj,item) => {
    obj[item[keyfield]]=item;
    return obj;
}, {});
const fruitobj = convertToobj(fruitArray,'name');
console.log(fruitobj);
console.log(fruitobj.pineapple);
console.log(fruitobj.apple);
console.log(fruitobj.watermelon);
console.log(fruitobj.orange);

module.exports = fruitobj
