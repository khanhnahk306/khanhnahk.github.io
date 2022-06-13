const courses = [
    {
        id: 1,
        title: "Springboot-Web backend",
        image: "https://media.techmaster.vn/api/static/36/bu7v9ks51co41h2qcttg",
        type: "OnLab",
        rating: 5,
        content: "Spring Boot là một module của Spring Framework giúp giảm tải các cấu hình cho phép xây dựng nhanh chóng một ứng dụng độc lập. Spring Boot cung cấp sẵn các Embedded HTTP servers (Tomcat, Jetty, …), các plugins để phát triển và test một cách dễ dàng",
        topics: ["Backend", "Database"],
        supporterId: 1
    },
    {
        id: 2,
        title: "Thiết kế - Lập trình cơ sở dữ liệu",
        image: "https://media.techmaster.vn/api/static/36/bu7vt2451co5836g4l70",
        type: "OnLab",
        rating: 3,
        content: "Khoá học Thiết kế - Lập trình cơ sở dữ liệu ngắn gọn, cô đọng trong 10 buổi gồm 30% lý thuyết + 70% thực hành, cung cấp cho học viên kiến thức căn bản về cơ sở dữ liệu quan hệ (PostgreSQL / MySQL), có thể áp dụng ngay vào thực tế công việc",
        topics: ["Backend", "Database"],
        supportersId: 2
    },
    {
        id: 3,
        title: "Lập trình iOS Swift căn bản cập nhật 2022",
        image: "https://media.techmaster.vn/api/static/bub3enc51co7s932dsk0/bjxnxQi0",
        type: "OnLab",
        rating: 4.7,
        content: "Swift là một trong những ngôn ngữ đang phát triển mạnh mẽ nhất hiện nay",
        topics: ["Di động", "Database"],
        supporterId: 3
    },
    {
        id: 4,
        title: "Khoá học Lập trình Arduino Scratch cho trẻ em",
        image: "https://media.techmaster.vn/api/static/brbgh4451coepbqoch60/bt3miv451co41h2qcnr0",
        type: "OnLab",
        rating: 4,
        content: "Khoá học lập trình Arduino Scratch phù hợp cho trẻ em từ 08 đến 18 tuổi. Đội ngũ giảng viên Techmaster thiết kế khoá học",
        topics: ["Di động", "Database"],
        supporterId: 1
    },
    {
        id: 5,
        title: "Java căn bản",
        image: "https://media.techmaster.vn/api/static/bub3enc51co7s932dsk0/ZuedW7J1",
        type: "Online",
        rating: 5,
        content: "Khoá học “Java căn bản” 16 buổi dành cho người mới bắt đầu học lập trình. Nó được thiết kế dễ hiểu, trực quan, gồm nhiều ví dụ code minh hoạ ngắn phù hợp với mọi đối tượng học viên nhập môn lập trình",
        topics: ["Backend", "Database"],
        supporterId: 2
    },
    {
        id: 6,
        title: "Java cấu trúc dữ liệu - giải thuật",
        image: "https://media.techmaster.vn/api/static/36/bu7v5ak51co41h2qctt0",
        type: "online",
        rating: 5,
        content: "Khoá học “Java cấu trúc dữ liệu - giải thuật” dành cho sinh viên đã học lớp Java căn bản hay học Java tại trường đại học. Khoá học này tập trung dạy các cấu trúc dữ liệu phổ biến và các loại thuật toán: tìm kiếm, sắp xếp, set, dictionary, băm, cây, đồ thị. Hầu hết các bài tập được tuyển chọn từ kho LeetCode nơi Google, Facebook Microsoft sử dụng để ra đề thi tuyển dụng",
        topics: ["Backend", "Database"],
        supporterId: 3
    }
]

const supporters = [
    {
        id: 1,
        name: "Phạm Mẫn",
        email: "manpham@techmaster.vn",
        phone: "0963023185",
        avatar: "https://media.techmaster.vn/api/static/crop/bv9jp4k51co7nj2mhht0"
    },
    {
        id: 2,
        name: "Hương Thanh",
        email: "huong@techmaster.vn",
        phone: "0382416368",
        avatar: "https://media.techmaster.vn/api/static/crop/brm3huc51co50mv77sag"
    },
    {
        id: 3,
        name: "Đức Thịnh",
        email: "thinh@techmaster.vn",
        phone: "0987273764",
        avatar: "https://media.techmaster.vn/api/static/c2m5ou451cob24f6skeg/ccjlg0NC"
    },
]