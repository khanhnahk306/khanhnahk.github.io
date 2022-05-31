function sortByCount(arr) {
    arr.sort(function (a, b) {
        return b.price - a.price;
      });
}