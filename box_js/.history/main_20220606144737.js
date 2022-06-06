let colors = ["#3498db", "#9b59b6", "#e74c3c", "#2c3e50", "#d35400"];

document.addEventListener("click", function (event) {
  const boxElement = document.querySelector(".box");

  if (boxElement.cli) {
    boxElement.parentElement.removeChild(boxElement);
  }
  for (let i = 0; i < colors.length; i++) {
    let box = document.createElement("div");
    box.classList.add("box");

    console.log(event);
    box.style.backgroundColor = colors[i];

    document.body.appendChild(box);
  }
});
