const suppoterEl = document.querySelector(".supporter");
const renderSuppoters = arr => {
    suppoterEl.innerHTML = "";
    let html = "";
    
}


//Lấy thông tin ID khóa học
let param = new URLSearchParams(window.location.search);
let id = param.get("id");
console.log(id);

