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

{
// Encapsulation example
class person {
	constructor(name, id) {
		this.name = name;
		this.id = id;
	}
	add_Address(add) {
		this.add = add;
	}
	getDetails() {
		console.log(`Name is ${this.name},
		Address is: ${this.add}`);
	}
}

let person1 = new person('Mukul', 21);
person1.add_Address('Delhi');
person1.getDetails();
}
{

// Abstraction example, 
//By defining the variables in a special way, we add abstractions to them . In this case , only some of the messages can be accessedssss
function person(fname, lname) {
	let firstname = fname;
	let lastname = lname;

	let getDetails_noaccess = function () {
		return (`First name is: ${firstname} Last 
			name is: ${lastname}`);
	}

	this.getDetails_access = function () {
		return (`First name is: ${firstname}, Last 
			name is: ${lastname}`);
	}
}
let person1 = new person('Mukul', 'Latiyan');
console.log(person1.firstname);
console.log(person1.getDetails_noaccess);
console.log(person1.getDetails_access());
}

 {
    // Inheritance example
class person {
	constructor(name) {
		this.name = name;
	}
	// method to return the string
	toString() {
		return (`Name of person: ${this.name}`);
	}
}
class student extends person {
	constructor(name, id) {
		// super keyword for calling the above 
		// class constructor
		super(name);
		this.id = id;
	}
	toString() {
		return (`${super.toString()},
		Student ID: ${this.id}`);
	}
}
let student1 = new student('Mukul', 22);
console.log(student1.toString());

 }
 {
    let objectName = {
        "name" : "Kofi",
        "age" : 12,
        "number": 15865265,
    }
    console.log(objectName.name)
 }
 //This converts the Json text to a javascript object

 fetch("Learning1.json") 
 .then(response => response.json())
 .then(values => console.log(values))
 {
    //another string that can convert a JSON file to javascript object 
    const jsonString = '{"name": "John", "age": 30}';
const jsonObject = JSON.parse(jsonString);
console.log(jsonObject.name); // Output: John
console.log(jsonObject.age); // Output: 30
 }

 {
	//Practicing decision making structures.
	let x, y, z;
	x=2;
	y = 5;
	z = 0;
	if(x>2){
		console.log("it is more than 2")
	}

	if (x<y)
		{console.log("The values are not equal")

		} else {
			console.log("A trial, so don't worry")

		}
	}
