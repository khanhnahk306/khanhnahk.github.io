//Truy cập
const coursesListEl = document.querySelector(".course-list");
const searchEL = document.querySelector(".search-form-input");
const btnSearch = document.querySelector(".search-form-button");
const topicsEl = document.querySelectorAll(".topic-item input");

//Tìm kiếm khóa học theo chủ đề
topicsEl.forEach(input => {
    input.a
})

//Tìm kiếm khóa học theo tên
searchEL.addEventListener("keydown", function (e) {
    if (e.keyCode == 13) {
        let value = e.target.value;
        if (value == "") {
            alert("Nội dung tìm kiếm không được để trống");
            return;
        }
        //Lọc khóa học và hiển thị
        filterCoursesByTitle(value);
    }
});

//Tìm kiếm khóa học theo button
btnSearch.addEventListener("click", function () {
    let value = searchEL.value;
    if (value == "") {
        alert("Nội dung tìm kiếm không được để trống");
        return;
    }
    //Lọc khóa học và hiển thị
    filterCoursesByTitle(value);
});

const filterCoursesByTitle = value => {
    let coursesFilter = courses.filter(c => c.title.toLowerCase().includes(value.toLowerCase()));
    renderCourses(coursesFilter);
}

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