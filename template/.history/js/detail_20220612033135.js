let params = new URLSearchParams(window.location.search);
let id = params.get("id");
console.log(id);


const supporterInfo = document.querySelector(".supporter-info");
supporterInfo.innerHTML =
    `<p>
        <b>Tư vấn viên :</b>
        ${supporter.name}
    </p>
    <p>
        <b>Email :</b>
        ${supporter.email}
    </p>
    <p>
        <b>Số điện thoại :</b>
        ${supporters.phone}
    </p>
    <p>
        <button class="btn btn-primary shadow-sm">Nhận tư vấn</button>
    </p>`;


const courseDescription = document.querySelector('.course-description');
courseDescription.innerHTML = `<p>${course.content}</p>`;