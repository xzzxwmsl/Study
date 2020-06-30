//ES6标准引入了新的iterable类型，Array、Map和Set都属于iterable类型。
//具有iterable类型的集合可以通过新的for ... of循环来遍历。
'use strict'
var a = ['A', 'B', 'C'];
var s = new Set(['A', 'B', 'C']);
var m = new Map([[1, 'x'], [2, 'y'], [3, 'z']]);

for (var x of a) {
    console.log(x);
}
for (var x of s) {
    console.log(x);
}
for (var x of m) {
    console.log(`${x[0]} and ${x[1]}`);//key-value
}

console.log("---------------");


//for ... in循环由于历史遗留问题，它遍历的实际上是对象的属性名称。一个Array数组实际上也是一个对象，它的每个元素的索引被视为一个属性。
var a = ['A', 'B', 'C'];
a.name = 'Hello';
for (var x in a) {
    console.log(x); // '0', '1', '2', 'name'
}//实际上遍历的对象的索引，对于数组来说当然就是其下标

console.log("len is " + a.length);//实际上并没有添加name进去
for (var x of a) {
    console.log(x);
}

a.forEach(function (ele, index, arr) {
    console.log(`${ele} is in pos ${index}`)
});
m.forEach(function (val, key, map) {
    console.log(`${val}'s key is ${key}`)
});

var SCU = {
    location: 'Si Chuan',
    City: 'ChengDu',
    Num_1: 100,
    'Num-2': 110
};

for(var i in SCU){
    console.log(i);
}
// for(var i of SCU){
//     console.log(i);
// } 一个普通对象不可以使用 for of ，因为他不是一个iterable