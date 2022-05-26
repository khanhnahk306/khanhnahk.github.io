function factorial(x){ 
  if (x === 0){
    return 1;
 }
  return x * factorial(x-1);         
}
document.write(factorial(5));

function reverse(s){
    return s.split('').reverse().join('');
}
document.write