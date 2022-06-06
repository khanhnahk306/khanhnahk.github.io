function box() {
  let colors = ["#3498db", "#9b59b6", "#e74c3c", "#2c3e50", "#d35400"];
  
  const boxEle = document.querySelector(".box");


  let circle = document.createElement("div");
  circle.classList.add("circle");

  circle.style.left = `${randomNumber(100, 1000)}px`;
  circle.style.top = `${randomNumber(100, 1000)}px`;
}
