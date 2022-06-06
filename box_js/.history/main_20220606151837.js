let colors = ["#3498db", "#9b59b6", "#e74c3c", "#2c3e50", "#d35400"];
for (let i = 0; i < colors.length; i++) {
  let box = document.createElement("div");
  box.classList.add("box");
  box.style.backgroundColor = colors[i];
  document.body.appendChild(box);
}

const click = document.querySelector("button");
click.onclick = () => {
  for (let i = 0; i < colors.length; i++) {
    let box = document.createElement("div");
    box.classList.add("box");
    box.style.backgroundColor = colors[i];
    document.body.appendChild(box);
  }
};

document.removeEventListener("click", function (event) {
  
});
