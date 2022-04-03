-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: db
-- Thời gian đã tạo: Th4 03, 2022 lúc 11:19 AM
-- Phiên bản máy phục vụ: 8.0.28
-- Phiên bản PHP: 8.0.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `Customer`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `TransactionHistory`
--

CREATE TABLE `TransactionHistory` (
  `id` varchar(50) NOT NULL,
  `id_user` varchar(50) NOT NULL,
  `content` varchar(255) NOT NULL,
  `date` date DEFAULT NULL,
  `account` varchar(255) NOT NULL,
  `money` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `TransactionHistory`
--

INSERT INTO `TransactionHistory` (`id`, `id_user`, `content`, `date`, `account`, `money`) VALUES
('2255', 'user1', 'where', '2022-04-03', 'user3', 100000000),
('4115', 'user2', 'hi', '2022-04-03', 'user3', 150000000),
('4785', 'user1', 'hello', '2022-04-03', 'user2', 50000000),
('7609', 'user3', 'alo alo', '2022-04-03', 'user1', 150000000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `User`
--

CREATE TABLE `User` (
  `id_user` varchar(50) NOT NULL,
  `phoneNumber` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `account` varchar(255) NOT NULL,
  `balance` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `User`
--

INSERT INTO `User` (`id_user`, `phoneNumber`, `password`, `account`, `balance`) VALUES
('user1', '912345678', '123456', 'user1', 100000000),
('user2', '913456789', '1234567', 'user2', 200000000),
('user3', '914345678', '12345678', 'user3', 1100000000);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `TransactionHistory`
--
ALTER TABLE `TransactionHistory`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `User`
--
ALTER TABLE `User`
  ADD PRIMARY KEY (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
