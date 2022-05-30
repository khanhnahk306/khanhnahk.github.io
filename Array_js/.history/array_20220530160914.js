function checkElement(numbers, number) {
  for (let i = 0; i < numbers.length; i++) {
    if (numbers[i] !== number) {
      return false;
    } else return true;
  }
}
checkElement([1, 2, 3, 4, 5, 6], 6);

function getElement(numbers1, number1) {
  let arr = new Array();
  for (let i = 0; i < numbers1.length; i++) {
    if (numbers[i] > number1) {
      arr.push(numbers1[i]);
    }
  }
  console.log(arr);
}
getElement([1, 2, 3, 4, 5, 6], 4);
