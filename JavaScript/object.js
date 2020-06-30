'use strict'
var SCU = {
    location: 'Si Chuan',
    City: 'ChengDu',
    Num_1: 100,
    'Num-2': 110
};

console.log(SCU["Num-2"] + " " + SCU.Num_1 + " " + SCU.location);
console.log('location' in SCU);
delete SCU.location;
console.log('location' in SCU);
SCU.location = 'SC';
console.log(SCU.location);
console.log(SCU.hasOwnProperty("location"));

for (var key in SCU) {
    console.log(key + "--" + SCU[key]); //SCU.key is wrong
}

var arr = [1, 2, '3', [4, 5]];
for (var i in arr) {
    console.log(i);
}