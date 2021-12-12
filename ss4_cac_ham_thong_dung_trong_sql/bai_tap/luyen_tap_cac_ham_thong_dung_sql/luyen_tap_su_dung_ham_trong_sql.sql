USE Quan_Ly_Sinh_Vien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select SubName, SubId, Status, max(Credit) as "Credit lớn nhất"
from subject;
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select SubName, max(Mark) as "Điểm thi lớn nhất"
from subject s join mark m
on s.SubId = m.SubId
group by  SubName, m.Mark;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.StudentName,  avg(m.mark)
from mark m join student s
on m.StudentId = s.StudentId
group by s.StudentName,  m.StudentId
order by s.StudentId desc;