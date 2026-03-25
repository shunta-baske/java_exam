
console.log("山口隼汰");


let firstName = "Shunta";
let lastName = "Yamagushi";

console.log(firstName + " " + lastName);


let num1 = 200;
let num2 = 250;
let tax = 0.1;

let subtotal = num1 * 3 + num2 * 4;
let taxTotal = subtotal * tax;
let total = subtotal + taxTotal;

console.log("小計");
console.log(subtotal);
console.log("消費税");
console.log(taxTotal);
console.log("合計金額");
console.log(total);


let testScore = 0;


if(testScore >= 0 && testScore <= 79){
    console.log("追試です");
}else if(testScore >= 80 && testScore <= 100){
    console.log("合格です");
}else{
    console.log("存在しない点数です");
}


let numberTotal = 0;
for(i=1;i<=100;i++){
    numberTotal += i;
}
console.log(numberTotal);


let add = function(x,y){
    let addTotal = x + y;
    return addTotal;
}

let sub = function(x,y){
    let subtotal = x - y;
    return subtotal;
}

let multi = function(x,y){
    let multiTotal = x * y;
    return multiTotal;
}

let div = function(x,y){
    let divTotal = x / y;
    return divTotal;
}


let a = 5;
let b = 3;
console.log( a  + "+" + b + "=" + add(a,b));
console.log( a  + "-" + b + "=" + sub(a,b));
console.log( a  + "*" + b + "=" + multi(a,b));
console.log( a  + "/" + b + "=" + div(a,b));

console.log( 5  + "+" + 3 + "=" + add(5,3));
console.log( 5  + "-" + 3 + "=" + sub(5,3));
console.log( 5  + "*" + 3 + "=" + multi(5,3));
console.log( 5  + "/" + 3 + "=" + div(5,3));
