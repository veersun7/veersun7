function add(a1 : number, a2 : number) : number{
return a1+a2;

}

// in this example we have used type annotation (number,varchar,string)
console.log(add(10,20));

function strconcat(st1: string, st2: string):string{
return st1 + st2;

};

function addelement(arr:number[],num:number): number[]{
    arr.push(num);
    return arr;
};

function removeelement(arr:number[]): number[]{
    arr.pop();
    return arr;
};

// how to write lambda expression in ts
let add1=(a1:number,a2:number): number =>{ 
    return a1+a2;
}

// how to use condition in typescript
// biggest of 3 numbers

    let biggest=(a1:number,a2:number,a3:number):number =>{
        let big:number
        if (a1>a2 && a1>a3) {
            big = a1
        }
        else if(a2>a3){
        big=a2
        }
        else{
            big=a3
        }

        return big
    }
    
// write typescript to sum all number between given range

let rangesum=(a:number,b:number):number =>{
    let rangesum : number = 0
    
    for (let i: number = a; i<=b;i++){
    rangesum = rangesum+i
    }
    return rangesum
    }

// how to use booleans:
// write a function to check if age is old age or not (>60)

let checkage = (age: number) : boolean =>{
    if (age >60){
        return true
    }
    else{
        return false
    }
}

// how to use tuple / record / row:
// Record is a group of items or fields
// we use this in simliar pattern of array but with different datatype of element

// create a employee record which return name of employee. Employee records contain ID, Name and salary

let returnempname = (a1:[string,string,number]):string=>{
    return a1[1];
}

// return record along with income tax (2%)

    let returnrecord = (a1:[string,string,number]):[string,string,number,number]=>{
        let x1:[string,string,number,number] = [a1[0],a1[1],a1[2],0]
        
        x1[3]=a1[2]*.2;
        return x1

    }

// rewrite above using json object

    var returnnamejson = (a1:{sid:string,name:string,nsalary:number}): string=>{
        return a1.name;
    }

    var returnrecordjson = (a1:{sid:string,name:string,salary:number}): {sid:string,name:string,salary:number,tax:number}=>{
        let x1 = {
            sid : a1.sid,
            name : a1.name,
            salary : a1.salary,
            tax : (a1.salary*.02)
        }
        return x1;
    }







