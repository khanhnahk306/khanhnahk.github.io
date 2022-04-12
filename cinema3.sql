CREATE TABLE `Register` (
  `nameOfUser` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `birthday` date NOT NULL,
  `city` varchar(255) NOT NULL,
  `favoriteCinema` varchar(255) NOT NULL
);

ALTER TABLE `Register` ADD PRIMARY KEY (`nameOfUser`);

INSERT INTO `Register` (`nameOfUser`, `phone`, `email`, `password`, `birthday`, `city`, `favoriteCinema`) VALUES
('Dorri Draco', '311-160-5990', 'ddraco0@jalbum.net', 'AE4acL2yF', '2014-04-10', 'Hanoi', 'CGV MAC Palza'),
('Linoel Dyet', '817-303-7023', 'ldyet1@yellowpages.com', 'ZDP47jFmJ', '2015-04-15', 'Ho Chi Minh ', 'CGV Aeon Binh Tan'),
('Nathalia Eddins', '959-286-7938', 'neddins2@independent.co.uk', 'vCyWy6kPECI', '2012-04-24', 'Hanoi', 'CGV Royal City');

CREATE TABLE `SignUp` (
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
);

ALTER TABLE `SignUp` ADD PRIMARY KEY (`email`);

INSERT INTO `SignUp` (`email`, `password`) VALUES
('ddraco0@jalbum.net', 'AE4acL2yF'),
('ldyet1@yellowpages.com', 'ZDP47jFmJ'),
('neddins2@independent.co.uk', 'vCyWy6kPECI');

CREATE TABLE `Film` (
  `nameOfFilm` varchar(255) NOT NULL,
  `director` varchar(255) NOT NULL,
  `cast` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `releaseDate` date NOT NULL,
  `runningTime` int NOT NULL,
  `language` varchar(255) NOT NULL,
  `rated` varchar(255) NOT NULL,
  `movieStatus` varchar(255) NOT NULL
);

ALTER TABLE `Film` ADD PRIMARY KEY (`director`);

INSERT INTO `Film` (`nameOfFilm`, `director`, `cast`, `category`, `releaseDate`, `runningTime`, `language`, `rated`, `movieStatus`) VALUES
('ĐÊM TỐI RỰC RỠ', 'Aaron Toronto', 'Kiến An, Phương Dung, Nhã Uyên, Xuân Trang, Diễm Phương, Kim B', 'Hồi hộp, Tâm Lý', '2022-04-08', 103, 'Tiếng Việt - Phụ đề Tiếng Anh', 'C18', 'Phim đang chiếu'),
('MORBIUS', 'Daniel Espinosa', 'Jared Leto, Michael Keaton, Adria Arjona', 'Hành Động, Phiêu Lưu', '2022-04-01', 104, 'Tiếng Anh - Phụ đề Tiếng Việt', 'C16', 'Phim đang chiếu'),
('SINH VẬT HUYỀN BÍ: NHỮNG BÍ MẬT CỦA DUMBLEDORE', 'David Yates', 'Eddie Redmayne, Mads Mikkelsen, Ezra Miller, Katherine Waterston, Jude Law,…', 'Phiêu Lưu, Thần thoại', '2022-04-08', 143, 'Tiếng Anh - Phụ đề Tiếng Việt', 'C13', 'Phim đang chiếu'),
('NHÍM SONIC 2', 'Jeff Fowler', 'Ben Schwartz, Idris Elba, Jim Carrey, James Marsden, Tika Sumpter', 'Hành Động, Phiêu Lưu', '2022-04-15', 122, 'Tiếng Anh - Phụ đề Tiếng Việt', 'P', 'Phim đang chiếu'),
('TIẾNG “KÊU” CỨU LÚC NỬA ĐÊM', 'Kwon Oh-seung', 'Wi Ha-joon, Jin Ki-joo, Park Hoon, Kim Hye-yoon', 'Hồi hộp', '2022-04-15', 103, 'Tiếng Hàn - Phụ đề tiếng Việt', 'C18', 'Phim sắp chiếu'),
('NGÔI ĐỀN KỲ QUÁI 3', 'Phontharis Chotkijsadarsopon', 'Phiravich Attachitsataporn, Sim Kyutae Pond, Khunnapat Pichetworawut', 'Kinh Dị', '2022-04-15', 100, 'Tiếng Thái - Phụ đề tiếng Việt', 'C18', 'Phim sắp chiếu'),
('JUJUTSU KAISEN 0 - CHÚ THUẬT HỒI CHIẾN', 'Sunghoo Park', 'Hanazawa Kana, Nakamura Yuichi, Uchiyama Koki,…', 'Hoạt Hình, Thần thoại', '2022-04-15', 105, 'Tiếng Nhật - Phụ đề Tiếng Việt', 'C13', 'Phim sắp chiếu');

CREATE TABLE `Booking` (
  `email` varchar(255) NOT NULL,
  `nameOfFilm` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `animation` varchar(255) NOT NULL,
  `nameOfCinema` varchar(255) NOT NULL,
  `timeStart` datetime NOT NULL,
  `room` varchar(10) DEFAULT NULL,
  `seat` varchar(10) NOT NULL
);

ALTER TABLE `Booking` ADD PRIMARY KEY (`nameOfFilm`);

INSERT INTO `Booking` (`email`, `nameOfFilm`, `city`, `animation`, `nameOfCinema`, `timeStart`, `room`, `seat`) VALUES
('neddins2@independent.co.uk', 'ĐÊM TỐI RỰC RỠ', 'Ho Chi Minh', '3D', 'CGV AEON Binh Tan', '2022-04-20 16:02:39', '1', 'D3'),
('neddins2@independent.co.uk', 'NHÍM SONIC 2', 'Hanoi', '2D', 'CGV Royal City', '2022-04-11 16:03:46', '2', 'D5'),
('ldyet1@yellowpages.com', 'SINH VẬT HUYỀN BÍ: NHỮNG BÍ MẬT CỦA DUMBLEDORE', 'Hanoi', '2D', 'CGV MAC Plaza', '2022-04-11 16:00:43', '12', 'E2');

CREATE TABLE `NameOfCinema` (
  `nameOfCinema` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL
);

ALTER TABLE `NameOfCinema` ADD PRIMARY KEY (`nameOfCinema`);

INSERT INTO `NameOfCinema` (`nameOfCinema`, `address`, `city`) VALUES
('CGV AEON Binh Tan', '1 Đường Số 17A, An Lạc, Bình Tân, Thành phố Hồ Chí Minh', 'Ho Chi Minh'),
('CGV AEON Tan Phu', '3 Aeon Mall, 30 Đ. Tân Thắng, Sơn Kỳ, Tân Phú, Thành phố Hồ Chí Minh', 'Ho Chi Minh'),
('CGV MAC Plaza', 'Tầng 7, TTTM Machinco, 10 Trần Phú, P. Mộ Lao, Hà Đông, Hà Nội', 'Hanoi'),
('CGV Royal City', 'TTTM Vincom Mega Mall Royal City, 72A Đ. Nguyễn Trãi, Thượng Đình, Thanh Xuân, Hà Nội', 'Hanoi'),
('CGV Vincom Center Bà Triệu', 'Vincom Center, Tầng 6, 191 Bà Triệu, Lê Đại Hành, Hai Bà Trưng, Hà Nội', 'Hanoi');

SELECT * FROM `Film` WHERE `movieStatus` = 'Phim đang chiếu';

SELECT * FROM `Film` WHERE `movieStatus` = 'Phim sắp chiếu';

SELECT * FROM `NameOfCinema` WHERE `city` = 'Hanoi';

SELECT * FROM `Film` WHERE `nameOfFilm` = 'SINH VẬT HUYỀN BÍ: NHỮNG BÍ MẬT CỦA DUMBLEDORE';

SELECT `email`, `nameOfFilm`, `animation`, `Booking`.`nameOfCinema`, `timeStart`,`address`, `NameOfCinema`.`city`,`room`, `seat` FROM `Booking` 
INNER JOIN `NameOfCinema` ON `Booking`.`nameOfCinema` = `NameOfCinema`.`nameOfCinema` WHERE `Booking`.`email` = 'neddins2@independent.co.uk';