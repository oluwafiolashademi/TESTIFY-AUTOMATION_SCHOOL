// JAVASCRIPT CODING CHALLENGE

// 9. Return the number of vowels in a string.
const letters = ("Learning Javascript to upskill in Automation Testing")

function vowelsNum(string) {
    let Vowels = "aAeEiIoOuU";
    let vowelsCount = 0;
    
    for (let num = 0; num < string.length; num++) { 
        if (Vowels.includes(string[num])){
            vowelsCount++;
        }
    }
    return vowelsCount;    
}
console.log(vowelsNum(letters))
