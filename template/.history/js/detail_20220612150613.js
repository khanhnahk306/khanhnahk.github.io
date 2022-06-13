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
        <div class="supporter-info ms-4">
                                <p>
                                    <b>Tư vấn viên :</b>
                                    ${c.name}
                                </p>
                                <p>
                                    <b>Email :</b>
                                    ${c.email}
                                </p>
                                <p>
                                    <b>Số điện thoại :</b>
                                    0987654321
                                </p>
                                <p>
                                    <button class="btn btn-primary shadow-sm">Nhận tư vấn</button>
                                </p>
                            </div>`
    }
    supporterEl.innerHTML = html;
}
renderSuppoters(supporters);



