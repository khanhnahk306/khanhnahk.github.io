const courseTitleEl = document.querySelector(".course-title");
const breadcrumbCourseEl = document.querySelector(".breadcrumb");
const courseDescription = document.querySelector(".course-description");
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

//Thay đổi dữ liệu trên trang detail
breadcrumbCourseEl.innerHTML = course.title;
courseTitleEl.innerHTML = course.title;

const renderSuppoters = arr => {
    supporterEl.innerHTML = "";
    let html = "";
    for (let i = 0; i < arr.length; i++) {
        const c = arr[i];
        if(cou)
    }
    supporterEl.innerHTML = html;
}
renderSuppoters(supporters);

