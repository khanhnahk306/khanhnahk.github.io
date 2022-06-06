let colors = ["#3498db", "#9b59b6", "#e74c3c", "#2c3e50", "#d35400"];
for (let i = 0; i < colors.length; i++) {
  let boxes = document.createElement("div");
  boxes.classList.add("box");
  boxes.style.backgroundColor = colors[i];
  document.body.appendChild(boxes);
}

const click = document.querySelector("button");
click.onclick = () => {
  for (let i = 0; i < colors.length; i++) {
    let boxes = document.createElement("div");
    boxes.classList.add("box");
    boxes.style.backgroundColor = colors[i];
    document.body.appendChild(boxes);
  }
};
