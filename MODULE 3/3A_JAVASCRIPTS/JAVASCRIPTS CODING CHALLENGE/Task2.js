// JAVASCRIPT CODING CHALLENGE

// 2. Create a length converter function.

function lengthConverter(value, initialUnit, finalUnit) {

    // Conversion factors
    const meterConversion = {
    m: 1,                           //meter
    km: 1000,                       //kilometer
    dm: 0.1,                        //decimeter
    cm: 0.01,                       //centimeter
    mm: 0.001,                      //millimeter
    µm: 1.0E-6,                     //micrometer
    nm: 1.0E-9,                     //nanometer
    mi: 1609.344,                   //mile
    yd: 0.9144,                     //yard
    ft: 0.3048,                     //feet
    in: 0.0254                      //inch
    };
        
    // Convert the value from meters to the target unit
    const lengthValue = value * meterConversion[initialUnit] / meterConversion[finalUnit];
        
    return lengthValue;
}

console.log(lengthConverter(10, 'cm', 'm')); 
console.log(lengthConverter(6, 'in', 'm')); 
console.log(lengthConverter(2.5, 'km', 'cm')); 
console.log(lengthConverter(5, 'mm', 'km'))
console.log(lengthConverter(100, 'yd', 'mm'))

