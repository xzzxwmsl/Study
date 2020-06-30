'use strict'
var num1 = 100;
var num2 = 1e2;
var num3 = 123.45;
var num4 = NaN;
var num5 = Infinity;
console.log(num1 === num2);//使用==会强制转类型，不推荐使用
console.log(1===10);
console.log(1=='x');
console.log(1==='x');
console.log(isNaN(num4));


//字符串是不可变的，如果对字符串的某个索引赋值，不会有任何错误，但是，也没有任何效果
//JavaScript为字符串提供了一些常用方法，注意，调用这些方法本身不会改变原有字符串的内容，而是返回一个新字符串
var str1 = "xzz";
var str2 = `这是个多行
字符串
哦`
var str3="xw";
var str4="hahaha";

var s1=str1+" "+str4+" "+str3;
var s2=`${str1} ${str4} ${str3}`;//注意是反括号

console.log(s1)
console.log(s2);
console.log(str2);

console.log("------------------------------")

var s="hello, world!";
var sp=`I'm your father "'"'"`;

console.log(s.length);
console.log(s.substring(0, 5)); // 从索引0开始到5（不包括5），返回'hello'
console.log(s.substring(7)); // 从索引7开始到结束，返回'world'

console.log(s.indexOf('wor'));//返回位置
console.log(s.indexOf('Wor'));//无则返回-1
console.log(sp.toUpperCase());