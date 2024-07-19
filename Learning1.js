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
console.log(typeof listName)
console.log(listName)