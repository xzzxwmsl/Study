'use strict'
var v1 = null;
console.log(v1 == null);
console.log(v1 === null);
//Array可以通过索引把对应的元素修改为新的值，因此，对Array的索引进行赋值会直接修改这个Array
var arr = ['A', 'B', 'C'];
arr[1] = 99;// arr现在变为['A', 99, 'C']
console.log(arr);

//请注意，如果通过索引赋值时，索引超过了范围，同样会引起Array大小的变化：
//大多数其他编程语言不允许直接改变数组的大小，越界访问索引会报错。
//然而，JavaScript的Array却不会有任何错误。在编写代码时，不建议直接修改Array的大小，访问索引时要确保索引不会越界。
var arr2 = [1, 2, 3];
arr2[5] = 'x';
console.log(arr2); // arr变为[1, 2, 3, undefined, undefined, 'x']

var var1 = 100;
var1 = "xzz"; // 动态语言

var arr3 = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 1, 2, 3];
var aCopy = arr3.slice();
aCopy; // ['A', 'B', 'C', 'D', 'E', 'F', 'G', 1, 2, 3]
aCopy === arr3; // false
console.log(arr3.indexOf(1));


//push pop unshift shift 
console.log("push pop unshift shift ")
var list = [];
list.push('1');
list.push(1);
console.log(list);
list.unshift("xx");
list.unshift("yy");
console.log(list);
list.shift();
list.shift();
console.log(list);


console.log("splice");
//splice()方法是修改Array的“万能方法”，它可以从指定的索引开始删除若干元素，然后再从该位置添加若干元素：

var Arr = ['Microsoft', 'Apple', 'Yahoo', 'AOL', 'Excite', 'Oracle'];
Arr.splice(2, 3, "Baidu");//delete Yahoo AOL Excite, Add Baidu in the position
console.log(Arr);
Arr.splice(2, 1);
console.log(Arr);
Arr.splice(2, 0, "Yahoo", "AOL", "Excite");
console.log(Arr);

//concat()方法把当前的Array和另一个Array连接起来，并返回一个新的Array：
//concat()方法并没有修改当前Array，而是返回了一个新的Array
//实际上，concat()方法可以接收任意个元素和Array，并且自动把Array拆开，然后全部添加到新的Array里：
var ar = [1, 2, 3];
var ar2 = [4, 5, [6, 7]];
ar.concat(ar2);
console.log(ar);//bu bian
ar = ar.concat(ar2);
console.log(ar);
//join()方法是一个非常实用的方法，它把当前Array的每个元素都用指定的字符串连接起来，然后返回连接后的字符串
//如果Array的元素不是字符串，将自动转换为字符串后再连接。
var ss = ar.join(' and ');
console.log(ss);