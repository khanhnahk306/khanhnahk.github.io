//Truy cập
const coursesListEl = document.querySelector(".course-list");
const searchEL = document.querySelector(".search-form-input");
const btnSearch = document.querySelector(".search-form-button");
const topicsEl = document.querySelectorAll(".topic-item input");
const idCourse = document.querySelector(".course-list");

//Lấy ID khóa học
var paramsString = new URLSearchParams(window.location.search);
var searchParams = new URLSearchParams(paramsString);
console.log(searchParams.get("id"));


//Lọc khóa học theo hình thức
let param = new URLSearchParams(window.location.search);
let type = param.get("type");
let courseList = [...courses];
if (type) {
    if (type == "onlab") {
        document.title = "Khóa học phòng lab";
        courseList = courses.filter(c => c.type == "onlab");
    } else if (type == "online") {
        document.title = "Khóa học trực tuyến";
        courseList = courses.filter(c => c.type == "online");
    } else {
        window.location.href = "../html/404.html";
    }
} else {
    document.title = "Danh sách khóa học";
}

//Tìm kiếm khóa học theo chủ đề
topicsEl.forEach(input => {
    input.addEventListener("change", function () {
        let topic = input.value;
        filterCoursesByTopics(topic);
    })
})

const filterCoursesByTopics = topic => {
    let coursesFilter = courseList.filter(c => c.topics.includes(topic));
    renderCourses(coursesFilter);
}

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
    let coursesFilter = courseList.filter(c => c.title.toLowerCase().includes(value.toLowerCase()));
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

renderCourses(courseList);