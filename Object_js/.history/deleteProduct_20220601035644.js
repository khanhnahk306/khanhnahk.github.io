function deleteProduct(arr) {
    let arr2 = new Array();
    for (let i = 0; i < arr.length; i++) {
      if (arr[i].brand !== "Samsung") {
          arr2.push(arr[i]);
      }
    }
    console.log(arr2);
  }
  