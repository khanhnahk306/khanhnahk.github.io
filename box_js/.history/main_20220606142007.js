function box() {
  let colors = ["#3498db", "#9b59b6", "#e74c3c", "#2c3e50", "#d35400"];
  
  const boxElement = document.querySelector(".box");


  let box = document.createElement("div");
  box.classList.add("circle");

  box.style.left = `${randomNumber(100, 1000)}px`;
  box.style.top = `${randomNumber(100, 1000)}px`;
}
