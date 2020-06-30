//JavaScript的默认对象表示方式{}可以视为其他语言中的Map或Dictionary的数据结构，即一组键值对。

//但是JavaScript的对象有个小问题，就是键必须是字符串。但实际上Number或者其他数据类型作为键也是非常合理的。

//为了解决这个问题，最新的ES6规范引入了新的数据类型Map。
'use strict'

//初始化Map需要一个二维数组，或者直接初始化一个空Map。
var M1 = new Map([['A', 1], ['B', 2], ['C', 3], [1, 'A']]);
console.log(M1.get('A'));
console.log(M1.get(1));
M1.delete('A');
console.log(M1.get('A'));
console.log(M1.has('A'));

var M2 = new Map();
M2.set(13, '22');
console.log(M2.get(13));

//Set

var s = new Set([1, 2, 3, 4, 3, 2, '1']);
console.log(s.size);
console.log(s.has(1));
s.add('2');
console.log(s.has('2'));