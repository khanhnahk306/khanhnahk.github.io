//1
function factorial(x){ 
  if (x === 0){
    return 1;
 }
  return x * factorial(x-1);         
}
document.write(factorial(5));

//2
function reverse(s){
  return s.split('').reverse().join('');
}
document.write(reverse("hello"));

//3
function language(s){
  var s = prompt("Nhập: ");
  switch(s){
    case VN:{
      doc.write("Xin chào");
      break;
    }
    case EN:{
      document.write("Hello");
      break;
    }
    default:{
      document.write("Nhập lại: ")
    }
  }
}