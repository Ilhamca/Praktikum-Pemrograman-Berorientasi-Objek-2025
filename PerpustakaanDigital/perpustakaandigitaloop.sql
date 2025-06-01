-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 01 Jun 2025 pada 10.44
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaandigitaloop`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `ID` int(12) NOT NULL,
  `Judul` varchar(32) NOT NULL,
  `Penulis` varchar(32) NOT NULL,
  `Tahun` int(4) NOT NULL,
  `Alur` int(2) NOT NULL,
  `Bahasa` int(2) NOT NULL,
  `Orisinalitas` int(2) NOT NULL,
  `Rating` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`ID`, `Judul`, `Penulis`, `Tahun`, `Alur`, `Bahasa`, `Orisinalitas`, `Rating`) VALUES
(1, 'a', 'a', 3, 3, 3, 3, 3),
(2, 'aa', 'fgseg', 2020, 2, 4, 3, 2),
(4, '3', 'a', 2, 3, 2, 3, 2),
(6, '10', '10', 5, 5, 5, 5, 5),
(7, '321', '321', 1, 1, 1, 1, 1),
(8, 'heheha', 'huahahhaa', 2012, 10, 7, 1, 8),
(9, '314', '431', 1, 1, 5, 10, 3),
(10, '10', '10', 321, 3, 4, 5, 3),
(11, '10', '10', 1, 1, 1, 1, 1),
(12, '1', '1', 1, 1, 2, 2, 1),
(13, '1', '1', 3, 3, 4, 5, 4),
(14, '1', '1', 3, 4, 3, 3, 3.33333),
(15, 'aa', 'aa', 321, 1, 4, 4, 3),
(16, 'aa', 'aa', 321, 2, 3, 5, 3.33333);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `buku`
--
ALTER TABLE `buku`
  MODIFY `ID` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
