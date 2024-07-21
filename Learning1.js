function mineFor(){
for (var x = 0; x <= 5; x = x+1) {
    console.log("Hello World! \nThis is a for loop");
}
}

function mineWhile(){
    let x = 0;
    while(x<=5) {
        console.log("Hello world! \n This is a while loop");
        x++;
    }
}

function mineDoWhile() {
    let x = 0;
    do { console.log("Hello world! \n I am in a do while loop");
        x++;
    }while(x<=5);
}
//The for in loop is used for non array objects 
//The for of loop is used for array objects


// Creating an object
let objectName =  {
    nameOfPerson: 'Kofi',
    age : 18,
}
console.log(objectName.nameOfPerson)
console.log(objectName.age)
objectName['nameOfPerson'] = "Ama";
objectName['New'] = 'A car';
console.log(objectName);

//Practicing a list 
let listName = ['Kofi', 'Ama','Juliet'];
listName[2] = "Ama";
console.log(typeof listName);
console.log(listName);



//Practicing another form of objects 
let school = {
    gender : 'female',
    getFunction : function(){
        return (`The gender of the person is ${school.gender}`)
    }
}
let school1 = Object.create(school);
school1.age = 30;
school1.name = 'KNUST';
school1.number  = 2355844;
//delete school1.number;// Deleting this property

for (let key in school1) {
    console.log(key)
}
console.log(school1.getFunction())



// Using a constructor
function person(first_name, last_name) {
	this.first_name = first_name;
	this.last_name = last_name;
}
// Creating new instances of person object
let person1 = new person('Mukul', 'Latiyan');
let person2 = new person('Rahul', 'Avasthi');

console.log(person1.first_name);
console.log(`${person2.first_name} ${person2.last_name}`);
