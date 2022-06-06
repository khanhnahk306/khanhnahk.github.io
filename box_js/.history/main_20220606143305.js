document.addEventListener("click", function (event) {
    const boxElement = document.querySelector(".box");
  
    if(boxElement){
        boxElement.parentElement.removeChild(boxElement);
    }
  
    let box = document.createElement("div");
    box.classList.add("box");
  
    console.log(event);
    box.style.left = `${event.offsetX -50}px`;
    box.style.top = `${event.offsetY -50}px`;

    for(let i=0;i<
  
    document.body.appendChild(box);
  });