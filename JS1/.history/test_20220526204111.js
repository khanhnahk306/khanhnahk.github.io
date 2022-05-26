//1
function factorial(x) {
  if (x === 0) {
    return 1;
  }
  return x * factorial(x - 1);
}
console.log(factorial(5));

//2
function reverse(s) {
  return s.split("").reverse().join("");
}
console.log(reverse("hello"));

//3
function language(s) {
  var s = prompt("Nhập: ");
  switch (s) {
    case "VN": {
      document.write("Xin chào");
      break;
    }
    case "EN": {
      document.write("Hello");
      break;
    }
    default: {
      document.write(prompt("Nhập lại: "));
    }
  }
}
console.log(language());