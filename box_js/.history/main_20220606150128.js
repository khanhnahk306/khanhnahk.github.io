
function boxSquare() {

  for (let i = 0; i < colors.length; i++) {
    let box = document.createElement("div");
    box.classList.add("box");
    box.style.backgroundColor = colors[i];
    document.body.appendChild(box);
  }
}

const click = document.querySelector("btn");
click.onclick = () => {};
