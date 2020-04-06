CREATE DATABASE IF NOT EXISTS testhibernate
DEFAULT CHARSET utf8mb4 COLLATE utf8mb4_unicode_ci;
SET FOREIGN_KEY_CHECKS = 0;
use testhibernate;
CREATE TABLE IF NOT EXISTS `students` (
    `id` INT AUTO_INCREMENT,
    `name` VARCHAR(10) NULL,
    PRIMARY KEY (`id`)
) DEFAULT CHARSET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `marks` (
    `id` INT AUTO_INCREMENT,
    `value`  INT UNIQUE ,
    PRIMARY KEY (`id`)
) DEFAULT CHARSET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `students_marks` (
   `student_id` INT NOT NULL ,
    `mark_id` INT NOT NULL,
   PRIMARY KEY (student_id, mark_id),
    CONSTRAINT FOREIGN KEY (student_id)
     REFERENCES students (id)
    ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT  FOREIGN KEY (mark_id )
    REFERENCES marks (id)
    ON DELETE NO ACTION ON UPDATE NO ACTION
) DEFAULT CHARSET utf8mb4 COLLATE utf8mb4_unicode_ci;

INSERT INTO marks (value)
VALUES
(3), (4), (5);
