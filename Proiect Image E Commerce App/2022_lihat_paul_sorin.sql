SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;


CREATE TABLE `registerblazerunner` (
  `id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `registerblazerunner` (`id`, `user_id`, `user_name`, `password`, `date`) VALUES
(1, 12, 'Admin', 'lalala', '2023-01-14 23:57:04'),
(2, 12, 'Paul', 'sasasa', '2023-01-16 00:01:07'),
(3, 22, 'Raul', 'sasasa', '2023-01-16 00:03:02'),
(4, 42, 'laad', 'sasasa', '2023-01-16 00:03:02'),
(5, 52, 'Admin2', 'sasasa', '2023-01-16 00:03:02'),
(6, 62, 'doidodi', 'sasasa', '2023-01-16 00:03:02'),
(7, 72, 'WWWWW', 'sasasa', '2023-01-16 00:03:02'),
(8, 82, 'Paul', 'sasasa', '2023-01-16 00:03:02');

CREATE TABLE `search` (
  `id` int(11) NOT NULL,
  `Name` varchar(500) NOT NULL,
  `Description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `search` (`id`, `Name`, `Description`) VALUES
(1, 'first name', 'Description of first name'),
(2, 'second name', 'Description of second name'),
(3, 'third name', 'Description of third name');


ALTER TABLE `registerblazerunner`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `date` (`date`),
  ADD KEY `user_name` (`user_name`),
  ADD KEY `id` (`id`),
  ADD KEY `user_id_2` (`user_id`),
  ADD KEY `user_name_2` (`user_name`),
  ADD KEY `password` (`password`);

ALTER TABLE `search`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `registerblazerunner`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
ALTER TABLE `search`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
