// JAVASCRIPT CODING CHALLENGE

// 1. Calculate the sum of numbers within an array

const numArray = [7, 24, 16, 82, 78, 52, 0]

let sum = 0;
for (let num = 0; num < numArray.length; num++) {
  sum = sum + numArray[num];
}
console.log("The sum of numbers within an array is", sum);

