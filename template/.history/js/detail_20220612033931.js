let params = new URLSearchParams(window.location.search);
let id = params.get("id");
console.log(id);

const bcCourseEl = document.querySelector(".breadcrumb .active");
bcCourseEl.innerHTML = course.title;
