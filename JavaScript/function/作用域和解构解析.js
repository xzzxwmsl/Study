'use strict';
//如果内部函数和外部函数的变量名重名
function foo() {
    var x = 1;
    function bar() {
        var x = 'A';
        console.log('x in bar() = ' + x); // 'A'
    }
    console.log('x in foo() = ' + x); // 1
    bar();
}

foo();
//这说明JavaScript的函数在查找变量时从自身函数定义开始，从“内”向“外”查找。如果内部函数定义了与外部函数重名的变量，则内部函数的变量将“屏蔽”外部函数的变量。

//变量提升
//
//JavaScript的函数定义有个特点，它会先扫描整个函数体的语句，把所有申明的变量“提升”到函数顶部
function fun() {
    var x = 'hello' + ' ' + y;
    console.log(x);
    var y = 'x';
}

fun();
/*
虽然是strict模式，但语句var x = 'Hello, ' + y;
并不报错，原因是变量y在稍后申明了。但是console.log显示Hello, undefined，
说明变量y的值为undefined。这正是因为JavaScript引擎自动提升了变量y的声明，但不会提升变量y的赋值。
JavaScript引擎看到的代码相当于:
function fun() {
    var y;
    var x = 'hello' + ' ' + y;
    console.log(x);
    y = 'x';
}
由于JavaScript的这一怪异的“特性”，我们在函数内部定义变量时，请严格遵守“在函数内部首先申明所有变量”这一规则。
*/

//全局作用域
/*
不在任何函数内定义的变量就具有全局作用域。实际上，JavaScript默认有一个全局对象window，全局作用域的变量实际上被绑定到window的一个属性：
'use strict';
var course = 'Learn JavaScript';
alert(course); // 'Learn JavaScript'
alert(window.course); // 'Learn JavaScript'
因此，直接访问全局变量course和访问window.course是完全一样的。
你可能猜到了，由于函数定义有两种方式，以变量方式var foo = function () {}
定义的函数实际上也是一个全局变量，因此，顶层函数的定义也被视为一个全局变量，并绑定到window对象：
*/

//名字空间
/*
全局变量会绑定到window上，不同的JavaScript文件如果使用了相同的全局变量，或者定义了相同名字的顶层函数，都会造成命名冲突，并且很难被发现。
减少冲突的一个方法是把自己的所有变量和函数全部绑定到一个全局变量中。例如
*/

var NameSpace1 = {};//可能可以当作一个空对象来处理

NameSpace1.name = 'scu';
console.log(typeof NameSpace1);

//由于JavaScript的变量作用域实际上是函数内部，我们在for循环等语句块中是无法定义具有局部作用域的变量的
function fun1() {
    for (var i = 0; i < 100; i++) {

    }
    console.log(i);//true
    for (let j = 0; j < 100; j++) {

    }
    //console.log(j); //error

}

fun1();

//ES6中引入了 const 表示常量
const he = 10;
const she = 'xx';
//he=11,she='ww'; //不可以对const再次赋值
console.log(`${she} and ${he}`);

//解构赋值

var [x, y, z] = [1, 2, 3];

var person = {
    name: '小明',
    age: 20,
    gender: 'male',
    passport: 'G-12345678',
    school: 'No.4 middle school',
    address: {
        city: 'Beijing',
        street: 'No.1 Road',
        zipcode: '100001'
    }
};
var { name, age, passport,address:{city,zipcode} } = person;
console.log('name = ' + name + ', age = ' + age + ', passport = ' + passport);
console.log(`city : ${city} and zipcode : ${zipcode}`);
// 注意: address不是变量，而是为了让city和zip获得嵌套的address对象的属性:
//address; // Uncaught ReferenceError: address is not defined

/* 
有些时候，如果变量已经被声明了，再次赋值的时候，正确的写法也会报语法错误：
// 声明变量:
var x, y;
// 解构赋值:
{x, y} = { name: '小明', x: 100, y: 200};
// 语法错误: Uncaught SyntaxError: Unexpected token =
这是因为JavaScript引擎把{开头的语句当作了块处理，于是=不再合法。解决方法是用小括号括起来：
({x, y} = { name: '小明', x: 100, y: 200});
 */