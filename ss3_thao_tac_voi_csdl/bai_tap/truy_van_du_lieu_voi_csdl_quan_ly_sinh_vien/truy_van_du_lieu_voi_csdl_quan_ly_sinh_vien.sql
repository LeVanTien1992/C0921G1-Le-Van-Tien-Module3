USE Quan_Ly_Sinh_Vien;
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select *
from student
where StudentName like "h%"; 
-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select *
from class
where month(class.StartDate);
-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select *
from subject
where Credit between 3 and 5; 
-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
update student
set student.ClassId = 2
where student.StudentId = 1;
SELECT * FROM quan_ly_sinh_vien.student;
-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi 
-- (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select S.StudentId, S.StudentName, Sub.SubName, M.Mark
from Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
order by Mark desc ,  S.StudentName desc;