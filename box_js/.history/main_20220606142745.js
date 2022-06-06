function drawSquare() {
    const squareElement = document.querySelector(".box");
    if (squareElement) {
      squareElement.parentElement.removeChild(squareElement);
    }
  
    let square = document.createElement("div");
    square.classList.add("box");
  
    square.style.left = `${randomNumber(100, 1000)}px`;
    square.style.top = `${randomNumber(100, 1000)}px`;
  
    document.body.appendChild(square);
  }
