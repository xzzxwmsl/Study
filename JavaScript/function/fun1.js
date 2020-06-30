'use strict'
//如果没有return语句，函数执行完毕后也会返回结果，只是结果为undefined
function abs(x) {
    console.log('--')
    // if (typeof x !== 'number') {
    //     throw 'NaN!';
    // }
    if (x >= 0) return x;
    else return -x;
}
//由于JavaScript的函数也是一个对象，上述定义的abs()函数实际上是一个函数对象，而函数名abs可以视为指向该函数的变量。
//so 也可以定义为
var abs_ = function (x) {
    console.log('--')
    if (x >= 0) return x;
    else return -x;
}

console.log(abs(-1));
console.log(abs_(-1));

//由于JavaScript允许传入任意个参数而不影响调用，因此传入的参数比定义的参数多也没有问题，虽然函数内部并不需要这些参数：
console.log(abs(-2, 'haha'));
//also 可以少
console.log(abs());//NaN

function f1(x = 1) {
    return x;
}
console.log(`${f1(3)} and ${f1()}`);//默认值

//console.error(abs('xxx'));

//关键字arguments，它只在函数内部起作用，并且永远指向当前函数的调用者传入的所有参数。arguments类似Array但它不是一个Array
console.log('arguments');
function foo(x) {
    console.log('x = ' + x);
    for (var i in arguments) {
        console.log(i);
    }//index
    console.log('-------------');
    for (var i of arguments) {
        console.log(i);
    }//value
    console.log('-------------');
    for (var i = 0; i < arguments.length; i++) {
        console.log(`${i} and val is ${arguments[i]}`);
    }
}
foo(1, 2, 3, 'x');

//rest
//由于JavaScript函数允许接收任意个参数，于是我们就不得不用arguments来获取所有参数
function foo2(a, b) {
    var i, rest = [];
    if (arguments.length > 2) {
        for (i = 2; i < arguments.length; i++) {
            rest.push(arguments[i]);
        }
    }
    console.log('a = ' + a);
    console.log('b = ' + b);
    console.log(rest);
}
foo2(1, 1, 2, 2, 3, 3);

//ES6标准引入了rest参数，上面的函数可以改写为：
function foo3(a, b, ...rest) { // '...rest' but not 'rest'
    console.log('a = ' + a);
    console.log('a = ' + b);
    console.log(rest);
}
foo3(1, 1, 2, 2, 3, 3);