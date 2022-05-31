function randomProduct(arr) {
  let arr2 = new Array();
  for (let i = 0; i < arr.length; i++) {
    arr2.push(arr[Math.floor(Math.random() * arr.length)]);
  }
  return arr2;
  
}

let products5 = [
  {
    name: "Iphone 13 Pro Max",
    price: 3000000,
    brand: "Apple",
    count: 2,
  },
  {
    name: "Samsung Galaxy Z Fold3",
    price: 41000000,
    brand: "Samsung",
    count: 1,
  },
  {
    name: "IPhone 11",
    price: 15500000,
    brand: "Apple",
    count: 1,
  },
  {
    name: "OPPO Find X3 Pro",
    price: 19500000,
    brand: "OPPO",
    count: 3,
  },
];

randomProduct(products5);
console.log()
