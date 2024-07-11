//To write a JavaScript program that shows the text, Hello, world! As an alert on the browser.
alert('Hello world!')

//To use concanate
const myFavouriteLanguage = "Javascripts"
const age = 20
const name = "Folashade"
const sentence = 'My name is ' + name + ',' + 'I am ' + age + 'years old'

console.log(sentence)


alert('Hello world!')

const subject = "Javascript";

const age = 28;

alert(subject)
alert(age)

console.log(age)
console.log(AGE)

//Variables
var myFavouriteLanguage = "Javascript";
myFavouriteLanguage = "Python";

let myage = 28;
myage = 16;

const mySubject = "Biology";
//mySubject = "Physics";

console.log(age)
console.log(myFavouriteLanguage)
console.log( mySubject)

//Check Data type
console.log(typeof(age))
console.log(typeof(myFavouriteLanguage))
console.log(typeof(mySubject))

//To perform Arithemetric
const addAge = 20;

console.log(addAge + 30)

//Addition and subtraction
//To perform Arithemetric using numbers
const addAge = 20;

console.log(addAge + 30)
console.log(addAge * 3)
console.log(addAge - 10)
console.log(addAge - 30)
console.log(addAge / 2)

const multiplyAge = addAge * 20

console.log(multiplyAge)

//To use strings
const myFavouriteLanguage = "Javascript"

console.log('My Favourite Language is '+ myFavouriteLanguage)


//CONDITIONAL STATEMENT
// IF..ELSE IF ...IF STATEMENT
const age = 78
if (age >= 18 && age <= 65){
    console.log("You are eligible to vote")
}
else if (age > 65){
    console.log("You are too old to vote")
}
else{
    console.log("You are too young to vote")
}


// IF..ELSE IF ...IF STATEMENT
const day = 'Thursday'
if (day === 'Friday'){
    console.log("TGIF")
}
else if (day === 'Saturday'){
    console.log("Yeh! The weekend is here")
}
else if (day === 'Sunday'){
    console.log("Happy Sunday!")
}
else{
    console.log("Go to work!")
}


//SWITCH STATEMENT
const day = 'Thursday'
switch(day){
    case 'Friday':
        console.log("TGIF")
        break
    case 'Saturday':
        console.log("Yeh! The weekend is here")
        break
    case 'Sunday':
        console.log("Happy Sunday!")
        break
    default:
        console.log("Go to work!")
}



//WHILE LOOP CONDITION
// let star = 1 //starting point

// while(star <= 10){
//     console.log(star + ' star')
//     star = star + 1
// }

let star = 1

while(star <= 10){
    if(star === 1){
        console.log(star + ' star') 
    }
    else{
        console.log(star + ' stars')
    }
    star = star + 1
}





//FOR LOOP CONDITION

// for(let star = 0; star <= 10; star = star+1){
//     console.log(star + ' star')
// }

// let star = 1

// for(let star = 0; star <= 10; star = star+1){
//     if(star === 1 || star === 0){
//         console.log(star + ' star') 
//     }
//     else{
//         console.log(star + ' stars')
//     }
// }

let number = 1

for(let number = 0; number <= 10; number = number+1){
    if(number % 2 === 0){
        console.log(number + ' is an even number') 
    }
    else{
        console.log(number + ' is an odd number')
    }
}





// Functions

function MyFunction(){
    console.log("My First Function")
}
MyFunction();

function greeting(){
    console.log("Good morning")
}
greeting();

function greeting(name){
    console.log("Good morning" + name);
}
greeting("Buchi");
greeting(name);

function addNumbers(firstNumber, secondNumber){
    const sum = firstNumber + secondNumber;
    console.log(sum);
}
addNumbers(30, 40);



//Functions with return values
function addNumbers(firstNumber, secondNumber){
    const sum = firstNumber + secondNumber;
    return sum;
}
console.log(addNumbers(30, 40));

const moreOp = addNumbers(30, 40) + 20;
console.log(moreOp);


//How to return two values
//Functions with return values
function Numbers(firstNumber, secondNumber){
    const sum = firstNumber + secondNumber;
    const product = firstNumber * secondNumber;
    return [sum, product];
}
console.log(Numbers(30, 40));


//A function to converters currency
function converter(dollar){
    //convert to naira and return an equivalent dollar value
    //conversion rate: 410 to 1 dollar

    const naira = dollar * 410;
    return naira;
}
const nairaValue = converter(100);
console.log(nairaValue);




// FUNCTIONS AND SCOPES
//Global scope
const myName = 'Folashade';

function greet(){
    console.log ("Good morning, " + "myName");
}
greet();

//Function scope or local variable
function greet(){
    console.log ("Good morning, " + "myName");
    function innerGreet(){
        console.log ("Good evening, " + "myName");
    }
    innerGreet();
}
greet();



// //Expressed function with wrong response
// //Function Declaration
// const myGreet = function greet(name)
// {
//     console.log ("Good morning, " + "myName");
// };
// greet(Nick);



//Expressed function with right response
const OurGreet = function(name)
{
    console.log ("Good morning, " + "myName");
};
greet(Nick);



//Callback function 
//Example 1
function greetings(greet)
{
    greet();}
    greetings(function(){
        console.log ("Good morning, ");
});
    

//Example 2
function greetings(greet)
{
    greet();
}
    function Callback(){
        console.log ("Good morning, ");
}
greetings(Callback);
    