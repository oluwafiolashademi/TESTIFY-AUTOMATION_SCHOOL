// JAVASCRIPT CODING CHALLENGE

// 10. Create a function that filters out negative numbers.

function filternegatives(numbers) {
    //const positiveNumbers = numbers.filter(num => num >= 0);
    const negativeNumbers = numbers.filter(num => num < 0);
    return negativeNumbers;
  }
  
  const numbers = [-5, 0, 7, -2, 10];
  const filteredNumbers = filternegatives(numbers);
  console.log(filteredNumbers); // Output: [0, 7, 10]

