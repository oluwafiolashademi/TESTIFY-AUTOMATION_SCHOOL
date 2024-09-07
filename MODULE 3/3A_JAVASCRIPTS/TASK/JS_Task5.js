//1. Create a variable named day and Assign it a the current day of the week as string (eg, Thursday) 
//2. Create another variable name position and assign it a number which represents the
// position of the current day in days of the week. (eg, if today is Thursday, position should
// be assigned 4) 
//3. Create another variable named output and assign it a string that reads:
// Today is Thursday. It is the 4th day of the week. (Use string concatenation to add the
// variables declared in steps and 2 above)

const daysOfWeek = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
const today = new Date();
const day = daysOfWeek[today.getDay()];

const position = today.getDay() + 1;

const output = "Today is " + day + ". It is the " + position + (position === 1 ? "st" : position === 2 ? "nd" : position === 3 ? "rd" : "th") + " day of the week.";

console.log(output);

