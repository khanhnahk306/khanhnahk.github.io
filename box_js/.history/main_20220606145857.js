let colors = ["#3498db", "#9b59b6", "#e74c3c", "#2c3e50", "#d35400"];

const boxElement = document.querySelector(".box");

for (let i = 0; i < colors.length; i++) {
  let box = document.createElement("div");
  box.classList.add("box");

  box.style.backgroundColor = colors[i];

  document.body.appendChild(box);
}

const click = document.querySelector("btn");
click.onclick = () => {
    if (password.type == "password") {
      password.type = "text";
      show.innerText = "Hide";
    } else {
      password.type = "password";
      show.innerText = "Show";
    }
  };
