// JAVASCRIPT CODING CHALLENGE

// 10. Create a function that filters out negative numbers.

// function filters(numbers){
//     for (let num = 0; num < number.length; num++) {
//         if (numbers[num] < 0){
//             console.log(('${numbers[num]} is a negative number'))
//         }
//         else{
//             console.log(('${numbers[num]} is a positive number'))
//         }
//     }
// }
// filters([-5, 0, 7, -2, 10]);


function filterPositives(numbers) {
    const positiveNumbers = numbers.filter(num => num >= 0);
    return positiveNumbers;
  }
  
  const numbers = [-5, 0, 7, -2, 10];
  const filteredNumbers = filterPositives(numbers);
  console.log(filteredNumbers); // Output: [0, 7, 10]