
const supporterEl = document.querySelector(".supporter");

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

const bcCourseEl = document.querySelector(".breadcrumb .active");
bcCourseEl.innerHTML = course.title;

const courseTitleEl = document.querySelector(".course-title");
courseTitleEl.innerHTML = course.title;

const renderSuppoters = arr => {
    supporterEl.innerHTML = "";
    let html = "";
    for (let i = 0; i < arr.length; i++) {
        const c = arr[i];
        html += `
        <div class="supporter d-flex align-items-center">
            <div class="supporter-image">
                <img src="${c.avatar}" alt="tư vấn viên" class="rounded-circle">
            </div>
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
                    ${c.phone}
                </p>
                <p>
                    <button class="btn btn-primary shadow-sm">Nhận tư vấn</button>
                </p>
            </div>
        </div>`
    }
    supporterEl.innerHTML = html;
}
renderSuppoters(supporters);



