//Truy cập
const coursesListEl = document.querySelector(".course-list");
const searchEL = document.querySelector(".search-form-input");
const btnSearch = document.querySelector(".search-form-button");

//Tìm kiếm khóa học theo tên
searchEL.addEventListener("keydown", function(e){
    if(e.keyCode ==13)
})

//Hiển thị dnah sách khóa học
const renderCourses = arr => {
    coursesListEl.innerHTML = "";
    let html = "";
    for (let i = 0; i < arr.length; i++) {
        const c = arr[i];
        html += `
    <div class="col-md-4">
        <a href="../html/detail.html?id=${c.id}">
            <div class="course-item shadow-sm rounded mb-4">
                <div class="course-item-image">
                    <img src="${c.image}"
                        alt="${c.title}" />
                </div>
                <div class="course-item-info p-3">
                    <h2 class="fs-5 mb-4 text-dark">
                        ${c.title}
                    </h2>
                    <div
                        class="d-flex justify-content-between align-items-center fw-light text-black-50">
                        <p class="type">${c.type}</p>
                        <p class="rating">
                            ${c.rating}
                            <span class="text-warning"><i class="fa-solid fa-star"></i></span>
                        </p>
                    </div>
                </div>
            </div>
        </a>
    </div>`
    }
    coursesListEl.innerHTML = html;
}

renderCourses(courses);