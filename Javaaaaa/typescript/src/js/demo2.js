function add(a1, a2) {
    return a1 + a2;
}
// in this example we have used type annotation (number,varchar,string)
console.log(add(10, 20));
function strconcat(st1, st2) {
    return st1 + st2;
}
;
function addelement(arr, num) {
    arr.push(num);
    return arr;
}
;
function removeelement(arr) {
    arr.pop();
    return arr;
}
;
// how to write lambda expression in ts
var add1 = function (a1, a2) {
    return a1 + a2;
};
// how to use condition in typescript
// biggest of 3 numbers
var biggest = function (a1, a2, a3) {
    var big;
    if (a1 > a2 && a1 > a3) {
        big = a1;
    }
    else if (a2 > a3) {
        big = a2;
    }
    else {
        big = a3;
    }
    return big;
};
// write typescript to sum all number between given range
var rangesum = function (a, b) {
    var rangesum = 0;
    for (var i = a; i <= b; i++) {
        rangesum = rangesum + i;
    }
    return rangesum;
};
// how to use booleans:
// write a function to check if age is old age or not (>60)
var checkage = function (age) {
    if (age > 60) {
        return true;
    }
    else {
        return false;
    }
};
// how to use tuple / record / row:
// Record is a group of items or fields
// we use this in simliar pattern of array but with different datatype of element
// create a employee record which return name of employee. Employee records contain ID, Name and salary
var returnempname = function (a1) {
    return a1[1];
};
// return record along with income tax (2%)
var returnrecord = function (a1) {
    var x1 = [a1[0], a1[1], a1[2], 0];
    x1[3] = a1[2] * .02;
    return x1;
};
// rewrite above using json object
var returnnamejson = function (a1) {
    return a1.name;
};
var returnrecordjson = function (a1) {
    var x1 = {
        sid: a1.sid,
        name: a1.name,
        salary: a1.salary,
        tax: (a1.salary * .02)
    };
    return x1;
};

module.exports ={
    add,strconcat,addelement,removeelement,add1,biggest,rangesum,checkage,returnempname,returnrecord,returnnamejson,returnrecordjson
}
