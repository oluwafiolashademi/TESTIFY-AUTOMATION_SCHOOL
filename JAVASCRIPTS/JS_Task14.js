// My Personal Library 2
// Task

// Add a toggleReadingStatus method to your books objects. 

// The method should update the value of the reading property of the book object.

// Remember to log the reading property to the console to confirm the current status.


const book = {
    title: 'Automation Journey',
    description: 'This explains my Automation Journey',
    numberOfPages: 120,
    author: 'Folashade Ayorinde-Akinola',
    reading: true,
    toggleEvent(){
        if (this.reading === true){
            console.log('The reading status of the book ' +( this.title) + ' is now ' + ( this.reading));
        }
        else{
            console.log('The reading status of the book is false');
        }
    }
};
book.toggleEvent();
