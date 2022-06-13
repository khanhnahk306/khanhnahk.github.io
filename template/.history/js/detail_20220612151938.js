const courseTitleEl = document.querySelector(".course-title");
const breadcrumbCourseEl = document.querySelector(".breadcrumb");
const courseDescription = document.querySelector(".course-description");
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

//Thay đổi dữ liệu trên trang detail
breadcrumbCourseEl.innerHTML = course.title;
courseTitleEl.innerHTML = course.title;
courseDescription.innerHTML = `<p>${courses.content}</p>`;

const renderSuppoters = arr => {
    supporterEl.innerHTML = "";
    let html = "";
    html += `
            <div class="supporter-info ms-4">
                <p>
                    <b>Tư vấn viên :</b>
                    ${supporters.name}
                </p>
                <p>
                    <b>Email :</b>
                    ${supporters.email}
                </p>
                <p>
                    <b>Số điện thoại :</b>
                    ${supporters.phone}
                </p>
                <p>
                    <button class="btn btn-primary shadow-sm">Nhận tư vấn</button>
                </p>
            </div>
        </div>`

    supporterEl.innerHTML = html;
}
renderSuppoters(supporters);



