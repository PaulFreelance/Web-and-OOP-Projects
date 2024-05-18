SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;


CREATE TABLE `periods` (
  `id` int(255) NOT NULL,
  `user_id` int(255) NOT NULL,
  `name` varchar(100) NOT NULL,
  `lastlogin` timestamp(5) NOT NULL DEFAULT CURRENT_TIMESTAMP
) ;

INSERT INTO `periods` (`id`, `user_id`, `name`, `lastlogin`) VALUES
(1, 1, 'Admin', '2023-01-09 22:00:00.00000'),
(2, 2, 'Admin', '2023-01-09 22:00:00.00000'),
(3, 3, 'Admin2', '2023-01-09 22:00:00.00000'),
(4, 4, 'Admin3', '2023-01-09 22:00:00.00000'),
(5, 5, 'Admin4', '2023-01-09 22:00:00.00000'),
(6, 6, 'Admin5', '2023-01-09 22:00:00.00000');

CREATE TABLE `user_form` (
  `id` int(255) NOT NULL,
  `email` varchar(500) NOT NULL,
  `password` varchar(100) NOT NULL,
  `user_id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `user_form` (`id`, `email`, `password`, `user_id`) VALUES
(1, 'admin@gmail.com', 'aall', 1),
(2, 'ad@gmail.com', 'aall', 2),
(3, 'a@gmail.com', 'aall', 3),
(4, 'd@gmail.com', 'aall', 4),
(5, 'm@gmail.com', 'aall', 5),
(6, 'i@gmail.com', 'aall', 6),
(7, 'n@gmail.com', 'aall', 0),
(8, 'n@gmail.com', 'aall', 7);


ALTER TABLE `user_form`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `periods`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT;
ALTER TABLE `user_form`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
