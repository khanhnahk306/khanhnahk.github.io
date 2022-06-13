const supporterEl = document.querySelector(".supporter");
const renderSuppoters = arr => {
    supporterEl.innerHTML = "";
    let html = "";
    for (let i = 0; i < arr.length; i++) {
        const c = arr[i];
        html += `
        <div class="supporter d-flex align-items-center">
                            <div class="supporter-image">
                                <img src="${c.avatar}"
                                    alt="tư vấn viên" class="rounded-circle">
                            </div>
                            <div class="supporter-info ms-4">
                                <p>
                                    <b>Tư vấn viên :</b>
                                    ${c.name}
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
    }
    supporterEl.innerHTML = html;
}
console.log(supporters);


//Lấy thông tin ID khóa học
let param = new URLSearchParams(window.location.search);
let id = param.get("id");
console.log(id);


