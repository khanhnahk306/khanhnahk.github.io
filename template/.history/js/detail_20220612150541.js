const supporterEl = document.querySelector(".supporter-info");

//Lấy thông tin ID khóa học
let param = new URLSearchParams(window.location.search);
let id = param.get("id");
console.log(id);

//Lấy thông tin khóa học ra màn hình
const getCourse = (id, arr) => {
    return arr.filter((c) => c.id == id)[0];
};

const course = getCourse(id, courses);
console.log(course);


const renderSuppoters = arr => {
    supporterEl.innerHTML = "";
    let html = "";
    for (let i = 0; i < arr.length; i++) {
        const c = arr[i];
        html += `
        `
    }
    supporterEl.innerHTML = html;
}
renderSuppoters(supporters);



