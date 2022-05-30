function checkElement(numbers, number) {
  for (let i = 0; i < numbers.length; i++) {
    if (numbers[i] !== number) {
      return false;
    } else return true;
  }
}
checkElement([1, 2, 3, 4, 5, 6], 6);
