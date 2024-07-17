// My Personal Library 3
// Task

// You now have more books in your library. You should manage them all in one place. 
// Any idea how you can achieve that?... Arrays!

// Create a books array. 

// Each element of this array will be a book object. 

// Each book object will have the following properties

// title (string)

// description (string)

// numberOfPages (number)

// authour (string)

// reading (boolean)

// Use a for-loop to loop through the books array and log all books where the reading status is true to the console


const booksArray = [
    {
        title: 'Automation testing',
        description: 'Learning the step by step of Automation',
        numberOfPages: 20,
        author: 'Folashade Ayorinde-Akinola',
        reading: true,
        },
        {
        title: 'CI/CD PIPELINE',
        description: 'Learning how to automate the CI/CD pipeline with Jenkins',
        numberOfPages: 50,
        author: 'Folashade Ayorinde-Akinola',
        reading: true,
        },
        {
        title: 'JAVASCRIPTS',
        description: 'Learning Javascript programming language',
        numberOfPages: 120,
        author: 'Folashade Ayorinde-Akinola',
        reading: true,
        },
        {
        title: 'PYTHON',
        description: 'Learning python programming language',
        numberOfPages: 80,
        author: 'Folashade Ayorinde-Akinola',
        reading: false,
        }
];

for (let number = 0; number < booksArray.length; number++) {
    if (booksArray[number].reading){
        console.log('Book Title: ' +( booksArray[number].title) + ', Author: ' + (  booksArray[number].author));
    }
    // else{
    //     console.log('The reading status of the book is false');
    // }
  }

