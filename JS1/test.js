//1
function factorial(x) {
  if (x === 0) {
    return 1;
  }
  return x * factorial(x - 1);
}
document.writeln(factorial(5));

//2
function reverse(s) {
  return s.split("").reverse().join("");
}
document.writeln(reverse("hello"));

//3
function language(s) {
  var s = prompt("Nhập: ");
  switch (s) {
    case "VN": {
      document.writeln("Xin chào");
      break;
    }
    case "EN": {
      document.writeln("Hello");
      break;
    }
    default: {
      document.writeln(prompt("Nhập lại: "));
    }
  }
}
console.log(language());

//4
function substring(s) {
  return s.substr(0, 10) + "...";
}
document.writeln(substring("xinchaocacbandenvoiTechmaster"));
