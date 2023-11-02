// Write a program to display one result card of 100 students
// with their name and percentage
// Out of 100 students, 50 has subjects - Grammer and Accounts
// and other 50 has subjects -  Grammer and Physics

// Hint : You need to calculate percentage of 100 students having different set of subjects.
//        You can assume their scores on their respective subjects.


// Write your code here

const results=()=>{
    const studentsList=[
        {name:'dina',subjects:[{subject:'Grammer',marks:100},{subject:'Accounts',marks:75}]},
        {name:'vasu',subjects:[{subject:'Grammer',marks:82},{subject:'Accounts',marks:88}]},
        {name:'jony',subjects:[{subject:'Grammer',marks:40},{subject:'Accounts',marks:99}]},
        {name:'rajesh',subjects:[{subject:'Grammer',marks:55},{subject:'Accounts',marks:60}]},
        {name:'barath',subjects:[{subject:'Grammer',marks:24},{subject:'Accounts',marks:57}]},
        {name:'varun',subjects:[{subject:'Grammer',marks:38},{subject:'Accounts',marks:92}]},
        {name:'mohan',subjects:[{subject:'Grammer',marks:50},{subject:'Accounts',marks:47}]},
        {name:'james',subjects:[{subject:'Grammer',marks:73},{subject:'Physics',marks:77}]},
        {name:'henry',subjects:[{subject:'Grammer',marks:87},{subject:'Physics',marks:89}]},
        {name:'david',subjects:[{subject:'Grammer',marks:55},{subject:'Physics',marks:95}]},
        {name:'liam',subjects:[{subject:'Grammer',marks:67},{subject:'Physics',marks:66}]},
        {name:'antony',subjects:[{subject:'Grammer',marks:32},{subject:'Physics',marks:59}]},
        {name:'daniel',subjects:[{subject:'Grammer',marks:48},{subject:'Physics',marks:95}]},
        {name:'thomas',subjects:[{subject:'Grammer',marks:53},{subject:'Physics',marks:52}]}
    ]
    const result=()=>
    studentsList.reduce((obj,item)=>{

        let percenRes=item.subjects.reduce(()=>{
            return (item.subjects[0].marks+item.subjects[1].marks)/item.subjects.length;
        }, {})
        console.log({ 'name':item.name,'percentage':percenRes});
    }, {})
    const finResult=result(studentsList);
    return finResult;
}
results();

module.exports = results
