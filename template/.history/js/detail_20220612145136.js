const suppoterEl = document.querySelector(".supporter");
const renderSuppoters = arr => {
    suppoterEl.innerHTML = "";
    let html = "";
    for (let i = 0; i < arr.length; i++) {
        const c = arr[i];
        html += `
        <div class="supporter d-flex align-items-center">
                            <div class="supporter-image">
                                <img src="https://media.techmaster.vn/api/static/crop/bv9jp4k51co7nj2mhht0"
                                    alt="tư vấn viên" class="rounded-circle">
                            </div>
                            <div class="supporter-info ms-4">
                                <p>
                                    <b>Tư vấn viên :</b>
                                    Phạm Thị Mẫn
                                </p>
                                <p>
                                    <b>Email :</b>
                                    manpham@gmail.com
                                </p>
                                <p>
                                    <b>Số điện thoại :</b>
                                    0987654321
                                </p>
                                <p>
                                    <button class="btn btn-primary shadow-sm">Nhận tư vấn</button>
                                </p>
                            </div>
                        </div>`
    }
}


//Lấy thông tin ID khóa học
let param = new URLSearchParams(window.location.search);
let id = param.get("id");
console.log(id);


